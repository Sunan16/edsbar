package com.sunan.systemStoreDesk.service.data;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunan.systemStoreDesk.entities.Product;
import com.sunan.systemStoreDesk.repositories.ProductRepository;
import com.sunan.systemStoreDesk.service.data.util.IDataService;

@Service
public class ProductService implements IDataService<Product> {

	@Autowired
	private ProductRepository repository;

	@Override
	public List<Product> findAll() {
		return repository.findAll();
	}

	@Override
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}

	@Override
	public Product insert(Product obj) {
		return repository.save(obj);
	}

	@Override
	public void delete(Product obj) {
		repository.delete(obj);
	}

	@Override
	public Product update(Long id, Product obj) {
		Product entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	@Override
	public void updateData(Product entity, Product obj) {
		entity.setName(obj.getName());
		entity.setDescription(obj.getDescription());
		entity.setPrice(obj.getPrice());
		entity.setSize(obj.getSize());
	}
}
