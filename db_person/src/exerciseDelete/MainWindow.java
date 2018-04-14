package exerciseDelete;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.JTable;
public class MainWindow extends JFrame{
	
    private PersonQueries personQueries;
    private List<Person> results;
    private int numberOfEntries = 0;
    private int currentEntryIndex;
    private Person currentEntry;
    
    private static ResultSetTableModel tableModel;
    
	private final JTextField idTextField;
	private final JLabel idLabel;
	
	private final JTextField startDateTextField;
	private final JLabel startDateLabel;
	
	private final JLabel endDateLabel;
	private final JTextField endateDateTextField;
	
	private final JLabel capacityLabel;
	private final JTextField capacityTextField;
	
	private final JLabel firstNamelabel;
	private final JTextField firstNameTextField;
	
	private final JLabel lastNamelabel;
	private final JTextField lastNameTextField;
	
	
	private final JButton UpdateButton;
	
	private final JButton insertButton;
	private final JButton displayAllBookingsButton;
	
	private final JButton submitButton;
	
	
	
	public MainWindow(){
		super("Appointments"); //gives title to window
	      
		// establish database connection and set up PreparedStatements
		personQueries = new PersonQueries();

		
		
	      
		//set type of layout
		setLayout(new GridLayout(6,1)); //
	
	
		
		Panel c2 = new Panel();
		startDateLabel = new JLabel("Start Date (dd/mm/yyyy)");
		startDateTextField = new JTextField(20);
		c2.add(startDateLabel);
		c2.add(startDateTextField);
	    add(c2);

	    
	    endDateLabel = new JLabel("End Date (dd/mm/yyyy)");
	    endateDateTextField = new JTextField(20);
	    //Panel c2 = new Panel();
	    c2.add(endDateLabel);
	    c2.add(endateDateTextField);
	    add(c2);
	    
	    Panel c3 = new Panel();
	    capacityLabel = new JLabel("Capacity");
	    capacityTextField = new JTextField(20);
	    c3.add(capacityLabel);
	    c3.add(capacityTextField);
	    add(c3);
	    
	    
	    Panel c4 = new Panel();
	    firstNamelabel = new JLabel("First Name");
	    firstNameTextField = new JTextField(20);
	    c4.add(firstNamelabel);
	    c4.add(firstNameTextField);
	    add(c4);
	    
	    lastNamelabel = new JLabel("Last Name");
	    lastNameTextField = new JTextField(20);
	    //Panel c3 = new Panel();
	    c4.add(lastNamelabel);
	    c4.add(lastNameTextField);
	    add(c4);
	    
	    
	    UpdateButton = new JButton("Update"); // button with text
	    UpdateButton.setHorizontalTextPosition(SwingConstants.CENTER);
	    UpdateButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		Panel c5 = new Panel();
		c5.add(UpdateButton); // add plainJButton to JFrame
		add(c5);
		
		insertButton = new JButton("Insert"); // button with text
		Panel c6 = new Panel();
		c6.add(insertButton); // add plainJButton to JFrame
		add(c6);

		
	    displayAllBookingsButton = new JButton("Display all Bookings"); // button with text
		c6.add(displayAllBookingsButton); // add plainJButton to JFrame
		add(c6);
		
		/*displayAllBookingsButton.addActionListener(        
	            new ActionListener() 
	            {
	               public void actionPerformed(ActionEvent event)
	               {
	                     // try to recover from invalid user query 
	                     // by executing default query
	                     try 
	                     {
	                        tableModel.setQuery(PersonQueries.selectAllPeople);
	                        //queryArea.setText(DEFAULT_QUERY);
	                     } 
	                     catch (SQLException sqlException2) 
	                     {
	                        JOptionPane.showMessageDialog(null, 
	                           sqlException2.getMessage(), "Database error", 
	                           JOptionPane.ERROR_MESSAGE);
	         
	                        // ensure database connection is closed
	                        tableModel.disconnectFromDatabase();
	         
	                        System.exit(1); // terminate application
	                     }                 
	                  } 
	               }         
	         ); // end call to addActionListener
	         /*
	         final TableRowSorter<TableModel> sorter = 
	            new TableRowSorter<TableModel>(tableModel);
	         resultTable.setRowSorter(sorter);
		
		*/
		
		idLabel = new JLabel("Search for ID");
		idTextField = new JTextField(20);
		Panel c1 = new Panel();
		c1.add(idLabel);
		c1.add(idTextField);
		add(c1);
	 
	    
	    submitButton = new JButton("Submit"); // button with text
	    c1.add(submitButton);
	    //submit button to search for the id of a particular entry
	    submitButton.addActionListener(
	            new ActionListener()
	            {
	               public void actionPerformed(ActionEvent evt)
	               {
	                  submitButtonActionPerformed(evt);
	               } 
	            } 
	         ); // end call to addActionListener

	    
	    
	    
	    // create JTable based on the tableModel
        JTable resultTable = new JTable(tableModel);
        c6.add(resultTable);
        add(c6);
		
	    
	}//end of constructor
		
		
	
	// handles call when submitButton is clicked
	   private void submitButtonActionPerformed(ActionEvent evt)
	   {
	      results = 
	      personQueries.getPeopleByID(Integer.parseInt(idTextField.getText())); //Integer.parseInt(idTextField.getText()) makes the textfield value into an int
	      numberOfEntries = results.size();
	      
	      if (numberOfEntries != 0)
	      {
	         currentEntryIndex = 0;
	         currentEntry = results.get(currentEntryIndex);
	         idTextField.setText("" + currentEntry.getUserID());
	         firstNameTextField.setText(currentEntry.getFirstName());
	         lastNameTextField.setText(currentEntry.getLastName());
	         startDateTextField.setText(currentEntry.getStartDate());
	         endateDateTextField.setText(currentEntry.getEndDate());
	         
	      } 
	      else
	         browseButtonActionPerformed(evt);
	   } 

	
	
	// handles call when displayAllBookingsButton is clicked
	   private void browseButtonActionPerformed(ActionEvent evt)
	   {
	      try
	      {
	         results = personQueries.getAllPeople();
	         numberOfEntries = results.size();
	      
	         if (numberOfEntries != 0)
	         {
	            currentEntryIndex = 0;
	            currentEntry = results.get(currentEntryIndex);
	   /*         idTextField.setText("" + currentEntry.getAddressID());
	            firstNameTextField.setText(currentEntry.getFirstName());
	            lastNameTextField.setText(currentEntry.getLastName());
	            emailTextField.setText(currentEntry.getEmail());
	            phoneTextField.setText(currentEntry.getPhoneNumber());
	            maxTextField.setText("" + numberOfEntries);
	            indexTextField.setText("" + (currentEntryIndex + 1));
	            nextButton.setEnabled(true);
	            previousButton.setEnabled(true);*/
	         } 
	      } 
	      catch (Exception e)
	      {
	         e.printStackTrace();
	      } 
	   } 
}//end of class