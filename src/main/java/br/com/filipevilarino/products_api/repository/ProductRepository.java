package br.com.filipevilarino.products_api.repository;

import br.com.filipevilarino.products_api.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, String> {

    List<Product> findByName(String name);

}
