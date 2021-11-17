package Servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Services.FormationsServices;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import models.Formation;


/**
 * Servlet implementation class ListFormationServlet
 */
@WebServlet("/formationlist")
public class ListFormationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private List<Formation> formations = new ArrayList<Formation>();
	private FormationsServices formationsServices = FormationsServices.getInstance();
    /**
     * Default constructor. 
     */
    public ListFormationServlet() {
    	this.formations = formationsServices.getFormation(); 
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("FORMATION", formations);

		request.getRequestDispatcher("/WEB-INF/formationlist.jsp")
		.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
