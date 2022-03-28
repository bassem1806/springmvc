package com.sip.ams.Entities;

public class Etudiant {
	
	
	String nom;
	String age;
	String email;
	String tel;
	String adresse;
	
	
	public Etudiant (String nom ,String age,String email,String tel, String adresse) {
		
		this.nom =nom;
		this.age =age;
		this.email =email;
		this.tel =tel;
		this.adresse =adresse;
		
		
		
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
}


	