package net.javaguides.usermanagement.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import net.javaguides.usermanagement.model.User;

/**
 * AbstractDAO.java This DAO class provides CRUD database operations for the
 * table users in the database.
 * 
 * @author Ramesh Fadatare
 *
 */
public class UserDAO {
	private String jdbcURL = "jdbc:mysql://localhost:3306/demo?useSSL=false";
	private String jdbcUsername = "root";
	private String jdbcPassword = "WStcl971101";

	private static final String INSERT_USERS_SQL = "INSERT INTO users" + "  (examdate, custlastname, custfirstname, custsuffix, custdob, age, sex, chestpain_type, resting_blood_pressure, chol, max_heart_rt, exer_agina) VALUES "
			+ " (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

	private static final String SELECT_USER_BY_ID = "select id,examdate, custlastname, custfirstname, custsuffix, custdob,age, sex, chestpain_type, resting_blood_pressure, chol, max_heart_rt, exer_agina from users where id =?";
	private static final String SELECT_ALL_USERS = "select * from users";
	private static final String DELETE_USERS_SQL = "delete from users where id = ?;";
	private static final String UPDATE_USERS_SQL = "update users set examdate = ?, custlastname = ?, custfirstname = ?, custsuffix = ?, custdob = ?, age = ?, sex = ?, chestpain_type = ?, resting_blood_pressure = ?, chol = ?, max_heart_rt = ?, exer_agina = ? where id = ?;";

	public UserDAO() {
	}

	protected Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	public void insertUser(User user) throws SQLException {
		System.out.println(INSERT_USERS_SQL);
		// try-with-resource statement will auto close the connection.
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
			
			
			preparedStatement.setInt(1, user.getExamdate());
			preparedStatement.setString(2, user.getCustlastname());
			preparedStatement.setString(3, user.getCustfirstname());
			preparedStatement.setString(4, user.getCustsuffix());
			preparedStatement.setInt(5, user.getCustdob());
			
			preparedStatement.setInt(6, user.getAge());
			preparedStatement.setInt(7, user.getSex());
			preparedStatement.setInt(8, user.getChestpain_type());
			preparedStatement.setInt(9, user.getResting_blood_pressure());
			preparedStatement.setInt(10, user.getChol());
			preparedStatement.setInt(11, user.getMax_heart_rt());
			preparedStatement.setInt(12, user.getExer_agina());
			
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			printSQLException(e);
		}
	}

	public User selectUser(int id) {
		User user = null;
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);) {
			preparedStatement.setInt(1, id);
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				

				
				int examdate = rs.getInt("examdate");
				String custlastname = rs.getString("custlastname");
				String custfirstname = rs.getString("custfirstname");
				String custsuffix = rs.getString("custsuffix");
				int custdob = rs.getInt("custdob");
				
				int age = rs.getInt("age");
				int sex = rs.getInt("sex");
				int chestpain_type = rs.getInt("chestpain_type");
				int resting_blood_pressure = rs.getInt("resting_blood_pressure");
				int chol = rs.getInt("chol");
				int max_heart_rt = rs.getInt("max_heart_rt");
				int exer_agina = rs.getInt("exer_agina");

				user = new User(id, examdate, custlastname, custfirstname, custsuffix, custdob, age, sex, chestpain_type, resting_blood_pressure, chol, max_heart_rt, exer_agina);
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return user;
	}

	public List<User> selectAllUsers() {

		// using try-with-resources to avoid closing resources (boiler plate code)
		List<User> users = new ArrayList<>();
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();

				// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);) {
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				int id = rs.getInt("id");
				
				int examdate = rs.getInt("examdate");
				String custlastname = rs.getString("custlastname");
				String custfirstname = rs.getString("custfirstname");
				String custsuffix = rs.getString("custsuffix");
				int custdob = rs.getInt("custdob");
				
				int age = rs.getInt("age");
				int sex = rs.getInt("sex");
				int chestpain_type = rs.getInt("chestpain_type");
				int resting_blood_pressure = rs.getInt("resting_blood_pressure");
				int chol = rs.getInt("chol");
				int max_heart_rt = rs.getInt("max_heart_rt");
				int exer_agina = rs.getInt("exer_agina");
				
				users.add(new User(id, examdate, custlastname, custfirstname, custsuffix, custdob, age, sex, chestpain_type, resting_blood_pressure, chol, max_heart_rt, exer_agina));
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return users;
	}

	public boolean deleteUser(int id) throws SQLException {
		boolean rowDeleted;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(DELETE_USERS_SQL);) {
			statement.setInt(1, id);
			rowDeleted = statement.executeUpdate() > 0;
		}
		return rowDeleted;
	}

	public boolean updateUser(User user) throws SQLException {
		boolean rowUpdated;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);) {
			
			
			statement.setInt(1, user.getExamdate());
			statement.setString(2, user.getCustlastname());
			statement.setString(3, user.getCustfirstname());
			statement.setString(4, user.getCustsuffix());
			statement.setInt(5, user.getCustdob());
			statement.setInt(6, user.getAge());
			statement.setInt(7, user.getSex());
			statement.setInt(8, user.getChestpain_type());
			statement.setInt(9, user.getResting_blood_pressure());
			statement.setInt(10, user.getChol());
			statement.setInt(11, user.getMax_heart_rt());
			statement.setInt(12, user.getExer_agina());
			statement.setInt(13, user.getId());

			rowUpdated = statement.executeUpdate() > 0;
		}
		return rowUpdated;
	}

	private void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}

}
