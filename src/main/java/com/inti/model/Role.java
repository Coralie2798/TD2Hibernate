package com.inti.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRole;
	private String nomRole;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="Utilisateur_Role",
	joinColumns = @JoinColumn(name="idR"),
	inverseJoinColumns = @JoinColumn(name="idU"))
	private List<Utilisateur> listeU;
	
	
	public Role() {
		super();
	}

	public Role(String nomRole) {
		super();
		this.nomRole = nomRole;
	}

	public int getIdRole() {
		return idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	public String getNomRole() {
		return nomRole;
	}

	public void setNomRole(String nomRole) {
		this.nomRole = nomRole;
	}

	public List<Utilisateur> getListeU() {
		return listeU;
	}

	public void setListeU(List<Utilisateur> listeU) {
		this.listeU = listeU;
	}

	@Override
	public String toString() {
		return "Role [idRole=" + idRole + ", nomRole=" + nomRole + "]";
	}
	
}
