package com.products.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Food {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_food")
	private Integer id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private Double colories;
	@Column(nullable = false)
	private Double fatTotal;
	@Column(nullable = false)
	private Double fatSaturated;
	@Column(nullable = false)
	private Double protein;
	@Column(nullable = false)
	private Double sodium;
	@Column(nullable = false)
	private Double potassium;
	@Column(nullable = false)
	private Double carbohydratesTotal;
	@Column(nullable = false)
	private Double fiber;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getColories() {
		return colories;
	}

	public void setColories(Double colories) {
		this.colories = colories;
	}

	public Double getFatTotal() {
		return fatTotal;
	}

	public void setFatTotal(Double fatTotal) {
		this.fatTotal = fatTotal;
	}

	public Double getFatSaturated() {
		return fatSaturated;
	}

	public void setFatSaturated(Double fatSaturated) {
		this.fatSaturated = fatSaturated;
	}

	public Double getProtein() {
		return protein;
	}

	public void setProtein(Double protein) {
		this.protein = protein;
	}

	public Double getSodium() {
		return sodium;
	}

	public void setSodium(Double sodium) {
		this.sodium = sodium;
	}

	public Double getPotassium() {
		return potassium;
	}

	public void setPotassium(Double potassium) {
		this.potassium = potassium;
	}

	public Double getCarbohydratesTotal() {
		return carbohydratesTotal;
	}

	public void setCarbohydratesTotal(Double carbohydratesTotal) {
		this.carbohydratesTotal = carbohydratesTotal;
	}

	public Double getFiber() {
		return fiber;
	}

	public void setFiber(Double fiber) {
		this.fiber = fiber;
	}

	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", colories=" + colories + ", fatTotal=" + fatTotal
				+ ", fatSaturated=" + fatSaturated + ", protein=" + protein + ", sodium=" + sodium + ", potassium="
				+ potassium + ", carbohydratesTotal=" + carbohydratesTotal + ", fiber=" + fiber + "]";
	}

}
