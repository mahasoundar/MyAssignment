package wwek3.day1assignment;



public class Student1 {
        public void getStudentInfo() {
			System.out.println("StudentInfo");
		}
        public int getStudentInfo(int id) {
			return id;
		}
        public String getStudentInfo(int id,String name) {
			return (id+","+name);
        }
        
        public String getStudentInfo(String email){
        	return email;
}
        public String getStudentInfo(String email,String phoneNumber) {
        	return(email+","+phoneNumber);
        } 	
        	 public static void main(String[] args) {
        		 Student1 obj=new Student1();
        		 obj.getStudentInfo();
        		 System.out.println(obj.getStudentInfo(12,"Mahalakshmi"));
        		System.out.println( obj.getStudentInfo("lakshmimaga08@gmail.com","9786623119"));
        		
        	
        	
        	
        	
        	
        }
}