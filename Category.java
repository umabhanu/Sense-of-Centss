

	// constructor
	

    package Models;

import java.util.List;

public class Category {
	private String name;
	private double transactionTotal;
	private double budgetTotal;
	private TransactionType transactionType;
	//private State BudgetState;
	private List<Transaction> transactions;
	
	// constructor
	public Category(String name, TransactionType transactionType) {
		this.name = name;
		this.transactionType = transactionType;
		transactionTotal = 0;
		budgetTotal = 0;
	}
	
	// set budgeted amount for this transaction category
	public void setTransactionBudget(double budgetTotal) {
		this.transactionTotal = budgetTotal;
	}
	
	// update budgeted amount for this category
	public void addTransaction(double amount) {
		this.transactionTotal += amount;
	}
	
	// update the total income/expense for this category
	public void setBudgetTotal(double budgetTotal) {
		this.budgetTotal = budgetTotal;
	}
	
	// display category
	public void display() {
		System.out.println(String.format("%-20s %-20s $%-20s $%-20s" , name, transactionType, transactionTotal, budgetTotal));
	}
}