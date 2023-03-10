package com.inti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class UtilisateurDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String adresse;
	private String ville;
	private int cp;
	private String telephone;
	private String email;
	
	@OneToOne(mappedBy = "utilisateurDetails")
//	@JoinTable(name="Utilisateur_UD",
//	joinColumns = @JoinColumn(name="idU"),
//	inverseJoinColumns = @JoinColumn(name="idUD")) //--> peu recommand√© pour les relation 1-1 sauf si on veut rajouter des infos
	private Utilisateur utilisateur;
	
	public UtilisateurDetails() {
		super();
	}

	

	public UtilisateurDetails(String adresse, String ville, int cp, String telephone, String email) {
		super();
		this.adresse = adresse;
		this.ville = ville;
		this.cp = cp;
		this.telephone = telephone;
		this.email = email;
	}

	public UtilisateurDetails(String adresse, String ville, int cp, String telephone, String email,
			Utilisateur utilisateur) {
		super();
		this.adresse = adresse;
		this.ville = ville;
		this.cp = cp;
		this.telephone = telephone;
		this.email = email;
		this.utilisateur = utilisateur;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	@Override
	public String toString() {
		return "UtilisateurDetails [id=" + id + ", adresse=" + adresse + ", ville=" + ville + ", cp=" + cp
				+ ", telephone=" + telephone + ", email=" + email + "]";
	}

	
}
