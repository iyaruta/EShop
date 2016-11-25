package home.inna.eshop.controller;

import home.inna.eshop.entity.commodity.Category;
import home.inna.eshop.entity.commodity.Section;
import home.inna.eshop.service.CategoryService;
import home.inna.eshop.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private SectionService sectionService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String get(@PathVariable Long id, Model model){
        List<Section> sectionList = sectionService.findByCategoryId(id);
        model.addAttribute("sections", sectionList);
        return "catalog/category/sectionShow";
    }
}
