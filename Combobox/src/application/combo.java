package application;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class combo implements Initializable{
	 @FXML private ComboBox <String> combo;
	 @FXML private TextField dato;
	 @FXML private Button CargarCombo;
	
	 
	 public void llenadocombobox() {
		
        	   ObservableList<String> listacombo= FXCollections.observableArrayList();
        	   String captura = dato.getText();
               listacombo.add(captura);
               combo.setItems(listacombo);
       	  if (combo.getSelectionModel().isEmpty()) {
       		  JOptionPane.showMessageDialog(null, "Combo Vacio");
       	  }
       	  else {
       		JOptionPane.showMessageDialog(null, "Combo con dato");
       	  }
       	initialize(null, null);
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub


	}

}
