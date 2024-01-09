package com.sunan.systemStoreDesk.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunan.systemStoreDesk.entities.Category;
import com.sunan.systemStoreDesk.entities.Product;
import com.sunan.systemStoreDesk.gui.util.Alerts;
import com.sunan.systemStoreDesk.service.data.CategoryService;
import com.sunan.systemStoreDesk.service.data.ProductService;

import javafx.scene.control.Alert.AlertType;

@Service
public class MenuService {

	@Autowired
	private ProductService sP;

	@Autowired
	private CategoryService sC;

	private final String pathFile = ".\\menu.txt";

	public void setMenu(Set<Product> removeProducts) {
		Set<Product> list = new LinkedHashSet<>();
		list.addAll(sP.findAll());
		list.removeAll(removeProducts);
		createFileList(list);
	}

	public void createFileList(Set<Product> prods) {

		Set<Category> cats = new LinkedHashSet<>(sC.findAll());
		
		StringBuilder sb = new StringBuilder();
		sb.append("*! Cardápio Ed's Bar do Dia !* \n_*" + LocalDateTime.now().getDayOfMonth() + "/"
				+ LocalDateTime.now().getMonthValue() + "/" + LocalDateTime.now().getYear() + "*_");
		sb.append("\n");
		sb.append("\n");
		for (Category c : cats) {
			
			Set<Product> pT = new LinkedHashSet<>(prods);
			pT.removeIf(p -> p.getCategory() != c);
			
			sb.append("-------------------------------");
			sb.append("\n");
			sb.append("      _*" + c.getName() + "*_");
			sb.append("\n");
			sb.append("-------------------------------");
			sb.append("\n");
			sb.append("\n");
			
			for (Product p : pT) {
					sb.append(p.getId() + " | *" + p.getName() + "*\n_Tamanho_: *" + p.getSize() + "* | R$ *"
							+ p.getPrice() + "*");
					sb.append("\n");
					sb.append("\n");
			}
			
		}
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathFile))) {
			File a = new File(pathFile);
			if (a.exists()) {
				a.createNewFile();
			}
			bw.write(sb.toString());
			bw.close();
		} catch (IOException e) {
			Alerts.showAlert("Erro ao gravar dados", "Erro de I/O :", e.getMessage(), AlertType.ERROR);
		}
	}
	
	public void createFileList() {
		
		Set<Product> prods = new LinkedHashSet<>(sP.findAll());
		Set<Category> cats = new LinkedHashSet<>(sC.findAll());
		
		StringBuilder sb = new StringBuilder();
		sb.append("*! Cardápio Ed's Bar do Dia !* \n_*Válido: " + LocalDateTime.now().getDayOfMonth() + "/"
				+ LocalDateTime.now().getMonthValue() + "/" + LocalDateTime.now().getYear() + "*_");
		sb.append("\n");
		sb.append("\n");
		for (Category c : cats) {
			
			Set<Product> pT = new LinkedHashSet<>(prods);
			pT.removeIf(p -> p.getCategory().getName() != c.getName());
			
			sb.append("~-=.-=.-=.-=.-=.-=.-=.~ *$* ~.=-.=-.=-.=-.=-.=-.=-~");
			sb.append("\n");
			sb.append("       _*" + c.getName() + "*_");
			sb.append("\n");
			sb.append("\n");
			
			for (Product p : pT) {
					sb.append(p.getId() + " | *" + p.getName() + "*\n_Tamanho_: *" + p.getSize() + "* | R$ *"
							+ (p.getPrice() - 0.01) + "*");
					sb.append("\n");
					sb.append("\n");
			}
			sb.append("\n");
		}
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathFile))) {
			File a = new File(pathFile);
			if (a.exists()) {
				a.createNewFile();
			}
			bw.write(sb.toString());
			bw.close();
		} catch (IOException e) {
			Alerts.showAlert("Erro ao gravar dados", "Erro de I/O :", e.getMessage(), AlertType.ERROR);
		}
	}
}
