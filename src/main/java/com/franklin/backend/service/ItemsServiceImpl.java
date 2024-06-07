package com.franklin.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.franklin.backend.entity.Items;
import com.franklin.backend.repository.ItemsRepository;

import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsRepository itemsRepository;

    @Override
    public Items saveItems(Items items) {
        return itemsRepository.save(items);
    }

    @Override
    public void deleteItemsById(int id) {
        itemsRepository.deleteById(id);
    }

    @Override
    public Items updateItems(Items items) {
        return itemsRepository.save(items);
    }

    @Override
    public List<Items> findAllItems() {
        return itemsRepository.findAll();
    }

    @Override
    public Items findItemsById(int id) {
        return itemsRepository.findById(id).orElse(null);
    }
}
