package com.coffeeshop.CoffeeShop.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.coffeeshop.CoffeeShop.entity.Items;

@Repository
public class ItemsDao {
	@Autowired //
	JdbcTemplate jdbcTemplate;
	
	// select * from customers
	public List<Items> findAll(){
		return jdbcTemplate.query("select * from items", new BeanPropertyRowMapper<Items>(Items.class));
	}
	
	public int insertUser(String firstName, String lastName, String email, String phoneNum, String password) {
		String insertQuery = "INSERT INTO users(FirstName, LastName, Email, PhoneNum, Password)" 
				+ "values(?,?,?,?,?)";
		return jdbcTemplate.update(insertQuery, firstName, lastName, email, phoneNum, password);
	}
	
	public int updateCustomer(String id, String contName) {
		String updateQuery = "UPDATE customers SET ContactName=? WHERE customerID = ?";
		return jdbcTemplate.update(updateQuery, contName, id);
	}
	
	public int deleteCustomer(String id) {
		String deleteQuery = "delete from customers where customerID = ?";
		return jdbcTemplate.update(deleteQuery, id);
	}
}
