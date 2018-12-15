package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;

public class MySQLUsersDao implements Users{

	@Override
	public User findByUsername(String username) {
		return null;
	}

	@Override
	public Long insert(User user) {
		String sql = "INSERT INTO users(username, email, password)"

		return ;
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
