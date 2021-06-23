package regexpattern;

import java.util.Scanner;

public class Runner {
	
	public static void main(String[] args) {

		UserRegistration userregistration = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first name ");
		String fname = sc.next();
		userregistration.getFirstName(fname);
		

		System.out.println("Enter Email ID ");
		String email = sc.next();
		userregistration.getEmail(email);
		
		System.out.println("Enter mobile no. ");
		String mobile = sc.next();
		userregistration.getMobileNumber(mobile);
		
		System.out.println("Enter password ");
		String password = sc.next();
		userregistration.getPassword(password);
		
		sc.close();
	}

}
