package com.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.products.model.Food;

public interface FoodRepository extends JpaRepository<Food, Integer> {

	@Query("SELECT n FROM Food n WHERE n.name = (:name)")
	public Food findByName(@Param("name") String name);
	
	@Query("DELETE FROM Food f WHERE f.name = (:name)")
	public void deleteByName(@Param("name") String name);
}
