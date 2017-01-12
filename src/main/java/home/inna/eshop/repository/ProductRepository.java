package home.inna.eshop.repository;

import home.inna.eshop.entity.commodity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findBySectionId(Long sectionId);

    Product findById(Long productId);

    List<Product> findByName(Long productId);


}
