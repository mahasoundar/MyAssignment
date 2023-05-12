package wwek3.day1assignment;



public class Student extends Department {

	public void studentName() {
		System.out.println("Student Name");
	}	
	public void studentDept() {	
		System.out.println("Student Department");
	}
	public void studentId() {
	    System.out.println("Student Id");
		}         
	public static void main(String[] args) {
		Student obj=new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collgeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
	    obj.studentId();
	
	}
	
}
