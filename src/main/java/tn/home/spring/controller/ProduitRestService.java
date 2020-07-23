package tn.home.spring.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.home.spring.dao.ProduitRepository;
import tn.home.spring.entities.Produit;


@RestController
public class ProduitRestService {

	@Autowired
	private ProduitRepository produitRepo;
	
	@GetMapping("/listProduits")
	public List<Produit> listProduits(){
		return produitRepo.findAll();
	}
	@GetMapping("/listProduits/{id}")
	public Produit listProduits(@PathVariable (name="id") Long id){
		return produitRepo.findById(id).get();
	}
	@PostMapping("/produitCreate")
	public Produit createTicket(@RequestBody Produit prod){
		return produitRepo.save(prod);
	}
	@DeleteMapping(value="/produitDelete/{id}")
	public void deleteTicket(@PathVariable("id")Long id){
		produitRepo.deleteById(id);
	}
	@PutMapping(value="/produitMod")
	public Produit updateTicket(@RequestBody Produit produit){
		return produitRepo.save(produit);
	}
	
	
}
