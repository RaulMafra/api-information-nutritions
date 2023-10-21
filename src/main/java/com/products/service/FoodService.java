package com.products.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.model.Food;
import com.products.repository.FoodRepository;

@Service
public class FoodService {
	
	@Autowired
	private FoodRepository repository;

	public List<Food> listFoods() {
		return repository.findAll();
	}

	public Food getNameFood(String name) {
		return repository.findByName(name);
	}

	public void persistenceFood(Food food) {
		repository.save(food);
	}

	public void deleteFood(Integer id) {
		repository.deleteById(id);
		
	}

	public void updateFood(Food food, Integer id) {
		Food nameFood = repository.findById(id).get();
		nameFood.setName(food.getName());
		nameFood.setColories(food.getColories());
		nameFood.setFatTotal(food.getFatTotal());
		nameFood.setFatSaturated(food.getFatSaturated());
		nameFood.setProtein(food.getProtein());
		nameFood.setSodium(food.getSodium());
		nameFood.setPotassium(food.getPotassium());
		nameFood.setCarbohydratesTotal(food.getCarbohydratesTotal());
		nameFood.setFiber(food.getFiber());
		repository.save(nameFood);

	}

}
