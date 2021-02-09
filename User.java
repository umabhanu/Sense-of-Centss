package Models;

import java.util.List;

public class User {
	private String username;
	private String DOB;
	private MembershipType membershipType;
	private Budget budget;
        private Transaction transaction;
	
	
	public User(String username, String DOB, MembershipType membershipType) {
		this.username = username;
		this.DOB = DOB;
		this.membershipType = membershipType;
		budget = new Budget();
	}

	// 
	public void showBudget() {
		budget.display();
	}
        
        public void addTransaction()
        {
            
        }

	public String getUsername() {
		return this.username;
	}

}