package Bankingapplication.com.java;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bankingapplication.com.java.userDTO;
import dao.userDAO;


@WebServlet("/registration")
public class registrationservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public registrationservlet() {
        super();
       
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userfullname = request.getParameter("userfullname");
		String username = request.getParameter("username");
		String Password = request.getParameter("Password");
		String email = request.getParameter("email");
		String contactNo = request.getParameter("contactNo");
		String useraddress = request.getParameter("useraddress");
		
		userDTO userDto= new userDTO(userfullname,username,Password,email,contactNo,useraddress,0);
		try {
			userDAO userdao=new userDAO();
			
			if(userdao.registerdetials(userDto)) {
				response.sendRedirect("login.jsp");
			}else {
				response.sendRedirect("registration.jsp");
				
			}
			}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
