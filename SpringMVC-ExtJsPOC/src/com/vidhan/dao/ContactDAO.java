package com.vidhan.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import com.vidhan.model.Contact;
import com.vidhan.model.ContactRowMapper;


/**
 * @author vidhan_chandra
 *
 */
@Repository
public class ContactDAO implements IContactDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	


	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * Get List of contacts from database
	 * @return list of all contacts
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Contact> getContacts(){
	String query = "select * from contact";
	List<Contact> contactList= jdbcTemplate.query(query, new ContactRowMapper());
	return contactList;
	}

	/**
	 * Delete a contact with the id passed as parameter
	 * @param id
	 */
	@Override
	public void deleteContact(int id){
		String sql = "delete from contact where CONTACT_ID = ?";
		Object[] args = {id};
		int argTypes[] = {Types.INTEGER};
		int i = jdbcTemplate.update(sql, args, argTypes);
		
	}
	
	/**
	 * Create a new Contact on the database or
	 * Update contact
	 * @param contact
	 * @return contact added or updated in DB
	 */
	@Override
	public Contact saveContact(final Contact contact){
    final int id = contact.getId();
    final String name = contact.getName();
    final String phone = contact.getPhone();
    final String email= contact.getEmail();
jdbcTemplate.update("insert into contact(CONTACT_ID,CONTACT_EMAIL,CONTACT_NAME,CONTACT_PHONE) "
            + "values (?, ?, ?, ?)", new PreparedStatementSetter() {
				
				@Override
				public void setValues(PreparedStatement ps) throws SQLException {
					ps.setInt(1, id);
					ps.setString(2, email);
					ps.setString(3, name);
					ps.setString(4, phone);
				}
			});
	return contact;
	}

}
