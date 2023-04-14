package Bank;

import java.util.Scanner;

public class Menu {
	 
	public static Scanner inputScanner = new Scanner(System.in);
	public static userInputs input = new userInputs();
	public static Users usersObj = new Users();
	
	public static void main(String[] args) {
		selectedOptions();
	}
	
	public static void firstMenu() {
		System.out.println("[1]: Register Account");
		System.out.println("[2]: Login");
		System.out.println("[3]: Exit");
	}
	
	public static void isLoginMenu() {
		System.out.println("[1]: Check Balance");
		System.out.println("[2]: Deposit Funds");
		System.out.println("[3]: Withdraw Funds");
		System.out.println("[4]: Transfer Funds");
		System.out.println("[5]: View Transaction History");
		System.out.println("[6]: Exit");
	}
	
	public static void selectedOptions() {
	    boolean performAnotherTransaction = false;
	    do {
	        try {
	        	firstMenu();
	            input.userOption();
	            switch (input.choice) {
	                case 1:
	                    CreateAccount();
	                    break;
	                case 2:
	                    Login();
	                    break;
	                default:
	                    System.out.println("Invalid choice!");
	                    break;
	            }
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	        System.out.print("Do you want to perform another transaction? (y/n)");
	        String answer = inputScanner.next();
	        performAnotherTransaction = answer.equalsIgnoreCase("y");
	    } while (performAnotherTransaction);
	}
	
	public static void CreateAccount() {
		System.out.print("Enter First Name: ");
		String fname = inputScanner.next();
		System.out.print("Enter Last name: ");
		String lname = inputScanner.next();
		System.out.print("Enter Email: ");
		String email = inputScanner.next();
		System.out.print("Enter Phone Number (+63): ");
		int phone = inputScanner.nextInt();
		System.out.print("Ente username: ");
		String username = inputScanner.next();
		System.out.print("Enter password: ");
		String password = inputScanner.next();
		
		usersObj.Register(new User(fname, lname, email, phone, username, password));
	
		
		
	}
	
	public static void Login() {
		System.out.print("Enter username: ");
		String username = inputScanner.next();
		inputScanner.nextLine();
		System.out.print("Enter password: ");
		String password = inputScanner.nextLine();
		
		if (usersObj.isLogin(username, password)) {
			isLoginMenu();
		}else {
			System.out.println("Invalid Credencials");
		}
		
		
		
		
	}


}
