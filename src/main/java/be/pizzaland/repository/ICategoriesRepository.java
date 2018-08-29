package be.pizzaland.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import be.pizzaland.domain.Categorie;
import be.pizzaland.domain.Produit;

public interface ICategoriesRepository extends JpaRepository<Categorie, Long> {

	//List<Produit> findProduitsByTitre(String title);

	@Query("SELECT p FROM Produit p  JOIN p.categorie c     WHERE c.titre = ?1")
	List<Produit> findProduitsByTitre(String categorieTitle);
}
