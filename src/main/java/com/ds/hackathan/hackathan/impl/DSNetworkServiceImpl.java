package com.ds.hackathan.hackathan.impl;

import com.ds.hackathan.hackathan.entity.DSNetwork;
import com.ds.hackathan.hackathan.repos.DSNetworkRepository;
import com.ds.hackathan.hackathan.services.DSNetworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service("networkServiceImpl")
public class DSNetworkServiceImpl implements DSNetworkService {

	@Autowired
	private DSNetworkRepository networkRepository;

	@Transactional
	@CachePut(value = "network", key = "#network.id")
	public DSNetwork save(DSNetwork network) {
		DSNetwork createResponse = networkRepository.save(network);
		return createResponse;
	}

	@Transactional
	@Cacheable(value = "network", key = "#id")
	public DSNetwork get(int id) {
		DSNetwork network = null;
		Optional<DSNetwork> networkResponse = networkRepository.findById(id);
		if (networkResponse.isPresent()) {
			network = networkResponse.get();
		} else {
			throw new RuntimeException("Record not found");
		}
		return network;
	}

	@Transactional
	@CachePut(value = "network", key = "#network.id")
	public DSNetwork update(DSNetwork network) {
		DSNetwork updateResponse = networkRepository.save(network);
		return updateResponse;
	}

	@Transactional
	@CacheEvict(value = "network", key = "#network.id")
	public void delete(DSNetwork network) {
		networkRepository.delete(network);
	}
}