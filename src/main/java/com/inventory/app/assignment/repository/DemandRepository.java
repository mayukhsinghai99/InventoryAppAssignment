package com.inventory.app.assignment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.inventory.app.assignment.model.Demand;
import com.inventory.app.assignment.model.Item;
import com.inventory.app.assignment.model.Supply;

	@RepositoryRestResource(collectionResourceRel = "demand",path = "demand" )
	public interface DemandRepository extends JpaRepository<Demand, Integer>{
		public List<Demand> findByItemid(int itemid);

		@Query(value = "SELECT * FROM demand WHERE itemid=:itemid AND locationid=:locationid",nativeQuery = true)
		public List<Demand> findByItemidLocationid(@Param("itemid") int itemid,@Param("locationid") int locationid);

		@Query(value = "SELECT quantity FROM demand WHERE itemid=:itemid AND locationid=:locationid AND demand_type='HARD_PROMISED'",nativeQuery = true)
		public List<Integer> getHardPromised(@Param("itemid") int itemid,@Param("locationid") int locationid);

		@Query(value = "SELECT quantity FROM demand WHERE itemid=:itemid AND demand_type='HARD_PROMISED'",nativeQuery = true)
		public List<Integer> getHard_promisedByItemid(@Param("itemid") int itemid);
	}



