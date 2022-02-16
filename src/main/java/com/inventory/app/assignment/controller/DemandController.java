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

import com.inventory.app.assignment.model.Demand;
import com.inventory.app.assignment.model.Item;
import com.inventory.app.assignment.model.Location;
import com.inventory.app.assignment.repository.DemandRepository;
import com.inventory.app.assignment.repository.ItemRepository;
import com.inventory.app.assignment.repository.LocationRepository;

@RestController
public class DemandController {
	
	@Autowired
	DemandRepository demandRepository;
	
	@Autowired
	ItemRepository itemRepository;
	
	@Autowired
	LocationRepository locationRepository;
	

	@GetMapping(path = "/demand")
	public List<Demand> getAllDemand(){
		return demandRepository.findAll();
	}
	
	public List<Demand> getDemandByItemid(@PathVariable(name = "itemid") int itemid){
		return demandRepository.findByItemid(itemid);
	}


	@PostMapping(path = "/demand")
	public Demand postDemand(@RequestBody Demand demand) {
		System.out.println(demandRepository.toString());
		demandRepository.save(demand);
		return demand;
	}

	@DeleteMapping(path = "/demand/{locationid}/{itemid}")
	public List<Demand> deleteDemandByLocationItem(@PathVariable(name = "locationid") int locationid,@PathVariable(name = "itemid") int itemid) {
		List<Demand> demands = demandRepository.findByItemidLocationid(itemid, locationid);
		demandRepository.deleteAll(demands);
		return demands;
	}

	@PutMapping(path = "/demand")
	public Demand putDemand(@RequestBody Demand demand) {
		System.out.println(demandRepository.toString());
		demandRepository.save(demand);
		return demand;
	}
}


