package com.example.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TestDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void findGoods(){
		String sql = "select goods_id,goods_type,name from ds_goods where goods_id=23";
		
		Map<String, Object> v = jdbcTemplate.queryForMap(sql);
		
		System.out.println(v);
		
	}
}
