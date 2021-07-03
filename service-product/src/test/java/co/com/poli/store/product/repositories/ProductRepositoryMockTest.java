package co.com.poli.store.product.repositories;

import co.com.poli.store.product.entities.Category;
import co.com.poli.store.product.entities.Product;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
public class ProductRepositoryMockTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void whenFindByCategory_the_ReturnListProduct() {
        Product product = Product.builder()
                .name("Titanes")
                .description("Tom Ferries")
                .stock(10D)
                .price(1000D)
                .category( Category.builder().id(1L).build() )
                .build();

        productRepository.save(product);

        List<Product> products = productRepository.findByCategory(product.getCategory());

        Assertions.assertThat(products.size()).isEqualTo(1);

    }

}
