package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.dao.ProductRepository;
import com.ecommerce.entity.Product;
@RestController
public class ProductController {

	@Autowired
	private ProductRepository productRepository;
	
//	@GetMapping("/products")
//	List<Product> getAllProducts(){
//		return productRepository.findAll();
//	}
	
//	@GetMapping("findProductsByGender")
//	 public ResponseEntity<List<Product>> findProductsByGender(@RequestParam (name="gender") String gender){
//		 List<Product> list = productRepository.findProductsByGender(gender);
//		 return new ResponseEntity<List<Product>>(list,HttpStatus.OK);
//	}
	
	
	
//	@GetMapping("/products/{gender}/{subcategory}")
//	public Page<Product> getProductsByCategoryAndSubCategory
//	(@PathVariable("gender") String gender, @PathVariable("subcategory") Long subcategory) {
//		try {
//			return this.productRepository.findProductsByGenderAndSubCategory_Id(gender, subcategory);
//		}
//		catch(Exception e) {
//			System.out.println("Error thrown");
//			System.out.println(e.getMessage());
//		}
//		return this.productRepository.findProductsByGenderAndSubCategory_Id(gender, subcategory);
//	}
//		ProductCategory pc=productCategoryRepository.findById(category).orElseThrow();
//		ProductSubCategory ps=productSubCategoryRepository.findById(subcategory).orElseThrow();
//		List<Product>p= productRepository.findByProductCategoryAndProductSubCategory(pc,ps);
//		p.forEach(e->System.out.println(e));
//		return p;
//	} 
}
