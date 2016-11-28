package home.inna.eshop.controller;

import home.inna.eshop.entity.commodity.Product;
import home.inna.eshop.service.ProductService;
import home.inna.eshop.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.persistence.PersistenceUnit;
import java.util.List;


@Controller
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private SectionService sectionService;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public String product(@PathVariable Long sectionId, Model model) {
        List<Product> productList = productService.findBySectionId(sectionId);
        model.addAttribute("product", productList);
        return "catalog/category/product";
    }


}
