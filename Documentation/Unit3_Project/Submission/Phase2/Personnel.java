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

	public int checkPerson(String firstN, String lastN){
		for(int index =0; index <personList.size(); index++) {
			if(personList.get(index).getFirst().equals(firstN) && personList.get(index).getLast().equals(lastN)) {
				return index;
			}
		}
		return -1;
	}
}