package home.inna.eshop.service;

import home.inna.eshop.entity.commodity.BasketLine;

import java.util.List;
import java.util.Map;

public interface BasketService {

    List<BasketLine>  get(Map<Long, Integer> basket);

}
