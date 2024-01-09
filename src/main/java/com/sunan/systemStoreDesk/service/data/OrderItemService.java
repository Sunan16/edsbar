package com.sunan.systemStoreDesk.service.data;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunan.systemStoreDesk.entities.OrderItem;
import com.sunan.systemStoreDesk.repositories.OrderItemRepository;
import com.sunan.systemStoreDesk.service.data.util.IDataService;

@Service
public class OrderItemService implements IDataService<OrderItem> {

	@Autowired
	private OrderItemRepository repository;

	@Override
	public List<OrderItem> findAll() {
		return repository.findAll();
	}

	@Override
	public OrderItem findById(Long id) {
		Optional<OrderItem> obj = repository.findById(id);
		return obj.get();
	}

	@Override
	public OrderItem insert(OrderItem obj) {
		return repository.save(obj);
	}

	@Override
	public void delete(OrderItem obj) {
		repository.delete(obj);
	}

	@Override
	public OrderItem update(Long id, OrderItem obj) {
		OrderItem entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	@Override
	public void updateData(OrderItem old, OrderItem updated) {
		old.setProduct(updated.getProduct());
		old.setPrice(updated.getPrice());
		old.setQuantity(updated.getQuantity());
	}

}
