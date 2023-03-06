package com.inti.servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;

import com.inti.model.Commandes;
import com.inti.model.Role;
import com.inti.model.Utilisateur;
import com.inti.util.HibernateUtil;


@WebServlet("/role")
public class AffectationRoleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private Session s= HibernateUtil.getSessionFactory().openSession();;
	  static Logger log=LogManager.getLogger(CommandeServlet.class);
	  
    public AffectationRoleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/role.jsp").forward(request, response);

		log.debug("connexion à la BDD et config hib depuis role servlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			s.beginTransaction();
			log.info("début enregistrement role");
			 
			List<Role>listeR=new ArrayList();
			String[]tabR=request.getParameterValues("role");
			
			for(int i=0;i<tabR.length;i++)
			{
				listeR.add(new Role(tabR[i]));
			}
			
			Utilisateur u1=s.get(Utilisateur.class, Integer.parseInt(request.getParameter("idU")));
			u1.setListeRole(listeR);
			
			s.saveOrUpdate(u1);
			
			System.out.println(u1);
			
			
			
		
			
			s.getTransaction().commit();
			}catch(Exception e) {
				e.printStackTrace();
				
				log.error("erreur enregistrement commande");
				s.getTransaction().rollback();
			}
		doGet(request, response);
	}

}
