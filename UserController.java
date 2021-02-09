package Controllers;
import java.util.Scanner;

import Models.*;
import Views.*;

public class UserController {
	public static int selection = 0;
	public User user = null;
        private static Budget b;
        private static Transaction t;
        private static String str;
        

	
	// clear screen
	public static void clearScreen() {  
	    System.out.print("\n\n\n\n\n\n");  
	    System.out.flush();  
	} 
	
	public static void index(User user) {
		clearScreen();

		do {
			selection = Views.UserView.index(user);
	        
			/* System.out.println(" 0: \tTo exit");
			 * System.out.println(" 1: \tDisplay Budget");
			 * System.out.println(" 2: \tAdd Category");
			 * System.out.println(" 3: \tAdd Transaction");
			 */
			
	        // exi
	        if (selection == 0) {
	        	System.exit(0);
	        }
	        else if (selection == 1) {
		        clearScreen();
		        user.showBudget();
	        }
	        else if (selection == 2) {
		        clearScreen();
		        System.out.println("... add category...");
                       Scanner sc=new Scanner(System.in);
                       String name=sc.nextLine();
                       System.out.println("Type of Category");
                       String type=sc.nextLine();
                       if(type=="income")
                       {
                           Category cat= new Category(name, TransactionType.INCOME);
                           b.addCategory(cat);
                       }
                       else
                       {
                           Category cat= new Category(name, TransactionType.EXPENSE);
                           b.addCategory(cat);
                       }
                      
	        }
	        else if (selection == 3) {
		        clearScreen();
		        System.out.println("... add transaction...");    
                        Scanner sc=new Scanner(System.in);
                        
                        System.out.println("Enter Amount");  
                        double amount=sc.nextDouble();
                        System.out.println("Enter Memo"); 
                        String memo=sc.nextLine();
                        System.out.println("Enter Date");
                        String date=sc.nextLine();
                        Transaction trans=new Transaction(amount, memo, date, TransactionType.INCOME);
                        t.addTransaction(trans);
                                       
	        }
	        
	        clearScreen();
		} while (true);
	}
}