package Views;
import java.util.Scanner;

import Models.*;

public final class UserView {
	
    private static Scanner in = new Scanner(System.in);
    private static int sel;
    private static String str;
    
	public static int index(User user) {
		System.out.println("Welcome, "+ user.getUsername() + "!\n");
		System.out.println("========== MENU ==========");
		System.out.println(" 0: \tTo exit");
		System.out.println(" 1: \tDisplay Budget");
		System.out.println(" 2: \tAdd Category");
		System.out.println(" 3: \tAdd Transaction");
        System.out.print("Entered selection: ");
        sel = in.nextInt();
        return sel;
	}
}