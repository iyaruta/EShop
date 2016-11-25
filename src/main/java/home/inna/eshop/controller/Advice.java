package home.inna.eshop.controller;

import home.inna.eshop.entity.commodity.Catalog;
import home.inna.eshop.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@ControllerAdvice
public class Advice {

    @Autowired
    private CatalogService catalogService;

    @ModelAttribute("catalogs")
    public List<Catalog> catalogs() {
        return catalogService.findAll();
    }

}
