package io.accenture.components.item.repository;

import io.accenture.components.item.module.Item;

import java.util.List;

public interface ItemRepository {

    Item create(Item item);
    Item find(Long id);
    Item update(Long id, Item item);
    void delete (Long id);
    List<Item> list();

}
