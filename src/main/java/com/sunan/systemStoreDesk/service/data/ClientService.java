package com.sunan.systemStoreDesk.service.data;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunan.systemStoreDesk.entities.Client;
import com.sunan.systemStoreDesk.repositories.ClientRepository;
import com.sunan.systemStoreDesk.service.data.util.IDataService;

@Service
public class ClientService implements IDataService<Client> {

	@Autowired
	private ClientRepository repository;

	@Override
	public List<Client> findAll() {
		return repository.findAll();
	}

	@Override
	public Client findById(Long id) {
		Optional<Client> obj = repository.findById(id);
		return obj.get();
	}

	@Override
	public Client insert(Client obj) {
		return repository.save(obj);
	}

	@Override
	public void delete(Client obj) {
		repository.delete(obj);
	}

	@Override
	public Client update(Long id, Client obj) {
		Client entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	@Override
	public void updateData(Client old, Client updated) {
		old.setName(updated.getName());
		old.setPhone(updated.getPhone());
	}

}
