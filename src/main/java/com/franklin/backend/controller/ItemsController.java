package com.franklin.backend.controller;

import com.franklin.backend.entity.Items;
import com.franklin.backend.service.ItemsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @CrossOrigin(origins = "https://todolist-frontend-cnxl.onrender.com")

    @GetMapping("/")
    public List<Items> getAllItems() {
        return itemsService.findAllItems();
    }

    @PostMapping("/add")
    public Items addItem(@RequestBody Items item) {
        return itemsService.saveItems(item);
    }

    @PutMapping("/edit/{id}")
    public Items editItem(@PathVariable int id, @RequestBody Items updatedItem) {
        Items item = itemsService.findItemsById(id);
        if (item != null) {
            item.setTitle(updatedItem.getTitle());
            return itemsService.updateItems(item);
        } else {
            return null;
        }
    }

    @DeleteMapping("/delete/{id}")
    public void deleteItem(@PathVariable int id) {
        itemsService.deleteItemsById(id);
    }
}