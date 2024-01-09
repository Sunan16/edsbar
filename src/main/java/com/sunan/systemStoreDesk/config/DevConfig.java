package com.sunan.systemStoreDesk.config;

import java.util.Locale;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.sunan.systemStoreDesk.application.Application;
import com.sunan.systemStoreDesk.repositories.CategoryRepository;
import com.sunan.systemStoreDesk.repositories.ProductRepository;
import com.sunan.systemStoreDesk.service.MenuService;

@Configuration
@Profile("dev")
public class DevConfig implements CommandLineRunner {
	
	@Autowired
	private CategoryRepository cR;
	
	@Autowired
	private ProductRepository pR;
	
	@Autowired
	private MenuService mS;
	
	public void run(String... args) throws Exception {
		
		/*
		ViacepService via = new ViacepService();
		Address search = via.getEndereco("09351510");
		System.out.println(search);
		
		Category c1 = new Category(null, "📆🍽 Promoção do Dia 🍽📆");
		Category c2 = new Category(null, "🍤🐟 PEIXE E CAMARÃO 🐟🍤");
		Category c3 = new Category(null, "🍟 FRITURAS 🍟");
		Category c4 = new Category(null, "💸 ECONOMICAS TAMANHO (P) 💸");
		Category c5 = new Category(null, "🧊🥤 BEBIDAS 🥤🧊");
		//Category c6 = new Category(null, "🇧🇷🇮🇹 PARMEGIANAS E EMPANADOS 🇮🇹🇧🇷");
		
		cR.saveAll(Arrays.asList(c1, c2, c3, c4, c5));
		
		Product p1 = new Product(null, "Strogonoff", "Arroz, feijão, fritas e Salada", 20.0, "M", c1);
		Product p2 = new Product(null, "Tilapia c/ Camarão", "Arroz, feijão, fritas e Salada", 30.0, "M", c2);
		Product p3 = new Product(null, "Coca Cola", "Bebida 350ml", 20.0, "Lata", c5);
		Product p4 = new Product(null, "Almondegas", "Arroz, feijão, fritas e Salada", 10.0, "Economico (P)", c4);
		Product p5 = new Product(null, "Baião de 2", "Bisteca, torresmo, queijo coalho", 20.0, "P", c1);
		Product p6 = new Product(null, "Costelinha c/ Barbecue", "Arroz, feijão, fritas e Salada", 21.0, "M", c3);
		Product p7 = new Product(null, "Sobrecoxa com Alho e Manteiga", "Arroz, feijão, fritas e Salada", 20.0, "M", c3);
		Product p8 = new Product(null, "Fanta Laranja", "Bebida 2 Litros", 20.0, "2 Litros", c5);
		Product p9 = new Product(null, "Ovo frito", "Arroz, feijão, fritas e Salada", 10.0, "Economico (P)", c4);
		Product p10 = new Product(null, "File de Sardinha", "Arroz, feijão, fritas e Salada", 20.0, "M", c2);
		
		pR.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10));
		
		mS.createFileList();
		
		
		 */
		
		Application.main(args);
		
	}
}
