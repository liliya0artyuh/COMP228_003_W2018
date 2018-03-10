package application;

// Fig. 13.14: CoverViewerController.java
// Controller for Cover Viewer application
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CoverViewerController {
   // instance variables for interacting with GUI
   @FXML private ListView<Book> booksListView;
   @FXML private ImageView coverImageView;

   // stores the list of Book Objects
   private final ObservableList<Book> books = 
      FXCollections.observableArrayList();

   // initialize controller
   public void initialize() {
      // populate the ObservableList<Book>
      books.add(new Book("Android How to Program", 
         "/application/images/small/androidhtp.jpg", "/application/images/large/androidhtp.jpg"));
      books.add(new Book("C How to Program", 
         "/application/images/small/chtp.jpg", "/application/images/large/chtp.jpg"));
      books.add(new Book("C++ How to Program",
         "/application/images/small/cpphtp.jpg", "/application/images/large/cpphtp.jpg"));
      books.add(new Book("Internet and World Wide Web How to Program",  
         "/application/images/small/iw3htp.jpg", "/application/images/large/iw3htp.jpg"));
      books.add(new Book("Java How to Program", 
         "/application/images/small/jhtp.jpg", "/application/images/large/jhtp.jpg"));
      books.add(new Book("Visual Basic How to Program", 
         "/application/images/small/vbhtp.jpg", "/application/images/large/vbhtp.jpg"));
      books.add(new Book("Visual C# How to Program", 
         "/application/images/small/vcshtp.jpg", "/application/images/large/vcshtp.jpg"));
      booksListView.setItems(books); // bind booksListView to books

      // when ListView selection changes, show large cover in ImageView
      booksListView.getSelectionModel().selectedItemProperty().
         addListener(
            new ChangeListener<Book>() {                                   
               @Override                                                     
               public void changed(ObservableValue<? extends Book> ov,
                  Book oldValue, Book newValue) {                        
                  coverImageView.setImage(
                     new Image(newValue.getLargeImage()));
               }
            }
         );                                                                  
   }     
}

/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
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
