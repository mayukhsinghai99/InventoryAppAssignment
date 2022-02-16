package com.inventory.app.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import com.inventory.app.assignment.model.Location;

@RepositoryRestResource(collectionResourceRel = "location",path ="location")
public interface LocationRepository extends JpaRepository<Location , Integer> {

}

