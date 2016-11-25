package home.inna.eshop.service;

import home.inna.eshop.entity.commodity.Category;
import home.inna.eshop.entity.commodity.Product;
import home.inna.eshop.entity.commodity.Section;

import java.util.List;

public interface SectionService {

    List<Section> findByCategoryId(Long categoryId);

    List<Product> getId(Long id);
}
