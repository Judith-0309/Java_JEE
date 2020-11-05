package sn.SenForage.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.SenForage.dao.IVillage;
import sn.SenForage.dao.VillageImpl;


import sn.SenForage.entities.Village;

/**
 * Servlet implementation class VillageServlet
 */
@WebServlet(urlPatterns="/Village",name="village")
public class VillageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	IVillage villagedao = new VillageImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VillageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/village/addVillage.jsp").forward(request, response);
	}
	
	 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String nomVillage  = request.getParameter("nomVillage").toString();
		
		Village village = new Village();
		
		 village.setNomVillage(nomVillage);
		
		
		
		int ok = villagedao.add(village);
//		response.getWriter().println(ok);
		
        doGet(request, response);
		
	}
	

}
