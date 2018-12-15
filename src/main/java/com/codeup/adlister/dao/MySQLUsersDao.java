package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import javax.management.relation.RelationNotFoundException;
import javax.xml.transform.Result;
import java.sql.*;

public class MySQLUsersDao implements Users{
	private Connection connection = null;

	public MySQLUsersDao(Config config) {
		try {
			DriverManager.registerDriver(new Driver());
			connection = DriverManager.getConnection(
					config.getUrl(),
					config.getUser(),
					config.getPassword()
			);
		} catch (SQLException e) {
			throw new RuntimeException("Error connecting to the database!", e);
		}
	}

	@Override
	public User findByUsername(String username) {
		String sql = "SELECT * FROM users WHERE username = ? LIMIT 1";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, username);
			ResultSet rs = stmt.executeQuery();
			rs.next();
			return new User(
				rs.getLong("id"),
				rs.getString("username"),
				rs.getString("email"),
				rs.getString("password")
			);
		} catch (SQLException e) {
			throw new RuntimeException("Error Connecting to the database!");
		}
	}

	@Override
	public Long insert(User user) {
		String sql = "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, user.getUsername());
			stmt.setString(2, user.getEmail());
			stmt.setString(3, user.getPassword());
			stmt.executeUpdate();
			ResultSet rs = stmt.getGeneratedKeys();
			rs.next();
			return rs.getLong(1);
		} catch (SQLException e) {
			throw new RuntimeException("Error connecting to the database!", e);
		}
	}

//	public Long insert(Ad ad) {
//		long lastInsertedId = 0;
//		String sql = "INSERT INTO ads(userId, title, description) VALUES (?, ?, ?)"; // Moved sql code here
//
//		try {
//			PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//			stmt.setLong(1, ad.getUserId());
//			stmt.setString(2, ad.getTitle());
//			stmt.setString(3, ad.getDescription());
//			stmt.executeUpdate();
//			ResultSet rs = stmt.getGeneratedKeys();
//			if (rs.next()) {
//				lastInsertedId = rs.getLong(1);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return lastInsertedId;
//	}
}
