package edu.mum.cs.cs425.prodmgmt.dao;

import org.springframework.data.repository.CrudRepository;

import edu.mum.cs.cs425.prodmgmt.model.Product;

public interface ProductRepository extends CrudRepository<Product,Long> {
}