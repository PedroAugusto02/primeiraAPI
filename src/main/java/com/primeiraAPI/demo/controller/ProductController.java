package com.primeiraAPI.demo.controller;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primeiraAPI.demo.entities.Departament;
import com.primeiraAPI.demo.entities.Product;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
	
	@GetMapping
	public List<Product> getObjects() {
		Departament d1 = new Departament(1l,"Tech");
		Departament d2 = new Departament(2l,"PetHouse");
		
		Product p1 = new Product(1L,"Macbook Pro", 4000.0 , d1);
		Product p2 = new Product(2L,"PC Gamer", 5000.0 , d1);
		Product p3 = new Product(3L,"Pet House", 300.0 , d2);
		
		List<Product> list = Arrays.asList(p1,p2,p3);
		
		return list;
	}
	
}
