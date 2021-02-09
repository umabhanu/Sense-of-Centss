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
public class UnderBudget implements BudgetState{
    private int budget;

    @Override
    public void report() {
            System.out.println("Hurray!! You're towards your goal..!!");
    }
    
    }
