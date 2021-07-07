package com.ds.hackathan.hackathan.repos;

import com.ds.hackathan.hackathan.entity.DSNetwork;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface DSNetworkRepository extends CrudRepository<DSNetwork, Serializable> {
	
}