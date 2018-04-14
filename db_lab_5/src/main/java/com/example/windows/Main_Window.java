package com.example.windows;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Main_Window extends JFrame {

	private static final long serialVersionUID = 1L;
	JButton displayAll;
	JButton insertNew;
	JButton findAuthor;
	private JLabel idLabel;
	private JTextField idTextField;

	public Main_Window() {
		super("Main Window");
		setLayout(new FlowLayout());
		
		displayAll = new JButton("Display All");
		DisplayAllButtonHandler displayAllHandler = new DisplayAllButtonHandler();
		displayAll.addActionListener(displayAllHandler);

		
		insertNew = new JButton("Insert New");
		InsertNewButtonHandler insertNewHandler = new InsertNewButtonHandler();
		insertNew.addActionListener(insertNewHandler);
		
		idLabel = new JLabel();
		idLabel.setText("Author ID:");
		idTextField = new JTextField(10);
		
		findAuthor = new JButton("Find Author");
		FindButtonHandler findHandler = new FindButtonHandler();
		findAuthor.addActionListener(findHandler);
		
		add(displayAll);
		add(insertNew);
		add(idLabel);
		add(idTextField);
		add(findAuthor);
	}

	private class DisplayAllButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			@SuppressWarnings("unused")
			DisplayAllAuthors_Window displayQueryResults = new DisplayAllAuthors_Window();
		}
	}
	
	private class InsertNewButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			InsertRecord_Window insertRecordFrame = new InsertRecord_Window(); 
			insertRecordFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		    insertRecordFrame.setSize(500, 500); 
		    insertRecordFrame.setVisible(true); 
		}
	}
	
	private class FindButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			try {
				ManageAuthor_Window findRecordFrame = new ManageAuthor_Window(Integer.parseInt(idTextField.getText()));
				findRecordFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				findRecordFrame.setSize(500, 500); 
				findRecordFrame.setVisible(true); 
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.PLAIN_MESSAGE);
			} 
		}
	}

}
