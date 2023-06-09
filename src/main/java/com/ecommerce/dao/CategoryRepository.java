package com.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ecommerce.entity.Category;


@CrossOrigin("http://localhost:4200")
@Repository
@RepositoryRestResource(collectionResourceRel = "Category",path = "product-category")
public interface CategoryRepository extends JpaRepository<Category, Long>  {

}
