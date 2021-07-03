package co.com.poli.store.product.services;

import co.com.poli.store.product.entities.Category;
import co.com.poli.store.product.entities.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAllProducts();
    Product getProduct(Long id);
    Product createProduct(Long id);
    Product updateProduct(Long id);
    Product deleteProduct(Long id);
    List<Product> findByCategory(Category category);
    Product updateStock(Long id, Double quantity);
}
