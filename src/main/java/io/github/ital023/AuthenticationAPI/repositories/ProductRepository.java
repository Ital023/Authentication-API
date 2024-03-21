package io.github.ital023.AuthenticationAPI.repositories;

import io.github.ital023.AuthenticationAPI.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}