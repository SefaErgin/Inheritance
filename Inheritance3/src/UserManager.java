
public class UserManager {

	public void logIn(User user) {
		System.out.println(user.getFirstName() + " adl� kullan�c� giri� yapt�.");
	}
	
	public void logOut(User user) {
		System.out.println(user.getFirstName() + " adl� kullan�c� ��k�� yapt�.");
	}
}