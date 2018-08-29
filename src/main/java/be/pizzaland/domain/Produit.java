package be.pizzaland.domain;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.NonNull;

@Entity
@Table(name="produits")

public class Produit {

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	
	@NonNull
	@Size(min=2,max=30)
	@Column(name="NOM")
	private String nom;
	
	@NonNull
	@Size(min=5,max=50)
	@Column(name="DESCRIPTION")
	private String description;
	
	@NonNull
	@Column(name="PRIX")
	private BigDecimal prix;
	
	
	@JsonIgnore
	/*
	 * EAGER : lorsque je charge un produit je charge la categorie
	 */
	@ManyToOne(fetch = FetchType.EAGER/*, cascade = CascadeType.PERSIST*/)
	@JoinColumn(name="CATEGORIE_ID", nullable = false)
	private Categorie categorie;
	
	public Produit() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrix() {
		return prix;
	}

	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}


	@Override
	public String toString() {
		return "Produit [id=" + id + ", nom=" + nom + ", description=" + description + ", prix=" + prix + ", categorie="
				+ categorie + "]";
	}

	
}
