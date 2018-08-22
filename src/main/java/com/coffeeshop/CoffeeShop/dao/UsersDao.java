package com.coffeeshop.CoffeeShop.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.coffeeshop.CoffeeShop.entity.Users;

@Repository
public class UsersDao {
	@Autowired //
	JdbcTemplate jdbcTemplate;
	
	// select * from customers
	public List<Users> findAll(){
		return jdbcTemplate.query("select * from users", new BeanPropertyRowMapper<Users>(Users.class));
	}
	
	public int insertUser(String firstName, String lastName, String email, String phoneNum, String password) {
		String insertQuery = "INSERT INTO users(FirstName, LastName, Email, PhoneNum, Password)" 
				+ "values(?,?,?,?,?)";
		return jdbcTemplate.update(insertQuery, firstName, lastName, email, phoneNum, password);
	}
	
	public int updateUsers(String firstName, String lastName) {
		String updateQuery = "UPDATE customers SET ContactName=? WHERE customerID = ?";
		return jdbcTemplate.update(updateQuery, firstName, lastName);
	}
	
	public int deleteUser(String lastName) {
		String deleteQuery = "delete from users where lastName = ?";
		return jdbcTemplate.update(deleteQuery, lastName);
	}
}
