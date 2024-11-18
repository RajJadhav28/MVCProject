package DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.PreparableStatement;

import DAO.RegisterDao;
import POJO.Registration;
import Utility.DButility;

public class DaoImplement implements RegisterDao{

	@Override
	public boolean add(Registration r) {
		Connection con=DButility.getConnection();
		
		try {
			String sql="insert into register(name,emailId,password,loc,contact) values(?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, r.getName());
			ps.setString(2, r.getEmailId());
			ps.setString(3, r.getPassword());
			ps.setString(4, r.getLoc());
			ps.setString(5, r.getContact());
			int count=ps.executeUpdate();
			if(count>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	
	

	

}
