package Models;

public enum TransactionType {
	INCOME("Income"), EXPENSE("Expense");
	
	private String title;

	TransactionType(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}
}
