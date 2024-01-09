package com.sunan.systemStoreDesk.service.data;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunan.systemStoreDesk.entities.Address;
import com.sunan.systemStoreDesk.repositories.AddressRepository;
import com.sunan.systemStoreDesk.service.data.util.IDataService;

@Service
public class AddressService implements IDataService<Address> {

	@Autowired
	private AddressRepository repository;

	@Override
	public List<Address> findAll() {
		return repository.findAll();
	}

	@Override
	public Address findById(Long id) {
		Optional<Address> obj = repository.findById(id);
		return obj.get();
	}

	@Override
	public Address insert(Address obj) {
		return repository.save(obj);
	}

	@Override
	public void delete(Address obj) {
		repository.delete(obj);
	}

	@Override
	public Address update(Long id, Address obj) {
		Address entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	@Override
	public void updateData(Address old, Address updated) {
		old.setBairro(updated.getBairro());
		old.setCep(updated.getCep());
		old.setFrete(updated.getFrete());
		old.setLocalidade(updated.getLocalidade());
		old.setLogradouro(updated.getLogradouro());
		old.setNumero(updated.getNumero());
	}

}
