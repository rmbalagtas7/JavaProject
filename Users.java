package Bank;
import java.util.ArrayList;

class Users {
	public static ArrayList<User> users = new ArrayList<User>();
	
	public boolean isLogin(String username, String password) {
		boolean retLogin = false;
		for (User user : users) {
			if (user.getUsername().equals(username)&& user.getPass().equals(password)) {
				retLogin = true;
			}
		}
		return retLogin;
	}
	
	public void Register(User newUser) {
		users.add(newUser);
	}
	
	public int UsersLength() {
		return users.size();
	}
	
	

}
