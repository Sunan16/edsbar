package com.sunan.systemStoreDesk.service.data;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunan.systemStoreDesk.entities.Order;
import com.sunan.systemStoreDesk.repositories.OrderRepository;
import com.sunan.systemStoreDesk.service.data.util.IDataService;

@Service
public class OrderService implements IDataService<Order> {

	@Autowired
	private OrderRepository repository;

	@Override
	public List<Order> findAll() {
		return repository.findAll();
	}

	@Override
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

	@Override
	public Order insert(Order obj) {
		return repository.save(obj);
	}

	@Override
	public void delete(Order obj) {
		repository.delete(obj);
	}

	@Override
	public Order update(Long id, Order obj) {
		Order entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	@Override
	public void updateData(Order old, Order updated) {
		old.setClient(updated.getClient());
		old.setPayment(updated.getPayment());
		old.setOrderStatus(updated.getOrderStatus());
	}

}
