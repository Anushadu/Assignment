
public class Employee {


    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public double calculateYearlyBonus() {
        return salary * 0.10;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
  public boolean equals(Object o) {
    	return false;
    }

    @Override
    public int hashCode() {
    		return id;
       
    }

	public void setSalary(double salary2) {
		// TODO Auto-generated method stub
		
	}
}

