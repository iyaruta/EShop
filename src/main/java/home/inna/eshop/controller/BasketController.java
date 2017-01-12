package home.inna.eshop.controller;

import home.inna.eshop.entity.commodity.Product;
import home.inna.eshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
@RequestMapping("basket")
public class BasketController {

    @Autowired
    private ProductService productService;

    @RequestMapping
    public String get(Model model, HttpSession session) {
        Map<Long, BasketLine> basket = getBasket(session);
        model.addAttribute("lines", basket.values());
        return "shopping/basket";
    }

    @RequestMapping(value = "/{productId}/add", method = RequestMethod.GET)
    public String addProduct(@PathVariable Long productId, HttpSession session) {
        Map<Long, BasketLine> basket = getBasket(session);
        Product product = productService.getId(productId);
        BasketLine line = basket.getOrDefault(productId, new BasketLine( product));
        line.count++;
        basket.put(productId, line);
        session.setAttribute("basket", basket);

        return "redirect:/category/" + product.getSectionId();
    }

    @RequestMapping(value = "/id/remove", method = RequestMethod.GET)
    public String removeProductId(@PathVariable("id") Long productId, HttpSession session){
        Map<Long, BasketLine> basket = getBasket(session);
        basket.remove(productId);
        return "redirect:/shopping/basket" ;

    }

    private Map<Long, BasketLine> getBasket(HttpSession session) {
        Map<Long, BasketLine> basket = (Map<Long, BasketLine>) session.getAttribute("basket");
        if (basket == null) {
            basket = new HashMap<>();
        }

        return basket;
    }

    public static class BasketLine {
        Product product;
        int count;

        public BasketLine(Product product) {
            this.product = product;
        }

        public Product getProduct() {
            return product;
        }

        public void setProduct(Product product) {
            this.product = product;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }
}
