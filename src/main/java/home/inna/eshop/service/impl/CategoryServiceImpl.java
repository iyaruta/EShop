package home.inna.eshop.service.impl;

import home.inna.eshop.entity.commodity.Category;
import home.inna.eshop.repository.CategoryRepository;
import home.inna.eshop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> findByCatalogId(Long catalogId) {
        return categoryRepository.findByCatalogId(catalogId);
    }

    @Override
    public Category getId(Long id){
        return categoryRepository.findOne(id);
    }

}
