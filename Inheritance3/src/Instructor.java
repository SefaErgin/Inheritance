
public class Instructor extends User{
	private int instructorNumber;
	private String[] courseName;

	public Instructor(int id, String firstName, String lastName, String eMail, String passWord, String[] courseName) {
		super(id, firstName, lastName, eMail, passWord);
		this.courseName = courseName;
	}
	
	public Instructor() {
		
	}

	public String[] getCourseName() {
		return courseName;
	}

	public void setCourseName(String[] courseName) {
		this.courseName = courseName;
	}
}

