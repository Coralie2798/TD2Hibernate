package com.inti.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;

import com.inti.model.Commandes;
import com.inti.model.Utilisateur;
import com.inti.util.HibernateUtil;


@WebServlet("/commande")
public class CommandeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  private Session s= HibernateUtil.getSessionFactory().openSession();;
	  static Logger log=LogManager.getLogger(CommandeServlet.class);
   
    public CommandeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/Commande.jsp").forward(request, response);

		log.debug("connexion à la BDD et config hib depuis commande servlet");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		
		s.beginTransaction();
		log.info("début enregistrement commande");
		 
		Commandes com1=new Commandes(LocalDate.parse(request.getParameter("dateC")));
		
		Utilisateur u1=s.get(Utilisateur.class, Integer.parseInt(request.getParameter("idU")));
		System.out.println(u1);
		
		com1.setUtilisateur(u1);
		
		s.save(com1);
		
		s.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
			
			log.error("erreur enregistrement commande");
			s.getTransaction().rollback();
		}
		
		
		doGet(request, response);
	}

}
