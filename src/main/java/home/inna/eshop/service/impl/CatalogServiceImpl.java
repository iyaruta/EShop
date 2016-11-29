package home.inna.eshop.service.impl;

import home.inna.eshop.entity.commodity.Catalog;
import home.inna.eshop.repository.CatalogRepository;
import home.inna.eshop.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private CatalogRepository catalogRepository;

    @Override
    public List<Catalog> findAll() {
        return catalogRepository.findAll();
    }

    @Override
    public Catalog get(Long id) {return catalogRepository.findOne(id);}


}
