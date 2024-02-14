package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Bankingapplication.com.java.userDTO;

public class userDAO {
	
	public userDTO getUserDetials(String username) {
		
	userDTO resuser= new userDTO();
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking", "root", "MYSQLVenugopal@546");
		Statement stmt=con.createStatement();
		ResultSet res=stmt.executeQuery("select * from userdetials where username= '"+username+"'");
		
		while(res.next()) {
			
			resuser.setUserfullname(res.getString("userfullname"));
			resuser.setUsername(res.getString("username"));
			resuser.setPassword(res.getString("Password"));
			resuser.setEmail(res.getString("email"));
			resuser.setContactNo(res.getString("contactNo"));
			resuser.setUseraddress(res.getString("useraddress"));
			resuser.setUserId(res.getInt("userId"));
		}
		if(resuser.getUserId()==0) {
			resuser = null;
			
		}
		
	}catch(Exception ex) {
		ex.printStackTrace();
		
	}

	return resuser;
	}
	
	
	public boolean registerdetials(userDTO userDto) throws SQLException{
		String Insert_into_user_details= "INSERT INTO userdetials(userfullname,username,Password,email,contactNo,useraddress,userId) VALUES (?,?,?,?,?,?,?)";
		int results=0;
		
		try {
			Connection con=JDBCdao.getConnection();
			PreparedStatement ps= con.prepareStatement(Insert_into_user_details);
			
			ps.setString(1,userDto.getUserfullname());
			ps.setString(2,userDto.getUsername());
			ps.setString(3,userDto.getPassword());
			ps.setString(4,userDto.getEmail());
			ps.setString(5,userDto.getContactNo());
			ps.setString(6,userDto.getUseraddress());
			ps.setInt(7,userDto.getUserId());
			
			//System.out.println("the output is: "+ps);
		    results=ps.executeUpdate();
			JDBCdao.disconnect(con);
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return false;
	}
	
}
