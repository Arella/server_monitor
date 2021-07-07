package com.ds.hackathan.hackathan.services;

import com.ds.hackathan.hackathan.entity.DSNetwork;
import org.springframework.stereotype.Component;

@Component
public interface DSNetworkService {
	public DSNetwork save(DSNetwork network);

	public DSNetwork update(DSNetwork network);

	public DSNetwork get(int id);

	public void delete(DSNetwork network);
}