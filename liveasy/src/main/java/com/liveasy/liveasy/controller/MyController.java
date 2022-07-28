package com.liveasy.liveasy.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.liveasy.liveasy.entities.Transport;
import com.liveasy.liveasy.services.TransportServices;
import com.liveasy.liveasy.services.TransportServices;

@RestController
public class MyController {
	
	//Transport port;
	@Autowired
	TransportServices transportService;
	
	//get load of a shipperId
	@GetMapping("/load/{shipperId}")
	public List<Transport> getShipping(@PathVariable String shipperId) {
		return this.transportService.getShipping(shipperId);
	}
	
	
	
	
	//get load using loadId
	@GetMapping("/load/{payloadId}")
	public Transport getPayload(@PathVariable String payloadId) {
		
		return this.transportService.getPayload(Long.parseLong(payloadId));
		
	}
	
	

	
	//add  payload
	
	@PostMapping("/load")
	public Transport addPayload(@RequestBody Transport payload) {
		
		return this.transportService.addPayload(payload);
	}
	
	
	
	//update using loadId
	@PutMapping("/load/{payloadId}")
	public Transport updatePayload(@PathVariable String l) {
		return this.transportService.updatePayloadId(Long.parseLong(l)); 
	}
	
	//delete using loadId
	@DeleteMapping("/load/{payloadId}")
	public void deletePayload(@PathVariable String payloadId) {
		this.transportService.deletePayload(Long.parseLong(payloadId));
	}
	


}
