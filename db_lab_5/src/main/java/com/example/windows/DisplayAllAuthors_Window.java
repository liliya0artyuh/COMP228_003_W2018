package com.example.windows;

// Fig. 24.28: DisplayQueryResults.java
// Display the results of various queries.
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.example.dbUtils.ResultSetTableModel;

import javax.swing.JOptionPane;

public class DisplayAllAuthors_Window {
	private static ResultSetTableModel tableModel;

	public DisplayAllAuthors_Window() {
		// create ResultSetTableModel and display database table
		try {
			// create TableModel for results of query SELECT * FROM authors
			tableModel = new ResultSetTableModel();

			// create JTable based on the tableModel
			JTable resultTable = new JTable(tableModel);

			// place GUI components on JFrame's content pane
			JFrame window = new JFrame("Displaying All Records");
			window.add(new JScrollPane(resultTable), BorderLayout.CENTER);

			// dispose of window when user quits application (this overrides
			// the default of HIDE_ON_CLOSE)
			window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			window.setSize(500, 250);
			window.setVisible(true);

			// ensure database is closed when user closes this window
			window.addWindowListener(new WindowAdapter() {
				public void windowClosed(WindowEvent event) {
					tableModel.disconnectFromDatabase();
				}
			});
		} catch (SQLException sqlException) {
			JOptionPane.showMessageDialog(null, sqlException.getMessage(), "Database error", JOptionPane.ERROR_MESSAGE);
			tableModel.disconnectFromDatabase();
			System.exit(1); // terminate application
		}
	}
} // end class DisplayQueryResults

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
