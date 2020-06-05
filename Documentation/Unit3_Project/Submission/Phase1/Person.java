package P2_Directory_Management_System_Phase_I;

public class Person {
	private String last;
	private String first;
	private String middle;

	public Person(String last, String first, String middle) {
		this.last = last;
		this.first = first;
		this.middle = middle;
	}
	public String getFirst(){
		return first;
	}

	public String getLast(){
		return last;
	}

	//FIXME: Control coupling
//	public void printName(int order) {
//		if(order == 0) {
//			System.out.println(first + "  " + middle + "  " + last);
//		}
//		else if(order == 1) {
//			System.out.println(last + " ," + middle + " " + first);
//		}
//		else if(order == 2) {
//			System.out.println(last + " ," + first + " " + middle);
//		}
//	}

	public void printName0(){
		System.out.println(first + "  " + middle + "  " + last);
	}
	public void printName1(){
		System.out.println(first + " ," + last + " " + middle);
	}
	public void printName2(){
		System.out.println(last + " ," + first + " " + middle);
	}

}
