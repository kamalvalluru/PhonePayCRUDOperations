package com.spring.jdbc.xml.dao;

import java.util.List;

import com.spring.jdbc.xml.entities.PhonePayTable;

public interface PhonepayMethod 
{
	public int insert(PhonePayTable pt);
	
	public int updateById(PhonePayTable pt);
	
	public int updateByname(PhonePayTable pt);
	
	public int updateByCity(PhonePayTable pt);
	
	public int updateByPin(PhonePayTable pt);

	public int delteById(int id);
	
	public int deleteByName(String name);
	
	public int deleteByCity(String city);
	
	public int deleteByPin(int pin);
	
	public PhonePayTable getObject(int id);
	
	public List<PhonePayTable>getAll();
	

}
