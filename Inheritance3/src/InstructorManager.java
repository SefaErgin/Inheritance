
public class InstructorManager extends UserManager {
	
	public void createCourse(Instructor instructor, String courseName) {
		System.out.println(instructor.getFirstName()+ " " + courseName + " adlı eğitmen kursunu oluşturdu.");
	}
	
	public void updateCourse(Instructor instructor, String courseName) {
		System.out.println(instructor.getFirstName() + " " + courseName + " adlı eğitmen kursunu güncellendi.");
	}
	
	public void removeCourse(Instructor instructor, String courseName) {
		System.out.println(instructor.getFirstName() + " " + courseName + " adlı eğitmen kursunu sildi.");
	}

}
