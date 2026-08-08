package com.example.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.dao.UserDao;
import com.example.model.User;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/Register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistrationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/Register.jsp").forward(request,
				response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost() invoked");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		if (name == null || email == null || password == null || name.isEmpty()
				|| email.isEmpty() || password.isEmpty()) {
			request.setAttribute("message", "All fields are required!");
			request.getRequestDispatcher("/Register.jsp").forward(request,
					response);
			return;
		}

		User newUser = new User(name, email, password);
		boolean isRegistered = UserDao.registerUser(newUser);

		if (isRegistered) {
			request.setAttribute("message", "Registration successful!");
		} else {
			request.setAttribute("message",
					"Registration failed. Please try again.");
		}

		request.getRequestDispatcher("/Register.jsp").forward(request,
				response);
	}

}
