package home.inna.eshop.controller;

import home.inna.eshop.entity.commodity.Catalog;
import home.inna.eshop.entity.commodity.Category;
import home.inna.eshop.entity.commodity.Product;
import home.inna.eshop.service.CategoryService;
import home.inna.eshop.service.ProductService;
import home.inna.eshop.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("section")
public class SectionController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private SectionService sectionService;

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String get(@PathVariable Long id, Model model) {
        List<Product> productList = sectionService.getId(id);
        model.addAttribute("products", productList);
        return "catalog/category/productShow";
    }

}
