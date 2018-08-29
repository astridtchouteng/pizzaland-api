package be.pizzaland;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import be.pizzaland.domain.Categorie;
import be.pizzaland.domain.Produit;
import be.pizzaland.repository.ICategoriesRepository;
import be.pizzaland.repository.IProduitsRepository;

@SpringBootApplication
public class PizzaLandBackApplication {

	@Autowired
	private IProduitsRepository repoProduits;
	
	@Autowired
	private ICategoriesRepository repoCategories;
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(PizzaLandBackApplication.class, args);
	
	}
	
	
	@Bean
	CommandLineRunner run() {
		return args ->{
			System.out.println(" ============= LISTE des PRODUITS DE LA CATEGORIE Boisson");
		
			repoCategories.findProduitsByTitre("Boisson").forEach(System.out::println);
		
		
		};
	}
	
//	@Bean
//	CommandLineRunner run() {
//		return args ->{
//			
//			Categorie c = new Categorie();
//			c.setTitre("Pizza");
//			c.setProduits(new HashSet<Produit>());
//			
//			Produit p = new Produit();
//			p.setNom("pizza fromage");
//			p.setDescription("Au gout tres fin");
//			p.setPrix(new BigDecimal(8.5));
//			p.setCategorie(c);
//			
//			Produit p2 = new Produit();
//			p2.setNom("pizza barbecue");
//			p2.setDescription("Au gout raffiné");
//			p2.setPrix(new BigDecimal(10.5));
//			p2.setCategorie(c);
//			
//			Produit p3 = new Produit();
//			p3.setNom("pizza jambon");
//			p3.setDescription("Au gout Whaouuu");
//			p3.setPrix(new BigDecimal(6.5));
//			p3.setCategorie(c);
//			
//			
//			c.getProduits().add(p3);
//			c.getProduits().add(p2);
//			c.getProduits().add(p);
//			
//			repoCategories.save(c);
//			
//			repoProduits.save(p);
//			repoProduits.save(p2);
//			repoProduits.save(p3);
//			
//			Categorie c = new Categorie();
//			c.setTitre("Boisson");
//			c.setProduits(new HashSet<Produit>());
//			
//			Produit p = new Produit();
//			p.setNom("Coca");
//			p.setDescription("Made in Belgium");
//			p.setPrix(new BigDecimal(8.5));
//			p.setCategorie(c);
//			
//			Produit p2 = new Produit();
//			p2.setNom("Fanta");
//			p2.setDescription("Couleur Orange");
//			p2.setPrix(new BigDecimal(10.5));
//			p2.setCategorie(c);
//			
//			Produit p3 = new Produit();
//			p3.setNom("Sprite");
//			p3.setDescription("Au gout Whaouuu");
//			p3.setPrix(new BigDecimal(6.5));
//			p3.setCategorie(c);
//			
//			
//			c.getProduits().add(p3);
//			c.getProduits().add(p2);
//			c.getProduits().add(p);
//			
//			repoCategories.save(c);
//			
//			repoProduits.save(p);
//			repoProduits.save(p2);
//			repoProduits.save(p3);
//			
//			
//			
//			
//		};
//	}
//	
	
}
