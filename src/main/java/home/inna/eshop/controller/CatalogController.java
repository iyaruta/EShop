package home.inna.eshop.controller;

import home.inna.eshop.entity.commodity.Category;
import home.inna.eshop.entity.commodity.Catalog;
import home.inna.eshop.service.CategoryService;
import home.inna.eshop.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private CatalogService catalogService;

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String get(@PathVariable Long id, Model model) {
        Catalog catalogs = catalogService.get(id);
        model.addAttribute("catalog", catalogs);

        List<Category> categoryList = categoryService.findByCatalogId(id);
        model.addAttribute("categories", categoryList);
        return "catalog/category/categoryShow";
    }




}
