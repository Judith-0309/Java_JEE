package sn.SenForage.controller;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.SenForage.dao.ClientImpl;
import sn.SenForage.dao.IClient;
import sn.SenForage.dao.IVillage;
import sn.SenForage.dao.VillageImpl;


import sn.SenForage.entities.Village;

/**
 * Servlet implementation class VillageServlet
 */
@WebServlet(urlPatterns="/Village",name="village")
public class VillageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IVillage villagedao ;
	
	 private EntityManagerFactory emf =
			  Persistence.createEntityManagerFactory("SenForagePU"); 
			  EntityManager em =
			 emf.createEntityManager();
			
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VillageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    /**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		villagedao = new VillageImpl();	
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("listeVillage",villagedao.list());
		
		request.getRequestDispatcher("/WEB-INF/village/addVillage.jsp").forward(request, response);
	}
	
	 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String nomVillage  = request.getParameter("nomVillage").toString();
		
		Village village = new Village();
		
		 village.setNomVillage(nomVillage);
		
		
		
		int ok = villagedao.add(village);

		request.setAttribute("liste", villagedao.list());
        doGet(request, response);
		
	}
	

}
