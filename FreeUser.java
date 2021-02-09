/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Arthi
 */
public class FreeUser implements IAddTransaction {
 int size=10;
    @Override
    public void addTransaction() {
        if(size>10)
        {
            System.out.println("Transaction Limit Exceeded");
        }
        
    }
    
}
