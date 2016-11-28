package home.inna.eshop.controller;

import home.inna.eshop.entity.commodity.Product;
import home.inna.eshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("shopingCart")
public class ShopingCartController {

    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.GET)
    public String name() {
        return "shoping/shopingCart";
    }

//    @RequestMapping(method = RequestMethod.GET)
//    public String addProduct(Long productId, Model model, HttpServletRequest req) {
//        List<Product> productList = productService.findByProductId(productId);
//        HttpSession session = req.getSession();
//        session.setAttribute("product", productList);
//        model.addAttribute("product", productList);
//        return "shoping/shopingCart";
//    }
}
