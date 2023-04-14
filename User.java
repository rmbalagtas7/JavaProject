package Bank;

class User {
	
	private String username, password;
	private String firstName, lastName, email;
	private int phoneNum;
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPass() {
		return password;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPass(String password) {
		this.password = password;
	}
	
	
	//registration
	 public User(String firstName, String lastName, String email, int phone, String username, String password) {
	     this.firstName = firstName;
	     this.lastName = lastName;
	     this.email = email;
	     this.phoneNum = phone;
	     this.username = username;
	     this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
}
