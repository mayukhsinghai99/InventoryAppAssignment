package com.inventory.app.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.inventory.app.assignment.model.Item;
import com.inventory.app.assignment.model.Location;
import com.inventory.app.assignment.model.Supply;
import com.inventory.app.assignment.repository.ItemRepository;
import com.inventory.app.assignment.repository.LocationRepository;
import com.inventory.app.assignment.repository.SupplyRepository;



    @RestController()
	public class SupplyController {

	@Autowired
	SupplyRepository supplyRepository;

	@Autowired
	LocationRepository locationRepository;

	@Autowired
	ItemRepository itemRepository;
		
		@GetMapping("/supply")
		public List<Supply> getAllSupply(){
			return supplyRepository.findAll();
		}
		
		public List<Supply> getSupplyByItemid(@PathVariable int itemid){
			System.out.println("hello world");
			Item item = itemRepository.findById(itemid).get();
			System.out.println(item);
			return supplyRepository.findByItemid(itemid);
		}

		
		@PostMapping("/supply")
		public Supply postSupply(@RequestBody Supply supply) {
			System.out.println(supplyRepository.toString());
			supplyRepository.save(supply);
			return supply;	
		}

		@PutMapping("/supply")
		public Supply putSupply(@RequestBody Supply supply) {
			System.out.println(supplyRepository.toString());
			supplyRepository.save(supply);
			return supply;		
		}
		
		@DeleteMapping("/supply/{locationid}/{itemid}")
		public List<Supply> deletebyItemid(@PathVariable(name = "locationid") int locationid,@PathVariable(name = "itemid") int itemid) {
			List<Supply> supply = supplyRepository.findByItemidLocationid(itemid,locationid);
			System.out.println(supply);
			supplyRepository.deleteAll(supply);
			return supply;
		}

		
	}