package P2_Directory_Management_System;

import java.util.*;
public class Personnel {

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