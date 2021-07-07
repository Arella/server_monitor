package com.ds.hackathan.hackathan.controller;

import java.util.List;

import com.ds.hackathan.hackathan.entity.DSNetwork;
import com.ds.hackathan.hackathan.services.DSNetworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/network")
public class DSNetworkController {

	@Autowired
	private DSNetworkService dsNetworkService;

	@PostMapping("/create")
	public DSNetwork createServer(@RequestBody DSNetwork student) {
		DSNetwork createResponse = dsNetworkService.save(student);
		return createResponse;
	}

	@PutMapping("/update")
	public DSNetwork updateServer(@RequestBody DSNetwork student) {
		DSNetwork updateResponse = dsNetworkService.update(student);
		return updateResponse;
	}

	@GetMapping("/{id}")
	public DSNetwork getServer(@PathVariable int id) {
		DSNetwork getReponse = dsNetworkService.get(id);
		return getReponse;
	}

	@GetMapping("/getall")
	public List<DSNetwork> getServers() {
		List<DSNetwork> getReponse = dsNetworkService.getAll();
		return getReponse;
	}

	@DeleteMapping("/delete")
	public String deleteServer(@RequestBody DSNetwork student) {
		dsNetworkService.delete(student);
		return "Record deleted succesfully";
	}
}