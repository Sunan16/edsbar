package com.sunan.systemStoreDesk.service.data.util;

import java.util.List;

public interface IDataService<C> {

	List<C> findAll();

	C findById(Long id);

	C insert(C obj);

	void delete(C obj);

	C update(Long id, C obj);

	void updateData(C old, C updated);

}
