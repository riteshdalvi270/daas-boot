package com.boot.controller;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Shipwreck;
import com.boot.resource.ShipwreckStub;

@RestController
@RequestMapping("/api/v1")
public class ShipWreskResource {

	@RequestMapping(value="shipwrecks",method=RequestMethod.GET)
	public List<Shipwreck> getAllShips() {
		return ShipwreckStub.list();
	}
	
	@RequestMapping(value="shipwrecks", method=RequestMethod.POST)
	public Shipwreck addShipWreck(@RequestBody Shipwreck Shipwreck) {
		return ShipwreckStub.create(Shipwreck);
	}
	
	@RequestMapping(value="shipwrecks/{id}",method=RequestMethod.GET)
	public Shipwreck getShipWreck(@PathVariable Long id) {
		return ShipwreckStub.get(id);
	}
	
	@RequestMapping(value="shipwrecks/{id}", method=RequestMethod.DELETE)
	public Shipwreck deleteShipWreck(@PathVariable Long id) {
		return ShipwreckStub.delete(id);
	}
	
	@RequestMapping(value="shipwrecks/{id}",method=RequestMethod.PUT)
	public Shipwreck putShipWreck(@PathVariable Long id, @RequestBody Shipwreck shipwreck) {
		return ShipwreckStub.update(id, shipwreck);
	}
}
