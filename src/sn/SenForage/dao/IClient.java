package sn.SenForage.dao;

import java.util.List;

import sn.SenForage.entities.Client;


public interface IClient {
	public int add(Client client);
	
	
	public List<Client> list();
}

