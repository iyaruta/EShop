package home.inna.eshop.controller;

import home.inna.eshop.entity.commodity.BasketLine;
import home.inna.eshop.entity.commodity.Product;
import home.inna.eshop.service.BasketService;
import home.inna.eshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("shopingCart")
public class ShopingCartController {

    @Autowired
    private ProductService productService;

    @Autowired
    private BasketService basketService;

    @RequestMapping
    public String get(Model model, HttpSession session) {
        Map<Long, Integer> basket = getBasket(session);
        List<BasketLine> lines = basketService.get(basket);
        model.addAttribute("lines", lines);
        return "basket";
    }

    @RequestMapping(value = "/{productId}/add", method = RequestMethod.GET)
    public String addProduct(@PathVariable Long productId, HttpSession session) {
        Map<Long, Integer> basket = getBasket(session);
        Integer count = basket.getOrDefault(productId, 0);
        count++;
        basket.put(productId, count);
        session.setAttribute("basket", basket);

        Product product = productService.getId(productId);
        return "redirect:/category/" + product.getSectionId();
    }

    private Map<Long, Integer> getBasket(HttpSession session) {
        Map<Long, Integer> basket = (Map<Long, Integer>) session.getAttribute("basket");
        if (basket == null) {
            basket = new HashMap<>();
        }

        return basket;
    }
}
