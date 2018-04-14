package exerciseDelete;

// Fig. 28.30: Person.java
// Person class that represents an entry in an address book.
public class Person
{
   private int userID;
   private String startDate;
   private String endDate;
   private String capacity;
   private String firstName;
   private String lastName;
   
   

   // constructor
   public Person()
   {
   } 

   // constructor
   public Person(int userID, String startDate, String endDate, String capacity, String firstName, String lastName)
   {
      setUserID(userID);
      setStartDate(startDate);
      setEndDate(endDate);
      setCapacity(capacity);
      setFirstName(firstName);
      setLastName(lastName);
      
   } 

   // sets the addressID
   public void setUserID(int userID)
   {
      this.userID = userID;
   }

   // returns the addressID 
   public int getUserID()
   {
      return userID;
   }
   
   
   
	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	// sets the firstName
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// returns the first name
	public String getFirstName() {
		return firstName;
	}

	// sets the lastName
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// returns the last name
	public String getLastName() {
		return lastName;
	}

} // end class Person
