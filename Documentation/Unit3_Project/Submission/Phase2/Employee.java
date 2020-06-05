package P2_Directory_Management_System_Phase_II;

public class Employee extends Person {
	private int empID;
	private double baseSalary;
	private String personnelType;

	public Employee(String personneltype, String last, String first, String middle, int id, double sal) {
		super(last, first, middle);
		empID = id;
		baseSalary = sal;
		personnelType = personneltype;
	}

	public int getID() {
		return empID;
	}
}
