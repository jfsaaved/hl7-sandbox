package io.accenture.components.item.controller;

import io.accenture.components.item.module.Item;
import io.accenture.components.item.repository.ItemRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/items")
public class ItemController {

    private ItemRepository itemRepository;

    public ItemController(ItemRepository itemRepository) {

        this.itemRepository = itemRepository;
    }

    @PostMapping
    public ResponseEntity<Item> create(@RequestBody Item item){
        Item result = itemRepository.create(item);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Item> find(@PathVariable long id){
        Item result = itemRepository.find(id);
        return new ResponseEntity<>(result, HttpStatus.FOUND);
    }

    @GetMapping
    public ResponseEntity<List<Item>> list(){
        List<Item> result = itemRepository.list();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Item> update(@PathVariable long id, @RequestBody Item item) {
        Item result = itemRepository.update(id, item);
        return new ResponseEntity<>(result, HttpStatus.FOUND);
    }

    @DeleteMapping("{id}")
    public ResponseEntity delete(@PathVariable long id) {
        itemRepository.delete(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}
