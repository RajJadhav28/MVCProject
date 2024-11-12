package POJO;

public class Registration {
	private String name;
	private String emailId;
	private String password;
	private String loc;
	private String contact;
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Registration(String name, String emailId, String password, String loc, String contact) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.password = password;
		this.loc = loc;
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Registration [name=" + name + ", emailId=" + emailId + ", password=" + password + ", loc=" + loc
				+ ", contact=" + contact + "]";
	}
	
	

}
