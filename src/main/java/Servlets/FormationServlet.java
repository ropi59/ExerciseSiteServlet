package Servlets;

import java.io.IOException;

import Services.FormationsServices;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Formation;

/**
 * Servlet implementation class FormationServlet
 */
@WebServlet("/formation")
public class FormationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FormationsServices formationsServices = FormationsServices.getInstance();
	private Formation formation;

    /**
     * Default constructor. 
     */
    public FormationServlet() {

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		formation = this.formationsServices.getFormationByTitle(request.getParameter("title"));
		request.setAttribute("FORMATION", formation);

		request.getRequestDispatcher("/WEB-INF/formation.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
