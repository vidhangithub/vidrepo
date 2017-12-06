package com.vidhan.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


/**
 * @author vidhan_chandra
 *
 */
public class ContactRowMapper  implements RowMapper<Contact>{

	@Override
	public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
		Contact contact = new Contact();
		contact.setId(rs.getInt("CONTACT_ID"));
		contact.setEmail(rs.getString("CONTACT_EMAIL"));
		contact.setName(rs.getString("CONTACT_NAME"));
		contact.setPhone(rs.getString("CONTACT_PHONE"));
		return contact;
	}

}
