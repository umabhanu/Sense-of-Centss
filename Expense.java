package Models;

public class Expense {
	private double amount;
	private String date;
	private Category category;
	
	// constructor
    Expense(double amount,String date, Category category)
        {
            this.amount=amount;
            this.date=date;
            this.category=category;
        }
        public double getAmount()
        {
            return amount;
        }
        public String date()
        {
            return date;
        }
}