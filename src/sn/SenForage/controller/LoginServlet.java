package sn.SenForage.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.SenForage.dao.ClientImpl;
import sn.SenForage.dao.IClient;
import sn.SenForage.dao.IUser;
import sn.SenForage.dao.UserImpl;
import sn.SenForage.entities.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private IUser userdao ;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		userdao = new UserImpl();	
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			
			  String email = request.getParameter("email").toString(); 
			  String password = request.getParameter("password").toString();
			  
			  System.out.println(email +" "+password);
			  
			  
			  User user = userdao.getUserByEmailAndPassword(email,password);
			  
			  
			  
			  if ( user != null) {
			  
			  request.getRequestDispatcher("index.jsp").forward(request, response);
			 
			  }else {
				  request.getRequestDispatcher("/WEB-INF/user/Login.jsp").forward(request, response);
			}
			  				
		
	}

}
