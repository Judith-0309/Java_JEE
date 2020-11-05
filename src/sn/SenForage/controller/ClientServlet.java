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
import sn.SenForage.entities.Client;
import sn.SenForage.entities.Village;



/**
 * Servlet implementation class ClientServlet
 */
@WebServlet(urlPatterns="/Client",name="client")
public class ClientServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
		private IClient clientdao ;
		private IVillage villlagedao;	
		
	
		
		  private EntityManagerFactory emf =
		  Persistence.createEntityManagerFactory("SenForagePU"); 
		  EntityManager em =
		 emf.createEntityManager();
		

		/**
		 * @see Servlet#init(ServletConfig)
		 */
		public void init(ServletConfig config) throws ServletException {
			clientdao = new ClientImpl();	
			villlagedao = new VillageImpl();
		}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("listeVillage",villlagedao.list());
		
		request.setAttribute("listeClient",clientdao.list());
		
		request.getRequestDispatcher("/WEB-INF/client/addClient.jsp").forward(request, response);
//	request.getRequestDispatcher("client/addclient.jsp").forward(request, response);
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		 String nomFamille = request.getParameter("nomFamille").toString();
		 int idvillage = Integer.parseInt(request.getParameter("village"));
		 String adresse = request.getParameter("adresse").toString();
		 String telephone = request.getParameter("telephone").toString();
		 
		 Client client = new Client();
		
		 client.setNomFamille(nomFamille);
		
		 client.setAdresse(adresse);
		 client.setTelephone(telephone);
		 client.setVillage((Village)em.createQuery("SELECT c FROM Village c where c.id=:id").setParameter("id", idvillage).getSingleResult());
		 
		 int ok = clientdao.add(client);
//			response.getWriter().println(ok);
			
		 request.setAttribute("liste", clientdao.list());
	        doGet(request, response);
		 
		 
	}

}
