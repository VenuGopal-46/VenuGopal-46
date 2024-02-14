package com.practice.addingtwonumbers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class subServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public subServlet() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		int number1=Integer.parseInt(request.getParameter("user_num1"));
		int number2=Integer.parseInt(request.getParameter("user_num2"));
		String operations = request.getParameter("operations");
		
		
		int result;
		switch (operations) {
		case"+":
			result=number1+number2;
			break;	
			default:
			return;	
		}
		out.println("result is:" + number1 + " " + operations + " " + number2 + "=" + result);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
