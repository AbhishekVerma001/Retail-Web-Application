package com.ecommerce;



import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import java.net.URI;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.ecommerce.dao.ProductRepository;
import com.ecommerce.dto.AuthRequest;
import com.ecommerce.dto.JwtResponse;
import com.ecommerce.entity.Product;
import com.google.gson.JsonArray;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
@TestMethodOrder(OrderAnnotation.class)
@DirtiesContext
class RetailWebApplicationTests {
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	TestRestTemplate restTemplate;
	AuthRequest auth =new AuthRequest();

//	@Test
//	void contextLoads() {
//	}
	
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
//		p.setColour("Black");
//		p.setProductUsage("Sports");
//		Category c=new Category();
//		c.setId(3L);
//		c.setCategoryName("Shoes");
//		p.setCategory(c);
//		p.setGender("Men");
//		productRepository.save(p);
//	}
	
	
	@Test
	//@Order(2)
	void testFindAll() {
		//fail("Not yet implemented");
		//int res = 
			assertThat(productRepository.findAll()).size().isGreaterThan(0);
		//System.out.println(res);
	}
	
//	@Test
//	@Order(3)
//	void testDeleteById() {
//		//fail("Not yet implemented");
//		productRepository.deleteById(168L);
//		assertThat(productRepository.findById(168L)).isEmpty();
////		int res = productRepository.findAll().size();
////		System.out.println(res);
//	}
	@Test
	//@Order(4)
    public void testFindProducts() throws Exception {
		
		
		assertThat(productRepository.findAll()).size().isGreaterThan(0);
		
//		final String tokenUrl = "http://localhost:8080/auth/token";
//        URI tokenUri = new URI(tokenUrl);
//        auth.setUsername("Abc@gmail.com");
//		auth.setPassword("A1234567");
//         
//        HttpHeaders tokenHeaders = new HttpHeaders();
//        tokenHeaders.set("Content-Type", "application/json");
//        
//        
//        
//        HttpEntity<AuthRequest> tokenRequest = new HttpEntity<>(auth, tokenHeaders);
//         
//        ResponseEntity<JwtResponse> tokenResult = this.restTemplate.postForEntity(tokenUri, tokenRequest, JwtResponse.class);
//        String token=tokenResult.getBody().getToken();
//	
//        System.out.println(token);
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Content-Type", "application/json");
//        headers.add("Authorization", "Bearer "+token);
//        HttpEntity<Product> request = new HttpEntity<>( headers);
//        URI uri = new URI("/products");
//        //ResponseEntity<JsonArray> result = this.restTemplate.postForEntity(uri, request, JsonArray.class);
//        
//        ResponseEntity<JsonArray> entity = new TestRestTemplate().exchange(
//        		uri, HttpMethod.GET, request,
//                JsonArray.class);
//        System.out.println(entity.getBody());
//       
//        Assertions.assertEquals(200, entity.getStatusCode().value());
//        assertNotNull(entity);
    }
	@Test
	//@Order(5)
    public void testFindProductsByGender() throws Exception {
		
		assertThat(productRepository.findProductsByGender("Men")).size().isGreaterThan(0);

//		final String tokenUrl = "http://localhost:8080/auth/token";
//        URI tokenUri = new URI(tokenUrl);
//        auth.setUsername("Abc@gmail.com");
//		auth.setPassword("A1234567");
//         
//        HttpHeaders tokenHeaders = new HttpHeaders();
//        tokenHeaders.set("Content-Type", "application/json");
//        
//        
//        
//        HttpEntity<AuthRequest> tokenRequest = new HttpEntity<>(auth, tokenHeaders);
//         
//        ResponseEntity<JwtResponse> tokenResult = this.restTemplate.postForEntity(tokenUri, tokenRequest, JwtResponse.class);
//        String token=tokenResult.getBody().getToken();
//	
//        System.out.println(token);
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Content-Type", "application/json");
//        headers.add("Authorization", "Bearer "+token);
//        HttpEntity<Product> request = new HttpEntity<>( headers);
//        
//        //ResponseEntity<Product> result = this.restTemplate.postForEntity(uri, request, UserCredential.class);
//         
//        ResponseEntity<Object> entity = new TestRestTemplate().exchange(
//                "http://localhost:8080/products/search/findProductsByGender?gender=Men", HttpMethod.GET, request,
//                Object.class);
//        
//        System.out.println(entity.getBody());
//        
//        Assertions.assertEquals(200, entity.getStatusCode().value());
//        assertNotNull(entity);
//       
    }
	@Test
	//@Order(6)
    public void testFindProductsByGenderAndCategory_Id() throws Exception {

		assertThat(productRepository.findProductsByGenderAndCategory_Id("Men",2L)).size().isGreaterThan(0);
//		final String tokenUrl = "http://localhost:8080/auth/token";
//        URI tokenUri = new URI(tokenUrl);
//        auth.setUsername("Abc@gmail.com");
//		auth.setPassword("A1234567");
//         
//        HttpHeaders tokenHeaders = new HttpHeaders();
//        tokenHeaders.set("Content-Type", "application/json");
//        
//        
//        
//        HttpEntity<AuthRequest> tokenRequest = new HttpEntity<>(auth, tokenHeaders);
//         
//        ResponseEntity<JwtResponse> tokenResult = this.restTemplate.postForEntity(tokenUri, tokenRequest, JwtResponse.class);
//        String token=tokenResult.getBody().getToken();
//	
//        System.out.println(token);
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Content-Type", "application/json");
//        headers.add("Authorization", "Bearer "+token);
//        HttpEntity<Product> request = new HttpEntity<>( headers);
//        
//        
//         
//        ResponseEntity<Object> entity = new TestRestTemplate().exchange(
//                "http://localhost:8080/products/search/findProductsByGenderAndCategory_Id?gender=Men&categoryId=3", HttpMethod.GET, request,
//                Object.class);
//        
//        System.out.println(entity.getBody());
//        Assertions.assertEquals(200, entity.getStatusCode().value());
//        assertNotNull(entity);

    }
	
	@Test
	//@Order(7)
    public void testFindByNameContaining() throws Exception {
		
		assertThat(productRepository.findByNameContaining("casual")).size().isGreaterThan(0);
//		final String tokenUrl = "http://localhost:8080/auth/token";
//        URI tokenUri = new URI(tokenUrl);
//        auth.setUsername("Abc@gmail.com");
//		auth.setPassword("A1234567");
//         
//        HttpHeaders tokenHeaders = new HttpHeaders();
//        tokenHeaders.set("Content-Type", "application/json");
//        
//        
//        
//        HttpEntity<AuthRequest> tokenRequest = new HttpEntity<>(auth, tokenHeaders);
//         
//        ResponseEntity<JwtResponse> tokenResult = this.restTemplate.postForEntity(tokenUri, tokenRequest, JwtResponse.class);
//        String token=tokenResult.getBody().getToken();
//	
//        System.out.println(token);
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Content-Type", "application/json");
//        headers.add("Authorization", "Bearer "+token);
//        HttpEntity<Product> request = new HttpEntity<>( headers);
//        
//        //ResponseEntity<Product> result = this.restTemplate.postForEntity(uri, request, UserCredential.class);
//         
//        ResponseEntity<Object> entity = new TestRestTemplate().exchange(
//                "http://localhost:8080/products/search/findByNameContaining?name=casual", HttpMethod.GET, request,
//                Object.class);
//        
//        System.out.println(entity.getBody());
//        Assertions.assertEquals(200, entity.getStatusCode().value());
//        assertNotNull(entity);
    }


}
