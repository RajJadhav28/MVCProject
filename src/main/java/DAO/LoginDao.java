package DAO;

public interface LoginDao {
	boolean UserLogin(String emailId , String password);
	 boolean adminLogin(String emailId, String password);
	 boolean adminLogin1(String adminemailId, String password);

}
