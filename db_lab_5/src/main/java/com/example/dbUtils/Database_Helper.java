package com.example.dbUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database_Helper {

	public Database_Helper() throws SQLException {
		super();
		this.connection = DriverManager.getConnection(getDatabaseUrl(), getUsername(), getPassword());

	}

	// database URL, username and password
	private static final String DATABASE_URL = "jdbc:derby:books";
	private static final String USERNAME = "liliya";
	private static final String PASSWORD = "liliya";

	private Connection connection;

	private static String getDatabaseUrl() {
		return DATABASE_URL;
	}

	private static String getUsername() {
		return USERNAME;
	}

	private static String getPassword() {
		return PASSWORD;
	}

	public void closeConnectonToDB() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public PreparedStatement getAllAuthorsPreparedStatement() throws SQLException {
		return connection.prepareStatement("SELECT * FROM authors", ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_UPDATABLE);
	}

	public PreparedStatement selectAuthorByIdPreparedStatement() throws SQLException {
		return connection.prepareStatement("SELECT * FROM Authors WHERE authorID = ?");

	}

	public PreparedStatement addNewAuthorPreparedStatement() throws SQLException {
		return connection.prepareStatement("INSERT INTO Authors " + "(FirstName, LastName) " + "VALUES (?, ?)");
	}

	public PreparedStatement deleteAuthorPreparedStatement() throws SQLException {
		return connection.prepareStatement("DELETE FROM Authors WHERE authorID = ?");
	}

	public PreparedStatement deleteAllAuthorISBNPreparedStatement() throws SQLException {
		return connection.prepareStatement("DELETE FROM AuthorISBN WHERE authorID = ?");
	}

	public PreparedStatement updateAuthorPreparedStatement() throws SQLException {
		return connection.prepareStatement("UPDATE Authors SET firstName = ?, lastName = ? WHERE authorID = ?");
	}
}
