package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class MyCheckBoxesController implements Initializable{

	@FXML
	private CheckBox checkBox_1;
	
	@FXML
	private CheckBox checkBox_2;
	
	@FXML
	private CheckBox checkBox_3;
	
	@FXML
	private Label label;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	    label.setText("");
		
	}

	@FXML
	private void handleCheckboxAction(ActionEvent event) {
		System.out.println("You clicked me!");
		label.setText("");
		if(checkBox_1.isSelected()) {
			label.setText(checkBox_1.getText());
		}
		if(checkBox_2.isSelected()) {
			label.setText(label.getText() + checkBox_2.getText());
		}
		if(checkBox_3.isSelected()) {
			label.setText(label.getText() + checkBox_3.getText());
		}

	}
}
