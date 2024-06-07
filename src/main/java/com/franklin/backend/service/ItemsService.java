package com.franklin.backend.service;

import java.util.List;

import com.franklin.backend.entity.Items;

public interface ItemsService {
    Items saveItems(Items items);

    Items updateItems(Items items);

    void deleteItemsById(int id);

    Items findItemsById(int id);

    List<Items> findAllItems();
}