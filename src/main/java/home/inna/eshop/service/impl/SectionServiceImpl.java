package home.inna.eshop.service.impl;

import home.inna.eshop.entity.commodity.Product;
import home.inna.eshop.entity.commodity.Section;
import home.inna.eshop.repository.ProductRepository;
import home.inna.eshop.repository.SectionRepository;
import home.inna.eshop.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectionServiceImpl implements SectionService {

    @Autowired
    private SectionRepository sectionRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Section> findByCategoryId(Long categoryId) {
        return sectionRepository.findByCategoryId(categoryId);
    }

    @Override
    public List<Product> getId(Long id) {
        return productRepository.findBySectionId(id);
    }


}
