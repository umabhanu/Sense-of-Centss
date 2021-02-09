package Models;

import java.util.ArrayList;
import java.util.List;

public class Budget {
	private List<Category> categories;
	private IAddTransaction addTransaction;
	
	// constructor
	public Budget() {
		
		categories = new ArrayList<Category>();		
		
		// default categories
		categories.add(new Category("Rent", TransactionType.EXPENSE));
		categories.add(new Category("Utilities", TransactionType.EXPENSE));
		categories.add(new Category("Transportation", TransactionType.EXPENSE));
		categories.add(new Category("Salary", TransactionType.INCOME));
		
	}
	
	// add category
	public void addCategory(Category category) {
		categories.add(category);
	}
	
	// this might not be the right implementation...
	public void addTransaction(IAddTransaction addTransaction) {
		addTransaction.addTransaction();
	}
	
	// display all categories 
	public void display() {
		System.out.println(String.format("%-20s %-20s %-20s %-20s" , "Name", "Transaction Type", "Transaction Total", "Budget Total"));
		for(Category category : categories){
			category.display();
		}
	}


}