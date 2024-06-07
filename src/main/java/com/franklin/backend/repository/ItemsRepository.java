package com.franklin.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.franklin.backend.entity.Items;

@Repository
public interface ItemsRepository extends JpaRepository<Items, Integer> {

}
