package com.spring.jdbc.xml.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.xml.entities.PhonePayTable;

public class PhonepayMethodImplemention implements PhonepayMethod
{
	private JdbcTemplate jdbcTemplate;
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(PhonePayTable pt) {
		String query="insert into phonepay(id,name,city,pin) values(?,?,?,?)";
		int result=this.jdbcTemplate.update(query,pt.getId(),pt.getName(),pt.getCity(),pt.getPin());
		return result;
	}

	@Override
	public int updateById(PhonePayTable pt) {
		String query="update phonepay set name=?, city=?, pin=? where id=?";
		int result=this.jdbcTemplate.update(query,pt.getName(),pt.getCity(),pt.getPin(),pt.getId());
		return result;
	}

	@Override
	public int updateByname(PhonePayTable pt) {
		String query="update phonepay set id=?, city=?, pin=? where name=?";
		int result=this.jdbcTemplate.update(query,pt.getId(),pt.getCity(),pt.getPin(),pt.getName());
		return result;
	}

	@Override
	public int updateByCity(PhonePayTable pt) 
	{
		String query=" update phonepay set id=?, name=?, pin=? where city=?";
		int result=this.jdbcTemplate.update(query,pt.getId(),pt.getName(),pt.getPin(),pt.getCity());
		return result;
	}

	@Override
	public int updateByPin(PhonePayTable pt)
	{
		String query=" update phonepay set id=?, name=?, city=? where pin=?";
		int result=this.jdbcTemplate.update(query,pt.getId(),pt.getName(),pt.getCity(),pt.getPin());
		return result;	
	}

	@Override
	public int delteById(int id) {
		String query=" delete from phonepay where id=?";
		int result = this.jdbcTemplate.update(query, id);
		return result;
	}

	@Override
	public int deleteByName(String name) {
		String query=" delete from phonepay where name=?";
		int result = this.jdbcTemplate.update(query, name);
		return result;
	}

	@Override
	public int deleteByCity(String city) {
		String query=" delete from phonepay where city=?";
		int result = this.jdbcTemplate.update(query, city);
		return result;
	}

	@Override
	public int deleteByPin(int pin) {
		String query=" delete from phonepay where pin=?";
		int result = this.jdbcTemplate.update(query, pin);
		return result;
	}

	@Override
	public PhonePayTable getObject(int id) {
		String Query="select * from phonepay where id=?";
		RowMapper<PhonePayTable> rowmaper=new RowMapperImpl();
		PhonePayTable queryForObject = this.jdbcTemplate.queryForObject(Query, rowmaper, id);
		return queryForObject;
	}

	@Override
	public List<PhonePayTable> getAll() {
		String query="select * from phonepay";
		List<PhonePayTable> query2 = this.jdbcTemplate.query(query, new RowMapperImpl());
		return query2;
	}
	
	
	
	
	
	
}
