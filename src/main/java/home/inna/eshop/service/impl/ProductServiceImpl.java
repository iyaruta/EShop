package home.inna.eshop.service.impl;

import home.inna.eshop.entity.commodity.Product;
import home.inna.eshop.repository.ProductRepository;
import home.inna.eshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findBySectionId(Long sectionId){
        return productRepository.findBySectionId(sectionId);
    }

}
