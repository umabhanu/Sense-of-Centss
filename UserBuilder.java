package Models;

import java.util.List;

public class UserBuilder {
	private String username;
	private String DOB;
	private MembershipType membershipType;
	
	// need to add a few default categories within the constructor 
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setDob(String DOB) {
		this.DOB = DOB;	
	}
	public User build() {
		User user = new User(this.username, this.DOB, this.membershipType);
		return user;
	}
	public void withMembershipType(MembershipType membershipType) {
		this.membershipType = membershipType;		
	}
}