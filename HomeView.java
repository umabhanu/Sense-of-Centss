package Views;
import java.util.Scanner;

import Models.*;

public final class HomeView {
	
    private static Scanner in = new Scanner(System.in);
    private static int sel;
    private static String str;
    
	public static int index() {
		System.out.println("0: To exit");
		System.out.println("1: To register");
		System.out.println("2: To login");
        System.out.print("Entered selection: ");
        sel = in.nextInt();
        return sel;
	}
	
	public static User register() {
		UserBuilder userBuilder = new UserBuilder();
		
		// user name selection
        System.out.println("\n______ REGISTRATION _____\n");

		System.out.print("Enter username: ");
        str = in.next();
        userBuilder.setUsername(str);
		System.out.print("\n");

		// DOB selection
		System.out.print("Enter DOB: ");
        str = in.next();
        userBuilder.setDob(str);
		System.out.print("\n");

		// membership selection
		System.out.println("1 - Free Membership");
		System.out.println("2 - Paid Membership");
		System.out.print("Select your membership type: ");
		sel = in.nextInt();
		
		if (sel == 1 ) {
	        userBuilder.withMembershipType(MembershipType.FREE);
		}
		else if (sel == 2) {
	        userBuilder.withMembershipType(MembershipType.PAID);
		}
		
		// build user object
        User user = userBuilder.build();
        
        return user;
	}
}