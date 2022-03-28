package com.sip.ams.Controllers;


import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sip.ams.Entities.Etudiant;

@Controller
public class FirstController {
	
	
	private Model e;


	@RequestMapping("/first")
	public String Home(Model m) {
		
		
		String nom = "bassem ben dhief";
		String universite = "ESSTT";
		String email ="bendhief.b@gmail.com";
		 
		 String[] Cetif = new String[] { "OCA", "OCP", "Spring", "MVC", "Pause" };
		 
		 
		 
		m.addAttribute( "name",nom);
		m.addAttribute( "Myuniversity", universite);
		m.addAttribute( "Myemail", email);
		
		m.addAttribute("mycertif", Cetif);
		
								
		return "/home/app";
	}
		
		
		@RequestMapping("/list")
		public String etudiants(Model e) {
			
			
										
			ArrayList<Etudiant> students = new ArrayList<Etudiant>();
			students.add(new Etudiant("bassem" ,"22","bendhief.b@gmail.com" ,"20389326",  "8 rue de mahrajane"));
			students.add(new Etudiant( "aymen" ,"65","aymen.b@gmail.com" ,"25698632",  "100 rue de mahrajane"));
			students.add( new Etudiant("hassen" ,"65","aymen.b@gmail.com" ,"25698632",  "98 rue de mahrajane"));
			
		
			e.addAttribute("students", students);
		
			
			
	/*		
		String nom ="bassem ben dhief";
		String age = "33";
		String email= "ben dhief.b@gmail.com";
		String tel= "20389323";
		String adresse= "8 rue de caire sité mahrajane ben arous";
		
		
	
		e.addAttribute( "name",nom);
		e.addAttribute( "Age",age);
		e.addAttribute( "Email",email);
		e.addAttribute( "Tel",tel);
		e.addAttribute( "Adresse",adresse);
		*/
		
			
			
			return "/home/etudiant";
			
			
		
		
		
	}
		
		
		
		@RequestMapping("/add")
		public String addEtudiants() {
	
			return "/home/addstudent";
			
		}
	
	
	

}
