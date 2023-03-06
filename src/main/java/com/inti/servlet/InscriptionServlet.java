package com.inti.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;

import com.inti.model.UAbonne;
import com.inti.model.Utilisateur;
import com.inti.model.UtilisateurDetails;
import com.inti.model.Uvip;
import com.inti.util.HibernateUtil;


@WebServlet("/inscription")
public class InscriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private Session s;
       static Logger log=LogManager.getLogger(InscriptionServlet.class);
 
    public InscriptionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 s= HibernateUtil.getSessionFactory().openSession();
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/inscription.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			s.beginTransaction();
			log.debug("connexion à la BDD et configuration d'hibernate");
			
			Utilisateur u1=null;
			
			if(request.getParameter("formule").equals("classique")) {
				
			u1=new Utilisateur(request.getParameter("login"), request.getParameter("mdp"));
			
			}else if(request.getParameter("formule").equals("abonne")) {
				u1=new UAbonne(request.getParameter("login"), request.getParameter("mdp"),12,"informatique");
			}else {
				u1=new Uvip(request.getParameter("login"), request.getParameter("mdp"),20,2,1,15.99);
			}
			
			
			UtilisateurDetails ud1=new UtilisateurDetails(request.getParameter("adresse"), request.getParameter("ville"),
					Integer.valueOf(request.getParameter("cp")), request.getParameter("telephone"), request.getParameter("email"), u1);
			u1.setUtilisateurDetails(ud1);
			s.save(u1);
			
			s.getTransaction().commit();
			
			
		}
		catch(Exception e){
			e.printStackTrace();
			log.info("erreur de saisie des informations");
			s.getTransaction().rollback();
		}
		doGet(request, response);

		
	}

}
