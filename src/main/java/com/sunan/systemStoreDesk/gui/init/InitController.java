package com.sunan.systemStoreDesk.gui.init;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class InitController implements Initializable{
	
	@FXML
	private Label lbl;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		LocalDate date = LocalDate.now();
		String w;
		String y;
		
		switch(date.getDayOfWeek().getValue()) {
			case(1): w = "Segunda-feira";
				break;
			case(2): w = "Terça-feira";
				break;
			case(3): w = "Quarta-feira";
				break;
			case(4): w = "Quinta-feira";
				break;
			case(5): w = "Sexta-feira";
				break;
			case(6): w = "Sábado";
				break;
			default: w = "Vai descansar hoje é Domingo";
				break;
		}
		
		switch(date.getMonthValue()) {
		case(1): y = "Janeiro";
			break;
		case(2): y = "Fevereiro";
			break;
		case(3): y = "Março";
			break;
		case(4): y = "Abril";
			break;
		case(5): y = "Maio";
			break;
		case(6): y = "Junho";
			break;
		case(7): y = "Julho";
			break;
		case(8): y = "Agosto";
			break;
		case(9): y = "Setembro";
			break;
		case(10): y = "Outubro";
			break;
		case(11): y = "Novembro";
			break;
		default: y = "Dezembro";
			break;
	}
		lbl.setText(w + ", " + date.getDayOfMonth() + " de " + y + " de " + date.getYear());
	}
	
}
