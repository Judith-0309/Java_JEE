package sn.SenForage.dao;

import java.util.List;


import sn.SenForage.entities.Village;



public interface IVillage {
	public int add(Village village);
	
	public List<Village> list();


}
