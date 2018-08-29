package be.pizzaland.restcontroller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.pizzaland.domain.Categorie;
import be.pizzaland.domain.Produit;
import be.pizzaland.repository.ICategoriesRepository;

@RestController
@RequestMapping("/")
@CrossOrigin(origins="*")
public class CategorieRestController {
	
	@Autowired
	private ICategoriesRepository repoCat;
	
	
	@GetMapping
	public List<Categorie> getAll(){
		
		System.out.println(repoCat.findProduitsByTitre("Boisson"));
		return repoCat.findAll();
	}
	
	@GetMapping("{categorie}")
	public List<Produit> getProduitByCategorie(@PathParam("categorie") String titre){
		return repoCat.findProduitsByTitre(titre);
	}
	
	
//	@GetMapping("/{categorie}")
//	public List<Produit> getProduitByCategories(@PathVariable String categorie){
//		System.out.println(" >>>>>> "+ categorie);
//		return  repoCat.findProduitsByTitre(categorie);
//		
//	}
//	
//	@GetMapping
//	public List<Produit> getProduitByCategorie(@RequestParam("categorie") String titre){
//		System.out.println(titre);
//		return  repoCat.findProduitsByTitre(titre);
//		
//	}

}
