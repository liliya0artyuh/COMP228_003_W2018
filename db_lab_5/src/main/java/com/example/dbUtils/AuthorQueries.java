package com.example.dbUtils;

// Fig. 28.31: PersonQueries.java
// PreparedStatements used by the Address Book application
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import org.apache.derby.shared.common.error.DerbySQLIntegrityConstraintViolationException;

import com.example.model.Author;

public class AuthorQueries {
	private static final String DATABASE_URL = "jdbc:derby:books";
	private static final String USERNAME = "liliya";
	private static final String PASSWORD = "liliya";

	private Connection connection; // manages connection
	private PreparedStatement selectAuthorsByID;
	private PreparedStatement insertNewAuthor;
	private PreparedStatement updateAuthor;
	private PreparedStatement deleteAuthor;
	private PreparedStatement deleteAuthorISBN;
	private Database_Helper db_helper;
	

	// constructor
	public AuthorQueries() {
		try {
			db_helper = new Database_Helper();

		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			System.exit(1);
		}
	} // end PersonQueries constructor

	// select person by last name
	public Author getAuthorByID(int authorID) {
		// create query that selects entries with a specific last name
		try {
			selectAuthorsByID = db_helper.selectAuthorByIdPreparedStatement();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Author not found!", "Error", JOptionPane.PLAIN_MESSAGE);
			e.printStackTrace();
		}

		Author author = null;
		ResultSet resultSet = null;

		try {
			selectAuthorsByID.setInt(1, authorID); // specify last name

			// executeQuery returns ResultSet containing matching entries
			resultSet = selectAuthorsByID.executeQuery();

			author = new Author();

			while (resultSet.next()) {
				author.setAuthorID(resultSet.getInt("authorID"));
				author.setFirstName(resultSet.getString("firstName"));
				author.setLastName(resultSet.getString("lastName"));
			}
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		} finally {
			try {
				resultSet.close();
			} catch (SQLException sqlException) {
				sqlException.printStackTrace();
				close();
			}
		}

		return author;
	}

	// add an entry
	public int addNewAuthor(String fname, String lname) throws SQLException {

		// create insert that adds a new entry into the database
		insertNewAuthor = db_helper.addNewAuthorPreparedStatement();
	
		int result = 0;

		// set parameters, then execute insertNewPerson
		try {
			insertNewAuthor.setString(1, fname);
			insertNewAuthor.setString(2, lname);

			// insert the new entry; returns # of rows updated
			result = insertNewAuthor.executeUpdate();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			close();
		}

		return result;
	}

	// add an entry
	public int deleteAuthor(int id) throws SQLException {
		// create insert that adds a new entry into the database
		deleteAuthor = db_helper.deleteAuthorPreparedStatement();
		
		int result = 0;

		// set parameters, then execute insertNewPerson
		try {
			deleteAuthor.setInt(1, id);
			// insert the new entry; returns # of rows updated
			result = deleteAuthor.executeUpdate();
		} catch (DerbySQLIntegrityConstraintViolationException exception) {
			int selection = JOptionPane.showConfirmDialog(null,
					"Other tables have references to this item. Do you want to delete all?",
					"Referential Integrity Error", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (selection == 0) {
				deleteAuthorISBN =  db_helper.deleteAllAuthorISBNPreparedStatement();
				deleteAuthorISBN.setInt(1, id);
				result = deleteAuthorISBN.executeUpdate();
				deleteAuthor.setInt(1, id);
				// insert the new entry; returns # of rows updated
				result = deleteAuthor.executeUpdate();
			}
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			close();
		}

		return result;
	}

	// add an entry
	public int updateAuthor(String fname, String lname, int id) throws SQLException {

		// create insert that adds a new entry into the database
		updateAuthor = db_helper.updateAuthorPreparedStatement();
				
		int result = 0;

		// set parameters, then execute insertNewPerson
		try {
			updateAuthor.setString(1, fname);
			updateAuthor.setString(2, lname);
			updateAuthor.setInt(3, id);

			// insert the new entry; returns # of rows updated
			result = updateAuthor.executeUpdate();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			close();
		}

		return result;
	}

	// close the database connection
	public void close() {
		try {
			connection.close();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}
	}
} // end class PersonQueries

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and * Pearson Education,
 * Inc. All Rights Reserved. * * DISCLAIMER: The authors and publisher of this
 * book have used their * best efforts in preparing the book. These efforts
 * include the * development, research, and testing of the theories and programs
 * * to determine their effectiveness. The authors and publisher make * no
 * warranty of any kind, expressed or implied, with regard to these * programs
 * or to the documentation contained in these books. The authors * and publisher
 * shall not be liable in any event for incidental or * consequential damages in
 * connection with, or arising out of, the * furnishing, performance, or use of
 * these programs. *
 *************************************************************************/
