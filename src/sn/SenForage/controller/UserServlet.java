package sn.SenForage.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.SenForage.entities.Client;
import sn.SenForage.entities.User;
import sn.SenForage.entities.Village;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(urlPatterns="/LoginServlet", name ="loginservlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/user/Login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		 String nom = request.getParameter("nom").toString();
		 String prenom = request.getParameter("prenom ").toString();
		 String email  = request.getParameter("email ").toString();
		 String password  = request.getParameter("password ").toString();
		 
		 User user = new User();
		 user.setNom(nom);
		 user.setPrenom(prenom);
		 user.setEmail(email);
		 user.setPassword(password);
		 
		 
	}

}
