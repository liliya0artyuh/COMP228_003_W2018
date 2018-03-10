package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class MyComboBoxController implements Initializable{

	@FXML
	private ComboBox comboBox;
	
	@FXML
	private Label label;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	    comboBox.getItems().removeAll(comboBox.getItems());
	    comboBox.getItems().addAll("Yellow", "Green", "Red");
	    comboBox.getSelectionModel().select("Green");
	    label.setText(String.valueOf(comboBox.getSelectionModel().getSelectedItem()));
		
	}

	@FXML
	private void handleComboBoxAction(ActionEvent event) {
		System.out.println("You clicked me!");
		label.setText(String.valueOf(comboBox.getSelectionModel().getSelectedItem()));

	}
}
