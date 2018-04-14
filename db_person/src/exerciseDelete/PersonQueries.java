package exerciseDelete;
// Fig. 28.31: PersonQueries.java
// PreparedStatements used by the Address Book application
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class PersonQueries 
{
   private static final String URL = "jdbc:derby:bookings";
   private static final String USERNAME = "ehsan";
   private static final String PASSWORD = "ehsan";

   private Connection connection; // manages connection
   private PreparedStatement selectAllPeople; 
   private PreparedStatement selectPeopleByLastName; 
   private PreparedStatement insertNewPerson; 
    
   // constructor
   public PersonQueries()
   {
      try 
      {
         connection = 
            DriverManager.getConnection(URL, USERNAME, PASSWORD);

         // create query that selects all entries in the AddressBook
         selectAllPeople = 
            connection.prepareStatement("SELECT * FROM BOOKING");
         
         // create query that selects entries with a specific last name
         selectPeopleByLastName = connection.prepareStatement(
            "SELECT * FROM BOOKING WHERE BOOKING_ID = ?");
         /*
         // create insert that adds a new entry into the database
         insertNewPerson = connection.prepareStatement(
            "INSERT INTO Addresses " + 
            "(FirstName, LastName, Email, PhoneNumber) " + 
            "VALUES (?, ?, ?, ?)");*/
      }
      catch (SQLException sqlException)
      {
         sqlException.printStackTrace();
         System.exit(1);
      }
   } // end PersonQueries constructor
   
   
   // select all of the addresses in the database
   public List< Person > getAllPeople()
   {
      List< Person > results = null;
      ResultSet resultSet = null;
      
      try 
      {
         // executeQuery returns ResultSet containing matching entries
         resultSet = selectAllPeople.executeQuery(); 
         results = new ArrayList< Person >();
         
         while (resultSet.next())
         {
        	 Person person = new Person(
               resultSet.getInt("userID"),
               resultSet.getString("startDate"),
               resultSet.getString("endDate"),
               resultSet.getString("capacity"),
               resultSet.getString("firstName"),
               resultSet.getString("lastName"));
               
               
        	 results.add(person);
         } 
      } 
      catch (SQLException sqlException)
      {
         sqlException.printStackTrace();         
      } 
      finally
      {
         try 
         {
            resultSet.close();
         } 
         catch (SQLException sqlException)
         {
            sqlException.printStackTrace();         
            close();
         }
      }
      
      return results;
   } 

   

   // select person by last name   
   public List< Person > getPeopleByID(int id)
   {
      List< Person > resultsArrayList = null;
      ResultSet resultSetFromDatabase = null;

      try 
      {
         selectPeopleByLastName.setInt(1, id); // specify last name

         // executeQuery returns ResultSet containing matching entries
         resultSetFromDatabase = selectPeopleByLastName.executeQuery(); 

         resultsArrayList = new ArrayList< Person >();

         while (resultSetFromDatabase.next())
         {
            resultsArrayList.add(new Person(resultSetFromDatabase.getInt("name of column in the database"),
                    resultSetFromDatabase.getString("START_DATETIME"),
                    resultSetFromDatabase.getString("END_DATETIME"),
                    resultSetFromDatabase.getString("CAPACITY"),
                    resultSetFromDatabase.getString("FIRST_NAME"),
                    resultSetFromDatabase.getString("LAST_NAME")));
         } 
      } 
      catch (SQLException sqlException)
      {
         sqlException.printStackTrace();
      } 
      finally
      {
         try 
         {
            resultSetFromDatabase.close();
         }
         catch (SQLException sqlException)
         {
            sqlException.printStackTrace();         
            close();
         }
      } 
      
      return resultsArrayList;
   } 
   
   public void close()
   {
      try 
      {
         connection.close();
      } 
      catch (SQLException sqlException)
      {
         sqlException.printStackTrace();
      } 
   } 
   
   /*
   // add an entry
   public int addPerson(
      String fname, String lname, String sd, String ed, String tit, String rn , String cap , String af , String at)
   {
      int result = 0;
      
      // set parameters, then execute insertNewPerson
      try 
      {
         insertNewPerson.setString(1, fname);
         insertNewPerson.setString(2, lname);
         insertNewPerson.setString(3, sd);
         insertNewPerson.setString(4, ed);
         insertNewPerson.setString(5, tit);
         insertNewPerson.setString(6, rn);
         insertNewPerson.setString(7, cap);
         insertNewPerson.setString(8, af);
         insertNewPerson.setString(9, at);

         // insert the new entry; returns # of rows updated
         result = insertNewPerson.executeUpdate(); 
      }
      catch (SQLException sqlException)
      {
         sqlException.printStackTrace();
         close();
      } 
      
      return result;
   } 
   
   // close the database connection
   public void close()
   {
      try 
      {
         connection.close();
      } 
      catch (SQLException sqlException)
      {
         sqlException.printStackTrace();
      } 
   } */
} // end class PersonQueries


 