package com.inti.servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.inti.model.CB;
import com.inti.model.Paiement;
import com.inti.model.Paypal;
import com.inti.util.HibernateUtil;


@WebServlet("/paiement")
public class PaiementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       static Session s;
    
    public PaiementServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/paiement.jsp").forward(request, response);
	
		 s= HibernateUtil.getSessionFactory().openSession();
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Paiement p1=null;
			if(request.getParameter("inlineRadioOptions").equals(request.getParameter("option1"))) {
				p1=new Paypal(Integer.valueOf(request.getParameter("montant")),LocalDate.parse(request.getParameter("date")),
						Integer.parseInt(request.getParameter("numeroCompte")) );
			}else {
				
				p1=new CB(Integer.valueOf(request.getParameter("montant")),LocalDate.parse(request.getParameter("date")),
						Integer.parseInt(request.getParameter("numeroCarte")), LocalDate.parse(request.getParameter("dateExpiration")));
			}
			s.save(p1);
		}catch(Exception e) {
			e.printStackTrace();
		}
		doGet(request, response);
	}

}
