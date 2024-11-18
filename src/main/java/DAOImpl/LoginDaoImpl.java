package DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DAO.LoginDao;
import Utility.DButility;

public class LoginDaoImpl implements LoginDao{

	@Override
	public boolean UserLogin(String emailId, String password) {
		 Connection con=  DButility.getConnection();
		 
		 try {
			 String sql="select * from register where emailId=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, emailId);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				String pass=rs.getString("password");
				if(pass.equals(password)) {
					return true;
				}else {
					return false;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return false;
	}

	@Override
	public boolean adminLogin(String emailId, String password) {
		Connection con=DButility.getConnection();
		
		try {
			String sql="select * from admin where emailId=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, emailId);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				String pass=rs.getString("password");
				if(pass.equals(password)) {
					return true;
				}else {
					return false;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean adminLogin1(String adminemailId, String password) {
Connection con=DButility.getConnection();
		
		try {
			String sql="select * from admin where emailId=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, adminemailId);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				String pass=rs.getString("password");
				if(pass.equals(password)) {
					return true;
				}else {
					return false;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
