package com.sunan.systemStoreDesk.service.data;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunan.systemStoreDesk.entities.Payment;
import com.sunan.systemStoreDesk.repositories.PaymentRepository;
import com.sunan.systemStoreDesk.service.data.util.IDataService;

@Service
public class PaymentService implements IDataService<Payment> {

	@Autowired
	private PaymentRepository repository;

	@Override
	public List<Payment> findAll() {
		return repository.findAll();
	}

	@Override
	public Payment findById(Long id) {
		Optional<Payment> obj = repository.findById(id);
		return obj.get();
	}

	@Override
	public Payment insert(Payment obj) {
		return repository.save(obj);
	}

	@Override
	public void delete(Payment obj) {
		repository.delete(obj);
	}

	@Override
	public Payment update(Long id, Payment obj) {
		Payment entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	@Override
	public void updateData(Payment old, Payment updated) {
		old.setMoment(updated.getMoment());
	}
}
