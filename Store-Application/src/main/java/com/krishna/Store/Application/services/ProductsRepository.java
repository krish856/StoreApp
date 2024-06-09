//package com.krishna.Store.Application.services;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import com.krishna.Store.Application.models.Product;
//
//public interface ProductsRepository extends JpaRepository<Product, Integer > {
//
//}
package com.krishna.Store.Application.services;

import org.springframework.data.jpa.repository.JpaRepository;
import com.krishna.Store.Application.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {
}
