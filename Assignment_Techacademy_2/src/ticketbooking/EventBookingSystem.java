package ticketbooking;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

	// Event class to represent each event with available tickets
	class Event {
	    private String eventName;
	    private int totalTickets;
	    private int ticketsBooked;
	    private final Lock lock; // Lock for this event to ensure thread safety

	    public Event(String eventName, int totalTickets) {
	        this.eventName = eventName;
	        this.totalTickets = totalTickets;
	        this.ticketsBooked = 0;
	        this.lock = new ReentrantLock();
	    }

	    public String getEventName() {
	        return eventName;
	    }

	    public int getTotalTickets() {
	        return totalTickets;
	    }

	    public int getTicketsBooked() {
	        return ticketsBooked;
	    }

	    // Method to book tickets atomically
	    public boolean bookTickets(int numTickets) {
	        lock.lock(); // Acquire lock for thread safety
	        try {
	            if (numTickets <= totalTickets - ticketsBooked) {
	                ticketsBooked += numTickets;
	                return true;
	            }
	            return false;
	        } finally {
	            lock.unlock(); // Release the lock
	        }
	    }

	    // Method to cancel tickets
	    public void cancelTickets(int numTickets) {
	        lock.lock(); // Acquire lock for thread safety
	        try {
	            ticketsBooked -= numTickets;
	        } finally {
	            lock.unlock(); // Release the lock
	        }
	    }

	    // Method to get available tickets
	    public int getAvailableTickets() {
	        return totalTickets - ticketsBooked;
	    }
	}

	// EventBookingSystem class to manage events and bookings
	public class EventBookingSystem {
	    private Map<String, Event> eventMap;

	    public EventBookingSystem() {
	        eventMap = new HashMap<>();
	    }

	    // Method to add an event
	    public synchronized void addEvent(String eventName, int totalTickets) {
	        if (!eventMap.containsKey(eventName)) {
	            eventMap.put(eventName, new Event(eventName, totalTickets));
	            System.out.println("Event '" + eventName + "' added with " + totalTickets + " tickets.");
	        } else {
	            System.out.println("Event '" + eventName + "' already exists.");
	        }
	    }

	    // Method to book tickets for an event
	    public boolean bookTickets(String eventName, int numTickets) {
	        Event event = eventMap.get(eventName);
	        if (event != null) {
	            return event.bookTickets(numTickets);
	        }
	        return false;
	    }

	    // Method to cancel tickets for an event
	    public void cancelTickets(String eventName, int numTickets) {
	        Event event = eventMap.get(eventName);
	        if (event != null) {
	            event.cancelTickets(numTickets);
	            System.out.println(numTickets + " tickets cancelled for event: " + eventName);
	        }
	    }

	    // Method to display available tickets for all events
	    public void displayAvailableTickets() {
	        System.out.println("Available tickets for each event:");
	        for (Event event : eventMap.values()) {
	            System.out.println(event.getEventName() + ": " + event.getAvailableTickets());
	        }
	    }

	    public static void main(String[] args) {
	        EventBookingSystem bookingSystem = new EventBookingSystem();

	        // Adding events
	        bookingSystem.addEvent("Concert", 100);
	        bookingSystem.addEvent("Theatre Play", 50);

	        // Simulating booking scenarios
	        Runnable bookingTask1 = () -> {
	            boolean booked1 = bookingSystem.bookTickets("Concert", 3);
	            if (booked1) {
	                System.out.println("Booked 3 tickets for Concert");
	            } else {
	                System.out.println("Failed to book tickets for Concert");
	            }

	            boolean booked2 = bookingSystem.bookTickets("Theatre Play", 2);
	            if (booked2) {
	                System.out.println("Booked 2 tickets for Theatre Play");
	            } else {
	                System.out.println("Failed to book tickets for Theatre Play");
	            }
	        };

	        Runnable bookingTask2 = () -> {
	            boolean booked1 = bookingSystem.bookTickets("Concert", 5);
	            if (booked1) {
	                System.out.println("Booked 5 tickets for Concert");
	            } else {
	                System.out.println("Failed to book tickets for Concert");
	            }

	            boolean booked2 = bookingSystem.bookTickets("Theatre Play", 3);
	            if (booked2) {
	                System.out.println("Booked 3 tickets for Theatre Play");
	            } else {
	                System.out.println("Failed to book tickets for Theatre Play");
	            }
	        };

	        Thread thread1 = new Thread(bookingTask1);
	        Thread thread2 = new Thread(bookingTask2);

	        thread1.start();
	        thread2.start();

	        // Wait for threads to finish
	        try {
	            thread1.join();
	            thread2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Display available tickets after bookings
	        bookingSystem.displayAvailableTickets();
	    }
	}


