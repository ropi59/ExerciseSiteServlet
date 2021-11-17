package Servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Services.StudentServices;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import models.User;


/**
 * Servlet implementation class ListUserServlet
 */
@WebServlet("/studentlist")
public class ListUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private List<User> studentlist = new ArrayList<User>();
	private StudentServices studentServices = StudentServices.getInstance();
    /**
     * Default constructor. 
     */
    public ListUserServlet() {
    	this.studentlist = studentServices.getUser(); 
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("USER", studentlist);

		request.getRequestDispatcher("/WEB-INF/studentlist.jsp")
		.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
