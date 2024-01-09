package com.sunan.systemStoreDesk.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Service;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;
import com.sunan.systemStoreDesk.entities.Address;
import com.sunan.systemStoreDesk.entities.Order;
import com.sunan.systemStoreDesk.entities.OrderItem;

@Service
public class PdfService {

	private final String FILE_PATH = ".\\comanda.pdf";

	public void createdPdf(Address a, Order c, String payMethod, String obs) {
		try {

			String fileName = FILE_PATH;
			Document doc = new Document();
			doc.setPageSize(new Rectangle(250, 550));
			doc.setMargins(5f, 5f, 5f, 5f);

			PdfWriter.getInstance(doc, new FileOutputStream(fileName));
			doc.open();

			// Fonts
			Font fontHeader = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD, BaseColor.BLACK);
			Font fontDestaque = new Font(Font.FontFamily.HELVETICA, 13, Font.BOLD, BaseColor.RED);
			Font fontParagraph = new Font(Font.FontFamily.HELVETICA, 12);
			Font fontFooter = new Font(Font.FontFamily.HELVETICA, 10);

			Paragraph p = new Paragraph("Comanda Ed's Bar", fontHeader);
			p.setAlignment(1);
			doc.add(p);

			p = new Paragraph("\n");
			doc.add(p);

			p = new Paragraph("Nome: " + c.getClient().getName() + "\n" + "Telefone: " + c.getClient().getPhone() + "\n"
					+ "Rua/Avenida: " + a.getLogradouro() + " n°" + a.getNumero() + "\n" + "Bairro: " + a.getBairro()
					+ "\n\n", fontParagraph);
			doc.add(p);

			p = new Paragraph("Valor do Frete: R$ " + a.getFrete() + "\n\n", fontDestaque);
			doc.add(p);

			for (OrderItem o : c.getItems()) {
				p = new Paragraph("  Prod: " + o.getProduct().getName() + " | Tam: " + o.getProduct().getSize() + "\n"
						+ "  Quantidade: " + o.getQuantity() + " | Valor individual: " + o.getProduct().getPrice()
						+ "\n\n", fontParagraph);
				doc.add(p);
			}

			p = new Paragraph("Valor Total: R$ " + c.getTotal() + "\n" + "Forma de pagamento: " + payMethod,
					fontParagraph);
			doc.add(p);

			p = new Paragraph("\n");
			doc.add(p);

			p = new Paragraph("OBS:" + obs, fontDestaque);
			doc.add(p);

			p = new Paragraph("\n");
			doc.add(p);

			p = new Paragraph("Data: " + c.getMoment() + "*Nota não fiscal* CNPJ - 16.481.246/0001-62", fontFooter);
			p.setAlignment(2);
			doc.add(p);

			doc.close();

			File f = new File(FILE_PATH);

			f.createNewFile();

		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (Exception ex) {

		}

	}

}
