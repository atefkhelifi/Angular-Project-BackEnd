package tn.home.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tn.home.spring.dao.ProduitRepository;
import tn.home.spring.entities.Produit;

@SpringBootApplication
public class CatalogServiceApplication /* implements CommandLineRunner */{

	@Autowired
	private ProduitRepository produitRepo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(CatalogServiceApplication.class, args);
	}

	/*
	 * @Override public void run(String... args) throws Exception {
	 * produitRepo.save(new Produit(null,"ordinateur dell",1150,3));
	 * produitRepo.save(new Produit(null,"souris gammer",25,1));
	 * produitRepo.save(new Produit(null,"impremante",350,10));
	 * produitRepo.findAll().forEach(p->{ System.out.println(p.toString()); });
	 * 
	 * }
	 */

}
