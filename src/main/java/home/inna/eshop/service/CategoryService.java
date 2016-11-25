package home.inna.eshop.service;

import home.inna.eshop.entity.commodity.Category;
import java.util.List;

public interface CategoryService {

    List<Category> findByCatalogId(Long catalogId);

    Category getId(Long id);
}
