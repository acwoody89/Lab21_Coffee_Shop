package com.coffeeshop.CoffeeShop.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.coffeeshop.CoffeeShop.entity.Items;
import com.coffeeshop.CoffeeShop.entity.Users;

@Repository
public class ItemsDao {
	@Autowired //
	JdbcTemplate jdbcTemplate;
	
	// select * from customers
	public List<Items> findAll(){
		return jdbcTemplate.query("select * from items", new BeanPropertyRowMapper<Items>(Items.class));
	}
	
	public List<Users> findUser(){
		return jdbcTemplate.query("select * from users", new BeanPropertyRowMapper<Users>(Users.class));
	}
	
	public int insertUser(String firstName, String lastName, String email, String phoneNum, String password) {
		String insertQuery = "INSERT INTO users(FirstName, LastName, Email, PhoneNum, Password)" 
				+ "values(?,?,?,?,?)";
		return jdbcTemplate.update(insertQuery, firstName, lastName, email, phoneNum, password);
	}
	
	public List<Items> findById(String name) {
		System.out.println(name);
		return jdbcTemplate.query("SELECT * FROM items WHERE ItemName LIKE '%" + name +"%'", new BeanPropertyRowMapper<Items>(Items.class));
	}
	
	public int updateCustomer(String id, String contName) {
		String updateQuery = "UPDATE customers SET ContactName=? WHERE customerID = ?";
		return jdbcTemplate.update(updateQuery, contName, id);
	}
	
	public int deleteCustomer(String email) {
		String deleteQuery = "delete from users where Email=?";
		return jdbcTemplate.update(deleteQuery, email);
	}
}
