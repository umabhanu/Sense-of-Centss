package Models;

public enum MembershipType {
	FREE("Free"), PAID("Paid");
	
	private String title;

	MembershipType(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}
}