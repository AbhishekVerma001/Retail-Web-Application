package com.ecommerce.entity;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	
	
	@Column(name = "product_id")
	private int product_id;
	
	@ManyToOne
	@JoinColumn(name = "category_id",nullable = false)
	//@JsonBackReference
	private Category category;
	

//	@ManyToOne
//	@JoinColumn(name = "subcategory_id",nullable = false)
//	private ProductSubCategory subCategory;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "unit_price")
	private int unitPrice;
	
	@Column(name = "image_url")
	private String imageUrl;
	
	@Column(name = "active")
	private boolean active;
	
	@Column(name = "units_in_stock")
	private int unitsInStock;
	
	@Column(name = "date_created")
	@CreationTimestamp
	private Date dateCreated;
	
	@Column(name = "last_updated")
	@UpdateTimestamp                   //hibernate will automatically manage the timestamps, will automatically set 
	private Date lastUpdated;			// these fields
	
	@Column(name = "colour")
	private String colour;
	
	@Column(name = "product_usage")
	private String productUsage;
}
