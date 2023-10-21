package com.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.products.model.Food;
import com.products.service.FoodService;

@RestController
@RequestMapping("/v1/food")
public class FoodController {
	
	@Autowired
	private FoodService service;
	
	@GetMapping
	public List<Food> findFoods() {
		return service.listFoods();
	}
	
	@GetMapping("/{name}")
	public Food getFood(@PathVariable String name) {
		return service.getNameFood(name);
	}
	
	@PostMapping
	public void saveFood(@RequestBody Food food) {
		service.persistenceFood(food);
	}
	
	@DeleteMapping("/{id}")
	public void deleteFood(@PathVariable Integer id) {
		service.deleteFood(id);
	}
	
	@PutMapping("/{id}")
	public void updateFood(@RequestBody Food food, @PathVariable Integer id) {
		service.updateFood(food, id);
	}
	

}
