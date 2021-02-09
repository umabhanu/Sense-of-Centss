/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
import java.util.Scanner;
import Models.*;

/**
 *
 * @author Arthi
 */
public final class AddOnView {
        private static Scanner in = new Scanner(System.in);
        private static int sel;
        
        public static int index() {
            AddOn a= new AddOn();
		/*System.out.println(a.display()); */
                
		System.out.println("1: Car Insurance");
		System.out.println("2: Home Insurance");
        	System.out.println("3: Life Insurance");
                System.out.println("4: Retirement");

System.out.print("Entered selection: ");
        sel = in.nextInt();
        if(sel==1)
        {
             CarInsurance c= new CarInsurance();
		System.out.println(c.display());
	}
        else if(sel==2)
        {
             HomeInsurance h= new HomeInsurance();
		System.out.println(h.display());
	}
        else if(sel==3)
        {
             CarInsurance c= new CarInsurance();
		System.out.println(c.display());
	}
        else if(sel==4)
        {
             Retirement r= new Retirement();
		System.out.println(r.display());
	}
        else if(sel==0)
            {
                System.out.println("Select number between 1 to 4");
            }
            
                return sel;

        }
}

