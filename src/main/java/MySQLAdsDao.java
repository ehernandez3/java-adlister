import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
		private Connection conn;


	public MySQLAdsDao(Config config) {
		if (conn == null) {
			try {
				DriverManager.registerDriver(new Driver());
				this.conn = DriverManager.getConnection(
						config.getUrl(),
						config.getUser(),
						config.getPassword()
				);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public List<Ad> all() {
		List<Ad> ads = new ArrayList<>();

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM ads");
			while(rs.next()) {
				ads.add(new Ad(
				rs.getLong("id"),
				rs.getLong("userId"),
				rs.getString("title"),
				rs.getString("description")
			));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ads;

	}

	@Override
	public Long insert(Ad ad) {
		long lastInsertedId = 0;
		String insertQuery = String.format(
				"INSERT INTO ads (id, userId, title, description) VALUES (%d, %d, '%s', '%s')",
				ad.getId(),
				ad.getUserId(),
				ad.getTitle(),
				ad.getDescription());

		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
			ResultSet rs = stmt.getGeneratedKeys();
			if (rs.next()) {
				lastInsertedId = rs.getLong(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lastInsertedId;
	}


}
