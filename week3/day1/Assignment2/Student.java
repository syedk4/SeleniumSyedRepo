package week3.day1.Assignment2;

public class Student extends Department {
public void studentName() {
		
		System.out.println("SYED");
	}

public void studentDept() {
	
	System.out.println("Computer Science");
}

public void studentId() {
	
	System.out.println("23332");
}

public static void main(String[] args) {
	
	Student call = new Student();
	
	call.collegeName();
	call.collegeCode();
	call.collegeRank();
	call.deptName();
	
	
	
	
}


}
