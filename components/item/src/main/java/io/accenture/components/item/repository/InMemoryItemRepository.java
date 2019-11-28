package io.accenture.components.item.repository;

import io.accenture.components.item.module.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InMemoryItemRepository implements ItemRepository{

    private HashMap<Long, Item> itemCollection = new HashMap<>();
    private long currentId = 1L;

    @Override
    public Item create(Item item) {
        Long id = currentId++;
        Item result = new Item(id, item.getName());
        itemCollection.put(id, result);
        return result;
    }

    @Override
    public Item find(Long id) {
        return itemCollection.get(id);
    }

    @Override
    public Item update(Long id, Item item) {
        Item result = new Item(id, item.getName());
        itemCollection.put(id, result);
        return result;
    }

    @Override
    public void delete(Long id) {
        itemCollection.remove(id);
    }

    @Override
    public List<Item> list() {
        return new ArrayList<>(itemCollection.values());
    }
}
