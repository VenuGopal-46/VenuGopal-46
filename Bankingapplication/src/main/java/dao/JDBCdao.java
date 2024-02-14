package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCdao {
	public static Connection getConnection() throws SQLException{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String database_url="jdbc:mysql://localhost:3306/mysqldb";
			String database_user="root";
			String database_password="MYSQLVenugopal@546";
			return DriverManager.getConnection(database_url,database_user,database_password);
		}catch(ClassNotFoundException ex) {
			throw new SQLException("database is not found", ex);
			
		}
	}
	public static void disconnect(Connection con){
		try {
			if(con!=null) {
				con.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
