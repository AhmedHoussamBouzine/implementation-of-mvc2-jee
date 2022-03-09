package com.gl.presentation.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gl.beans.Etudiant;
import com.gl.beans.Option;
import com.gl.business.DefaultServices;
import com.gl.presentation.action.EtudiantAction;
import com.gl.presentation.action.OptionAction;


/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/")
public class MyServlet extends HttpServlet {
	private EtudiantAction etudiantAction ;
	private OptionAction optionAction;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = getURL(request.getRequestURL().toString(), request.getContextPath());
		switch (url) {
		case ("addEtudiant") :
		    etudiantAction = new EtudiantAction(request, response);
			request.getRequestDispatcher(etudiantAction.addEtudiant()).forward(request, response);
		break;
		case ("addEtudiantAction") :

		    etudiantAction = new EtudiantAction(request, response) ;
			request.getRequestDispatcher(etudiantAction.addEtudiantAction()).forward(request, response);
			
			break;
		case ("addOptionAction") :
		 optionAction = new OptionAction(request, response);
		
		request.getRequestDispatcher(optionAction.addOptionAction()).forward(request, response);
			
			break;
		case ("addOption") :
			optionAction = new OptionAction(request, response);
			request.getRequestDispatcher(optionAction.addOption()).forward(request, response);
			
			break;
		case ("deleteEtudiant") :
			etudiantAction = new EtudiantAction(request, response);
			request.getRequestDispatcher(etudiantAction.deleteEtudiant()).forward(request, response);
			
			break;
		case ("deleteOption") :
			optionAction = new OptionAction(request, response);
			request.getRequestDispatcher(optionAction.deleteOption()).forward(request, response);
			
			break;
		case ("home") :
			request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);

			break;
		case ("listEtudiant") :
			etudiantAction =new EtudiantAction(request, response);
			request.getRequestDispatcher(etudiantAction.listerEtudiants()).forward(request, response);
			
			break;
			case ("listOption"):
				 optionAction = new OptionAction(request, response);
				 request.getRequestDispatcher(optionAction.listerOptions()).forward(request, response);
				break;
		default:
			break;
		}
		

    }
    
    private String getURL(String url,String context) {
    	return url.substring(url.lastIndexOf(context) + context.length() +1);
    	
    }
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
