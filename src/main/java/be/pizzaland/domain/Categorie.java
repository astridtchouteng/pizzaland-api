package be.pizzaland.domain;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.NonNull;

@Entity
@Table(name="category")
public class Categorie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * LAZY :  lorsque je charge la categorie je peux ne pas charger le produit
	 */
	@OneToMany(cascade = CascadeType.ALL,
				fetch = FetchType.LAZY,
				mappedBy = "categorie")
	private Set<Produit> produits;
	
	@Column(name = "TITRE", unique= true)
	@NonNull
	@Size(min=5,max=50)
	private String titre;
	
	public Categorie() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<Produit> getProduits() {
		return produits;
	}

	public void setProduits(Set<Produit> produits) {
		this.produits = produits;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	
	
}
