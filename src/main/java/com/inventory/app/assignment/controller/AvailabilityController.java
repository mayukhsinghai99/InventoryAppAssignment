package com.inventory.app.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.app.assignment.repository.DemandRepository;
import com.inventory.app.assignment.repository.ItemRepository;
import com.inventory.app.assignment.repository.LocationRepository;
import com.inventory.app.assignment.repository.SupplyRepository;
import com.inventory.app.assignment.model.Availability;


import java.util.List;

@RestController
	public class AvailabilityController {

		@Autowired
		ItemRepository itemRepository;

		@Autowired
		LocationRepository locationRepository;

		@Autowired
		SupplyRepository supplyRepository;

		@Autowired
		DemandRepository demandRepository;
		

		public int sum(List<Integer> list) {
			int sum=0;
			for(int i:list)
				sum = sum+i;
			return sum;
		}


		@GetMapping("/availability/{itemid}/{locationid}")
		public Availability getAvailabilityByItemLocation(@PathVariable(name = "itemid") int itemid,@PathVariable(name = "locationid") int locationid) {
			List<Integer> ONHAND = supplyRepository.getOnHand(itemid, locationid);
			List<Integer> HARD_PROMISE = demandRepository.getHardPromised(itemid, locationid);
			int availQuant= (sum(ONHAND))-(sum(HARD_PROMISE));
			Availability avail=new Availability(itemid, locationid, availQuant);
//			System.out.println("Item ID: "+avail.getItemid()+" Location Id "+avail.getLocationid());
			return avail;
		}
		
		@GetMapping(path = "/availability/{itemid}")
		public int getAvailabilityByItem(@PathVariable(name = "itemid") int itemid) {
			List<Integer> ONHAND = supplyRepository.getOnHandByitemid(itemid);
			List<Integer> HARD_PROMISE = demandRepository.getHard_promisedByItemid(itemid);
			return (sum(ONHAND))-(sum(HARD_PROMISE));
		}

	}


