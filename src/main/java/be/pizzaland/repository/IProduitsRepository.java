package be.pizzaland.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import be.pizzaland.domain.Produit;

public interface IProduitsRepository extends JpaRepository<Produit, Long> {

}
