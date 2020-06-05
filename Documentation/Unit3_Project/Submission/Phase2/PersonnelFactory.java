package P2_Directory_Management_System_Phase_II;

public class PersonnelFactory {
    public Person createPersonnel(String PersonnelType, String firstN, String middleN, String lastN, int empID, double salary) {
        Employee employee = new Employee(PersonnelType, lastN, firstN, middleN, empID, salary);
        return employee;
    }
    public Person createPerson(String lastN, String firstN) {
        Person person = new Person(lastN, firstN, "");
        return person;
    }
}
