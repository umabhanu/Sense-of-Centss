package Models;

import java.util.ArrayList;
import java.util.List;

public class Transaction {
	private double Amount;
	private String Memo;
	private String Date;
	//private int Count;
	private TransactionType transactionType;
        	private List<Transaction> transactions;


       public Transaction(double Amount, String Memo, String Date,TransactionType transactionType)
 {
		 transactions= new ArrayList<Transaction>();
                transactions.add(new Transaction(500, "Rent Paid","04/23/2019",transactionType.EXPENSE));
                transactions.add(new Transaction(100, "Utilities to be paid","04/19/2019",transactionType.EXPENSE));
                transactions.add(new Transaction(250, "Spent on Transportation","04/12/2019", transactionType.EXPENSE));
                transactions.add(new Transaction(10000, "Salary Earned in first paycheck","04/01/2019", transactionType.INCOME));

                               

	}

    Transaction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
	// Setter methods
	public void setAmount(double Amount) {
		this.Amount = Amount;
	}
	public void setMemo(String Memo) {
		this.Memo = Memo;
	}
	public void setDate(String Date) {
		this.Date = Date;
	}
	/*public void setCount(int Count)
        {
            this.Count=Count;
        }*/
	// Getter methods
	public double getAmount() {
		return this.Amount;
	}
	public String getMemo() {
		return this.Memo;
	}
	public String getDate() {
		return this.Date;
	}
        
        public void addTransaction(Transaction trans)
        {
            transactions.add(trans);
        }
      /* public int getCount() {
		return this.Count;
	}*/
       public void display() {
           System.out.println(String.format("$%-20s %-20s %-20s %-20s" , "Amount", "Memo", "Date", "Count"));
                    for(Transaction transaction : transactions )
                        {
                            transaction.display();
                        }    
	}
}