package be.pizzaland.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.pizzaland.domain.Produit;
import be.pizzaland.repository.IProduitsRepository;

@RestController
@RequestMapping("/produits")
public class ProduitsRestController {
	
	@Autowired
	private IProduitsRepository repo;
	
	@GetMapping
	public List<Produit> getAllProduits(){
		return repo.findAll();
	}
	
	

}
