
public class Main {

	public static void main(String[] args) {
		
		
		
Student student1 = new Student(1, "Sefa", "Ergin", "sefa@sefa.com", "1234", "12345678900");
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("Enes");
		student2.setLastName("Ergin");
		student2.seteMail("enes@enes.com");
		student2.setPassWord("987654");
		student2.setCreditCardNo("98765432100");
		
		String[] courseName = {"C#", "Java", "Pyhton"};
		Instructor instructor1 = new Instructor(1,"Engin", "Demirog","engin@engin.com", "852456", courseName);
		
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		System.out.println("*********************************************************************");
		
		studentManager.logIn(student1);
		studentManager.logIn(student2);
		instructorManager.logIn(instructor1);
		
		System.out.println("*********************************************************************");
		
		studentManager.addCourse(student1, courseName[0]);
		studentManager.addCourse(student2, courseName[1]);
		
		System.out.println("*********************************************************************");
		
		instructorManager.createCourse(instructor1, courseName[2]);
		
		instructorManager.updateCourse(instructor1, courseName[1]);
		
		instructorManager.removeCourse(instructor1, courseName[2]);
		System.out.println("*********************************************************************");
	}
}
