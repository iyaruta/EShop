package home.inna.eshop.service;

import home.inna.eshop.entity.commodity.Catalog;

import java.util.List;

public interface CatalogService {

    List<Catalog> findAll();

    Catalog get(Long id);
}
