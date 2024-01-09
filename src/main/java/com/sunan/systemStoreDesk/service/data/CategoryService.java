package com.sunan.systemStoreDesk.service.data;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunan.systemStoreDesk.entities.Category;
import com.sunan.systemStoreDesk.repositories.CategoryRepository;
import com.sunan.systemStoreDesk.service.data.util.IDataService;

@Service
public class CategoryService implements IDataService<Category> {

	@Autowired
	private CategoryRepository repository;

	@Override
	public List<Category> findAll() {
		return repository.findAll();
	}

	@Override
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}

	@Override
	public Category insert(Category obj) {
		return repository.save(obj);
	}

	@Override
	public void delete(Category obj) {
		repository.delete(obj);
	}

	@Override
	public Category update(Long id, Category obj) {
		Category entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	@Override
	public void updateData(Category old, Category updated) {
		old.setName(updated.getName());
	}

}
