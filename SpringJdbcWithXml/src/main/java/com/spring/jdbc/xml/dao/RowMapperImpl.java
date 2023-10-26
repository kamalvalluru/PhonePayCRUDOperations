package com.spring.jdbc.xml.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.xml.entities.PhonePayTable;

public class RowMapperImpl implements RowMapper<PhonePayTable> 
{

	@Override
	public PhonePayTable mapRow(ResultSet rs, int rowNum) throws SQLException {
		PhonePayTable pt=new PhonePayTable();
		pt.setId(rs.getInt(1));
		pt.setName(rs.getString(2));
		pt.setCity(rs.getString(3));
		pt.setPin(rs.getInt(4));
		
		return pt;
	}

}
