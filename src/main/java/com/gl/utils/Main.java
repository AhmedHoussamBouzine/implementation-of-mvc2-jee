/**
 * 
 */
package com.gl.utils;

import java.util.List;

import com.gl.beans.Etudiant;
import com.gl.beans.Option;
import com.gl.business.DefaultServices;
import com.gl.business.Services;
import com.gl.dao.EtudiantDaoJdbc;
import com.gl.dao.EtudiantDaoText;


/**
 * @author houss
 *
 */

public class Main {

	/**
	 * 
	 */

	private Services services;
	public Main()  {
	services = DefaultServices.getInstance();
   //  new EtudiantADD();
//	List<Etudiant> etudiants = null;
//	try {
//		//etudiants = services.getEtudiantsSansOption();
//		//etudiants = services.getEtudiants();
//		//etudiants = services.getEtudiantsByName("houssam");
//		//etudiants = services.getEtudiantsByOptions("gl");
//	} catch (Exception e1) {
//		// TODO Auto-generated catch block
//		e1.printStackTrace();
//	}
//	for(Etudiant e:etudiants)
//		{
//		System.out.println(e.getCne() + "  "+ e.getNom()+" "+e.getPrenom());
//		}
//	}
//	Option o = new Option();
//	try {
//		 o = services.getOption("gl");
//		 
//		// o.setEtudiants(services.getEtudiantsByOptions(o.getNom()));
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	System.out.println(o.getNom() + "  "+ o.getEtudiants().toString());
//	}
//	try {
//Etudiant e = services.getEtudiant("n12");
//		services.updateNomOption(e);
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	

//	
//	}
//	
	
   //new EtudiantUpdate();
	//new TestJButton();
	
//	try {
//		Etudiant e = services.getEtudiant("n12");
//		services.deleteEtudiant(e);
//	} catch (Exception e1) {
//		// TODO Auto-generated catch block
//		e1.printStackTrace();
//	}
	
	// Option 
	
	//	new OptionADD();
	//	new OptionUpdate();
	
//	Option o = new Option();
//	o.setNom("gl");;
//	try {
//		services.deleteOption(o);
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	

	//Option o = new Option();
//	try {
//		 o = services.getOption("gl");
//		 
//		// o.setEtudiants(services.getEtudiantsByOptions(o.getNom()));
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	System.out.println(o.getNom() + "  "+ o.getEtudiants().toString());
//	}
	
//	
//	List<Option> options = null;
//	try {
//		options = services.getOptions();
//	} catch (Exception e1) {
//		// TODO Auto-generated catch block
//		e1.printStackTrace();
//	}
//	for(Option e:options)
//		{
//		System.out.println( e.getNom()+" "+e.getDescription());
//		}
//
	
	//new Acceuil();
	//new Affichage();
	//
	
	
	
	//transfer 
//	
//	try {
//		Option O = services.getOption("abd");
//		Etudiant E = services.getEtudiant("alae");
//		services.transferEtudiantOption(E, O);
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	
//	try {
//		new Etudiantshow();
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
////	
	}
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args){
	  
       new Main();
	}

}

   