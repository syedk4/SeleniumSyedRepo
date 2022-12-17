package week3.day1.Assignment4;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Student ID:" + id);
		
	}
	
	
public void getStudentInfo(int id, String studentname) {
	System.out.println("Student ID:" + id);
	System.out.println("Student Name:" + studentname);
		
	}

public void getStudentInfo(String eamil, int phone ) {
	
	
	System.out.println("Student Email:" + eamil);
	System.out.println("Student Phone:" + phone);
}

	
	
	 public static void main(String[] args) {
		 
		 Students callstudents = new Students();
		 callstudents.getStudentInfo(123444);
		 callstudents.getStudentInfo(123444, "Syed");
		 callstudents.getStudentInfo("syed@email.com", 1234567890);
	 }
	
}


