package home.inna.eshop.repository;

import home.inna.eshop.entity.commodity.Section;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SectionRepository extends JpaRepository<Section, Long> {

    List<Section> findByCategoryId(Long categoryId);
}
