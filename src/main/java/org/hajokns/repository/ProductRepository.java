package org.hajokns.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.hajokns.entity.Product;

public class ProductRepository {

    private final List<Product> products = new ArrayList<>();

    public static Product createProduct(String title, double price) {
        return new Product(UUID.randomUUID(), title, price);
    }

    public List<Product> getProductsFromRepository() {
        return products;
    }

    public void addProductToRepository(Product product) {
        this.products.add(product);
    }

    public void removeAllProductsFromRepository() {
        this.products.clear();
    }

}
