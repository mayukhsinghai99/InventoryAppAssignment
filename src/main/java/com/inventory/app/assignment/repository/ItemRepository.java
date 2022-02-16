package com.inventory.app.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import com.inventory.app.assignment.model.Item;

@RepositoryRestResource(collectionResourceRel = "item" , path = "item")
public interface ItemRepository extends JpaRepository<Item , Integer> {

}
