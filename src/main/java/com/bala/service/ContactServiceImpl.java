package com.bala.service;

import com.bala.dao.ContactDao;

public class ContactServiceImpl implements ContactService {

	private ContactDao contactDao;

	public void setContactDao(ContactDao contactDao) {
		this.contactDao = contactDao;
	}

	public String getNameById(Integer id) {

		String name = contactDao.findNameById(id);

		// logic
		String formattedMane = name.toUpperCase();

		return formattedMane;

	}

}
