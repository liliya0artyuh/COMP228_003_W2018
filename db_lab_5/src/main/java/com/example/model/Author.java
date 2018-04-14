package com.example.model;
// Fig. 28.30: Person.java
// Person class that represents an entry in an address book.
public class Author
{
   private int authorID;
   private String firstName;
   private String lastName;

   // constructor
   public Author()
   {
   } 

   // constructor
   public Author(int authorID, String firstName, String lastName)
   {
      setAuthorID(authorID);
      setFirstName(firstName);
      setLastName(lastName);
   } 

   // sets the addressID
   public void setAuthorID(int authorID)
   {
      this.authorID = authorID;
   }

   // returns the addressID 
   public int getAuthorID()
   {
      return authorID;
   }
   
   // sets the firstName
   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   } 

   // returns the first name 
   public String getFirstName()
   {
      return firstName;
   } 
   
   // sets the lastName
   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   } 

   // returns the last name 
   public String getLastName()
   {
      return lastName;
   } 
} // end class Person


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/

 