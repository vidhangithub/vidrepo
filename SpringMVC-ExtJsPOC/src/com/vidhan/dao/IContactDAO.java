package com.vidhan.dao;

import java.util.List;

import com.vidhan.model.Contact;


/**
 * @author vidhan_chandra
 *
 */
public interface IContactDAO {

	List<Contact> getContacts();
	
	void deleteContact(int id);
	
	Contact saveContact(Contact contact);
	
}
