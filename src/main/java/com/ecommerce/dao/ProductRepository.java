package com.ecommerce.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ecommerce.entity.Product;

@CrossOrigin("http://localhost:4200")
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	List<Product>	findProductsByGenderAndCategory_Id(@Param("gender") String gender, @Param("categoryId") Long categoryId);
	List<Product>	findProductsByGender( String gender);
	List<Product>	findByNameContaining(@Param("name") String name);
	//List<Product>	findAllProducts();
	
	
	
//	Page<Product>	findProductsByGenderAndCategory_Id(@Param("gender") String gender, @Param("categoryId") Long categoryId,Pageable pageable);
//	Page<Product>	findProductsByGender(@Param("gender") String gender,Pageable pageable);
//	Page<Product>	findByNameContaining(@Param("name") String name, Pageable pageable);
	
//	@Query("select p,s From Product p join subCategory s on p.subCategory.id=s.id where p.gender=:gender and p.subCategory.id=:subcategoryId")	
//	List<Object[]>	findProductsByGenderAndSubCategory_Id(@Param("gender") String gender,@Param("subcategoryId") Long subcategoryId);
//	List<Product>	findProductsByGender(String gender);
//	List<Product> findProductByCategory_IdAndSubCategory_Id( Long categoryId, Long subcategoryId);
	
	
	//http://localhost:8081/products/search/findProductsByGenderAndSubCategory_Id?gender=Women&subcategoryId=3
	//http://localhost:8081/products/search/findProductsByGender?gender=Women
	//@Query("select p From Product p join fetch p.category join fetch p.subCategory where p.category.id=?1 and p.subCategory.id=?2")
	//@Query("select p From Product p where p.category_id=:category_id and p.subcategory_id=:subcategory_id")
	//List<Product> findProductByCategoryAndSubCategory(@Param(value = "category_id") Long category, @Param(value = ":subcategory_id") Long subcategory);
}
