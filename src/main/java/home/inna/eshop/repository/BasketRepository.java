package home.inna.eshop.repository;

import home.inna.eshop.entity.commodity.BasketLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasketRepository extends JpaRepository<BasketLine, Long> {



}
