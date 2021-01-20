import java.util.Scanner;
import java.util.regex.Matcher;

public class EmailValidatorSearch {

	public static void main(String[] args) {
		String emailID[] = { "john@gmail.com", "james@gmail.com", "katie@rediffmail.com", "priya@hotmail.com", "rohit11@gmail.com" };
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the EmailID to be searched: ");
			String input = scanner.next();
			if (input.equals("E")) {
				System.exit(0);
				scanner.close();
			}
			searchEmail(emailID, input);
				//System.out.println("email ID="+input);
				System.out.println("Is the Email ID valid =>" + isValid(input) +"\n");
			
		}
	}

	private static void searchEmail(String[] emailID, String input) {
		boolean isFound = false;
		for (String email : emailID) {
			if (email.equals(input)) {
				isFound = true;
				break;
			}
		}
		if (isFound) {
			System.out.println("Found!\n");
		} else {
			System.out.println("Not Found!\n");
		}
	}
	
	static String isValid(String emailID) {
		String validString = "InValid";
		
		//System.out.println("emailid inside="+emailID);
		String regex = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
		if(emailID.matches(regex))
		{
			validString = "Valid";
		}
		return validString;
		
	}

}
