//package com.ecommerce.entity;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.sql.Date;
//
//import org.assertj.core.api.AbstractIntegerAssert;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.ecommerce.dao.ProductRepository;
//@ExtendWith(MockitoExtension.class)
//class ProductTest {
//	@Autowired
//	ProductRepository productRepository;
//
//	
//	
//	@Test
//	@Order(1)
//	public void addProduct() {
//		Product p=new Product();
//		p.setId(168L);
//		p.setProduct_id(4555);
//		p.setName("Nike black sport shoe");
//		p.setDescription("Sport Shoe");
//		p.setUnitPrice(3300);
//		p.setImageUrl("assets/images/products/Men/Shoes/4555.jpg");
//		p.setActive(true);
//		p.setUnitsInStock(100);
//		 long millis=System.currentTimeMillis();  
//		p.setDateCreated(new Date(millis));
//		p.setColour("Back");
//		p.setProductUsage("Sports");
//		Category c=new Category();
//		c.setId(3L);
//		c.setCategoryName("Shoes");
//		p.setCategory(c);
//		p.setGender("Men");
//		productRepository.save(p);
//	}
//	
//	
//	@Test
//	@Order(2)
//	void testFindAll() {
//		//fail("Not yet implemented");
//		int res = productRepository.findAll().size();
//		System.out.println(res);
//	}
//	
//	@Test
//	@Order(3)
//	void testDeleteById() {
//		//fail("Not yet implemented");
//		productRepository.deleteById(168L);
//		int res = productRepository.findAll().size();
//		System.out.println(res);
//	}
//
//}
