package taskManagement;
import java.time.LocalDate;

public class Main {
	public static void main(String[]args){
		//Create tasks
		Task task1=new Task("Completeassignment","Finish the programming assignment\"",LocalDate.now().plusDays(5),1);
		Task task2=new Task("Buygroceries","Purchasefruits and vegetables",LocalDate.now().plusDays(2),2);
		Task task3=new Task("StudyAssignment","Studyand Complete the givne assignment\"",LocalDate.now().plusDays(2),2);
		Task task4=new Task("Cleantheroom","Wipeand arrange the items in room",LocalDate.now().plusDays(2),2);



		}

}
