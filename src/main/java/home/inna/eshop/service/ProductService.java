package home.inna.eshop.service;

import home.inna.eshop.entity.commodity.Product;

import java.util.List;

public interface ProductService {

    List<Product> findBySectionId(Long sectionId);
}
