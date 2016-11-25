package home.inna.eshop.repository;

import home.inna.eshop.entity.commodity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    List<Category> findByCatalogId(Long catalogId);



}
