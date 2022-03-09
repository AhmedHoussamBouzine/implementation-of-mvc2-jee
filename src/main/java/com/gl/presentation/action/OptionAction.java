package com.gl.presentation.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gl.beans.Option;
import com.gl.business.DefaultServices;

public class OptionAction {

	 private HttpServletRequest request;
	 private HttpServletResponse response;
	
	 public OptionAction(HttpServletRequest request, HttpServletResponse response) {
		 this.request=request;
		 this.response=response;
	 }
	
	 public String addOption() {
		 return "/WEB-INF/AddOption.jsp";
	 }
	 
	 public String addOptionAction() {
		    String Nom=request.getParameter("Nom");
			String description=request.getParameter("description");
			Option option = new Option();
			option.setNom(Nom);
			option.setDescription(description);
			try {
				DefaultServices.getInstance().addOption(option);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 return "addOption";
	 }
	 public String deleteOption() {
		 try {
				String nom = request.getParameter("nom");
				Option option1 = DefaultServices.getInstance().getOption(nom);
				DefaultServices.getInstance().deleteOption(option1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 return "listOption";
	 }
	 public String listerOptions() {
		 try {
				List<Option> options = DefaultServices.getInstance().getOptions();
			    request.setAttribute("options", options);
			   
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 return "/WEB-INF/ListOption.jsp";
		 
	 }
	 
}
