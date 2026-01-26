package class1;

public class EX07_13 {
	public static void main(String[] args) {
		System.out.println(Student.schoolName);
		Student.goToSchool();
		
		Student stu1 = new Student();
		stu1.studentName = "김고이";
		stu1.hello(); 
		
		System.out.println();
	}
}
