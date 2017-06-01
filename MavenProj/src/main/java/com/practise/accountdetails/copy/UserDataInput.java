package com.practise.accountdetails.copy;

import java.io.IOException;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*import javax.swing.plaf.basic.BasicToolBarUI.DockingListener;*/

public class UserDataInput extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("inside dopostmethod");

		String username = req.getParameter("username");
		String password = req.getParameter("userpwd");

		Service obj = new Service();
		boolean isValid = obj.checkData(username, password);
		if (isValid) {
			System.out.println("valid credentials");
			req.setAttribute("name", username);
            RequestDispatcher obj1 = req.getRequestDispatcher("Success.jsp");
			obj1.forward(req, resp);
		} else {
			System.out.println("invaid credentials");
			req.setAttribute("error", "Invalid Username or Password");

			RequestDispatcher obj1 = req.getRequestDispatcher("Login.jsp");
			obj1.forward(req, resp);
		}

	}
}
