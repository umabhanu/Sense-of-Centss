package Controllers;
import java.util.Scanner;

import Models.*;
import Views.*;

public class HomeController {
	public static void main(String[] args) {
        int selection = 0;
        User user = null;
        clearScreen();
        
		do {
			selection = Views.HomeView.index();
	        
			/* System.out.println("0: To exit"); 
			 * System.out.println("1: To register");
			 * System.out.println("2: To login");
			 */
	        if (selection == 0) {
	        	// exit
	        }
	        else if (selection == 1) {
	        	user = Views.HomeView.register();
		        
	        }
	        else if (selection == 2) {
	        	System.out.println("... login ...");
	        }
	        else {
		        System.out.println("Error.");
	        }
	        
			// controller!
	        clearScreen();

	        // if user is logged in redirect to user views and controller
	        if (user != null) {
	        	Controllers.UserController.index(user);
	        }
			
		} while (selection != 0);
        System.out.println("exiting... ");
	}
	
	
	// clear screen
	public static void clearScreen() {  
	    System.out.print("\n\n\n\n\n\n");  
	    System.out.flush();  
	} 
}