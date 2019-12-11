package io.accenture.components.cart.repository;

import io.accenture.components.cart.module.ShoppingCart;

import java.util.List;

public interface ShoppingCartRepository {

    ShoppingCart create(ShoppingCart item);
    ShoppingCart find(Long id);
    ShoppingCart update(Long id, ShoppingCart item);
    void delete (Long id);
    List<ShoppingCart> list();

}
