package com.gl.presentation.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gl.beans.Etudiant;
import com.gl.beans.Option;
import com.gl.business.DefaultServices;

public class EtudiantAction {
	private HttpServletRequest request;
	private HttpServletResponse response;
    public EtudiantAction() {}

	public EtudiantAction(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
	}

	public String addEtudiant() {
		try {
			List<Option> options = DefaultServices.getInstance().getOptions();
			request.setAttribute("options", options);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/WEB-INF/AddEtudiant.jsp";
	}

	public String addEtudiantAction(String cne, String nom , String prenom,String option) {
		try {
			
			Etudiant etudiant = new Etudiant();
			etudiant.setCne(cne);
			etudiant.setNom(nom);
			etudiant.setPrenom(prenom);
			etudiant.setOption(DefaultServices.getInstance().getOption(option));
			DefaultServices.getInstance().addEtudiant(etudiant);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "addEtudiant";
	}

	public String deleteEtudiant() {
		try {
			String cne = request.getParameter("cne");
			Etudiant etudiant = DefaultServices.getInstance().getEtudiant(cne);
			DefaultServices.getInstance().deleteEtudiant(etudiant);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return "listEtudiant";
	}

	public String listerEtudiants() {
		String string = request.getParameter("nom");
		try {
			if (string == null) {
				List<Etudiant> etudiants = DefaultServices.getInstance().getEtudiants();
				request.setAttribute("etudiants", etudiants);
				request.getRequestDispatcher("/WEB-INF/ListEtudiant.jsp").forward(request, response);
			} else {
				List<Etudiant> etudiants = DefaultServices.getInstance().getEtudiantsByOptions(string);
				request.setAttribute("etudiants", etudiants);

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			

		}
		return "/WEB-INF/ListEtudiant.jsp";
	}
}
