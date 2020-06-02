package P2_Directory_Management_System_Phase_II;

import java.util.ArrayList;

public class Personnel extends PersonnelFactory{

	public ArrayList<Person> personList;

	public Personnel() {
	   personList = new ArrayList<Person>();
	}

	public ArrayList<Person> getPersonList(){
		return personList;
	}

	public void addPersonnel(Person p) {
		personList.add(p);
	}
}