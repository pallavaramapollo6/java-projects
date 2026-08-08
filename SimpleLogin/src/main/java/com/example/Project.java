package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Project
 */
@WebServlet("/Project")
public class Project extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Project() {
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
		// For example, just show the login page if accessed via GET
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("/index.html");
		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Retrieve user input from the login form
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		// Check credentials (In real-world apps, use proper authentication)
		if ("admin".equals(username) && "password123".equals(password)) {
			// Redirect to the success page
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			out.println("<h1>Login Successful!</h1>");
			out.println("<p>Welcome, " + username + "!</p>");
			out.println("</body></html>");
		} else {
			// Redirect to the failure page
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			out.println("<h1>Login Failed</h1>");
			out.println("<p>Invalid credentials. Please try again.</p>");
			out.println("<a href='index.html'>Go back to login</a>");
			out.println("</body></html>");
		}
	}

}
