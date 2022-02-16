package com.inventory.app.assignment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.inventory.app.assignment.model.Item;
import com.inventory.app.assignment.model.Supply;

@RepositoryRestResource(collectionResourceRel = "supply",path = "supply")
public interface SupplyRepository extends JpaRepository<Supply, Integer>{
	
	public List<Supply> findByItemid(int itemid);
	
	@Query(value = "SELECT * FROM supply WHERE itemid=:itemid AND locationid=:locationid",nativeQuery = true)
	public List<Supply> findByItemidLocationid(@Param("itemid") int itemid,@Param("locationid") int locationid);

	@Query(value = "SELECT quantity FROM supply WHERE itemid=:itemid AND locationid=:locationid AND supply_type='ONHAND'",nativeQuery = true)
	public List<Integer> getOnHand(@Param("itemid") int itemid,@Param("locationid") int locationid);

	@Query(value = "SELECT quantity FROM supply WHERE itemid=:itemid AND supply_type='ONHAND'",nativeQuery = true)
	public List<Integer> getOnHandByitemid(@Param("itemid") int itemid);


	
}