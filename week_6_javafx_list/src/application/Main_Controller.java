package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class Main_Controller implements Initializable {
	@FXML
	Label lblSelection;

	@FXML
	Button btnShow;
	
	@FXML
	ListView<String> daysList;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		daysList.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
	}
	
	@FXML
	private void handleShowButtonEvend(ActionEvent event) {
		ObservableList<String> selectedItemsList = daysList.getSelectionModel().getSelectedItems();
		lblSelection.setText("You have selected: " + selectedItemsList.get(0));
	}
}
