package com.boot.controller;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Shipwreck;
import com.boot.resource.ShipwreckStub;
import com.repository.ShipWreckRepository;

@RestController
@RequestMapping("/api/v1")
public class ShipWreskResource {

	@Autowired
	private ShipWreckRepository shipWreckRepository;
	
	@RequestMapping(value="shipwrecks",method=RequestMethod.GET)
	public List<Shipwreck> getAllShips() {
		return shipWreckRepository.findAll();
	}
	
	@RequestMapping(value="shipwrecks", method=RequestMethod.POST)
	public Shipwreck addShipWreck(@RequestBody Shipwreck shipwreck) {
		return shipWreckRepository.saveAndFlush(shipwreck);
	}
	
	@RequestMapping(value="shipwrecks/{id}",method=RequestMethod.GET)
	public Shipwreck getShipWreck(@PathVariable Long id) {
		return shipWreckRepository.getOne(id);
	}
	
	@RequestMapping(value="shipwrecks/{id}", method=RequestMethod.DELETE)
	public Shipwreck deleteShipWreck(@PathVariable Long id) {
		Shipwreck existing = getShipWreck(id);
		shipWreckRepository.delete(existing);
		return existing;
	}
	
	@RequestMapping(value="shipwrecks/{id}",method=RequestMethod.PUT)
	public Shipwreck putShipWreck(@PathVariable Long id, @RequestBody Shipwreck shipwreck) {
		Shipwreck existing = getShipWreck(id);
		BeanUtils.copyProperties(shipwreck, existing);
		
		return shipWreckRepository.saveAndFlush(shipwreck);
	}
}
