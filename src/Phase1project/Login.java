package Phase1project;
import java.util.Scanner;
public class Login {
	public static String passWord="admin1";
	public static void adminLogin() {
		// TODO Auto-generated method stub
		String userName="admin";
		System.out.println("Enter your username and password:");
		Scanner sc = new Scanner(System.in);
		System.out.println("username:");
		String username = sc.next();
		System.out.println("password:");
		String password = sc.next();
		boolean passwordflag = true;
		while (passwordflag){
		        if(username.equals(userName) && password.equals(passWord)){
        			passwordflag = false;
        			System.out.println("The password is correct");
        			System.out.println("Logged in successfully...");
        			System.out.println("-----------------------------");
		        }
		        else{
        			System.out.println("password you entered is wrong...");
        			System.out.println("enter your password again:");
		            password = sc.next();
		            System.out.println("-----------------------------");
		        }
		}
		
		System.out.println("Do you want to update your password\nPlease enter 'yes' or 'no':");
		String passwordUpdate = sc.next();
		if(passwordUpdate.equals("yes")){
			updatePassword();
		}
		else{
			System.out.println("Exit");
		}
		
		
		

	}
	public static void updatePassword(){
		System.out.println("Enter your new password:");
		Scanner sc = new Scanner(System.in);
		passWord = sc.next();
		System.out.println("Your password has been succesfully updated!!");
	}

}
