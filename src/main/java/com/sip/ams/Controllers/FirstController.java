package com.sip.ams.Controllers;


import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sip.ams.Entities.Etudiant;

@Controller
public class FirstController {
	
	static ArrayList<Etudiant> students = new ArrayList<Etudiant>();
	
	static {
		
		
		students.add(new Etudiant("bassem" ,"22","bendhief.b@gmail.com" ,"20389326",  "8 rue de mahrajane"));
		students.add(new Etudiant( "aymen" ,"65","aymen.b@gmail.com" ,"25698632",  "100 rue de mahrajane"));
		students.add( new Etudiant("hassen" ,"35","hassen.b@gmail.com" ,"25698632",  "98 rue de mahrajane"));
		
	}
	



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
			
						
		
			e.addAttribute("students", students);		
				
			return "/home/etudiant";
		
	}
		
		
		
		@RequestMapping("/add")
		public String addEtudiants(Model e) {
	
			return "/home/addstudent";
			
		}
	
		
		//methode save ajout
		
		
		
		@PostMapping("/save")
	//	@ResponseBody
		public String saveEtudiants(@RequestParam("nom")String nom,
				@RequestParam("age")String age,	
				@RequestParam("email")String email,
				@RequestParam("tel")String tel,
				@RequestParam("adresse")String adresse
				
				) 
		{
	
		
			
			Etudiant temp = new Etudiant(nom,age,email,tel,adresse);
			students.add(temp);
			return  "redirect:list";
		
			
		}
		
		//methode delete
		
		@GetMapping("/delete/{email}")
	//	@ResponseBody
		public String deleteEtudiants(@PathVariable ("email") String mail ) {
	
			
			Etudiant temp = null;
			for(Etudiant e : students) 
			
			{
			if(e.getEmail().equals(mail))	
			{temp =e;
			}
				
			}
			students.remove(temp);
			return "redirect:../list";
			
		}
		
		
		//methode modifier
		
	//methode delete
		
		@GetMapping("/modifier/{email}")
		@ResponseBody
		public String modifierEtudiants(@PathVariable ("email") String mail ) {
	
			return "email :"+mail;
			
		}
	


}
