package Bank;

import java.util.InputMismatchException;

class userInputs {
	public int choice;
	Menu menuObj = new Menu();
	public static boolean isError = true;
	public void userOption() {
		do {
			try {
				System.out.print("Enter Choice: ");
				choice = Menu.inputScanner.nextInt();
				isError = false;
			} catch (InputMismatchException e) {
				System.out.println("**Invalid input Please Enter Integer");
				Menu.inputScanner.nextLine();
				continue;
			}
		} while (isError);
		
		
	}
}
