package home.inna.eshop.service.impl;

import home.inna.eshop.entity.commodity.Basket;
import home.inna.eshop.entity.commodity.Product;
import home.inna.eshop.repository.ProductRepository;
import home.inna.eshop.service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toList;

@Service
public class BasketServiceImpl implements BasketService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Basket> get(Map<Long, Integer> basket) {
        return basket.entrySet().stream().map(e -> toBasket(e.getKey(), e.getValue())).collect(toList());
    }

    private Basket toBasket(Long productId, Integer count) {
        Product product = productRepository.findById(productId);
        return new Basket(product, count);
    }

}
