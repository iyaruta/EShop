package home.inna.eshop.service;

import home.inna.eshop.entity.commodity.Basket;

import java.util.List;
import java.util.Map;

public interface BasketService {

    List<Basket>  get(Map<Long, Integer> basket);

}
