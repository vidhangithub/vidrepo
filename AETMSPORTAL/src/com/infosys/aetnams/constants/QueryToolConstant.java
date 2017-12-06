package com.infosys.aetnams.constants;

public interface QueryToolConstant {
	
	public String INSERT_STAT = "INSERT";
	public String UPDATE_STAT = "UPDATE";
	public String DELETE_STAT = "DELETE";
	public String SELECT_STAT = "SELECT";
	
	public String MUST_STAT_WITH = "Query Must Start With SELECT/UPDATE/INSERT/DELETE";
	public String NO_FROM_IN_SELECT = "Check 'FORM'and delemeter 'WITH UR;'in SELECT Queris ";
	public String NO_INTO_VALUES_INSERT = "It seems an INSERT queries with no into/values";
	public String NO_SET_IN_UPDATE = "It seems an UPDATE queries with no SET";
	public String NO_FROM_IN_DELETE = "It seems an DELETE queries with no FROM";
	public String SEMICOLONMSG = "There is a semicolon in between queries";
	public String NOWHEREMSG = "There is no WHERE in the query";
	public String SUCCESSMSG = "The Above query is looks good, make sure there is a valid tablename/condition/logic after and before where respectively::";
	public String NO_TABLE_NAME_IN_SELECT = "Table name not exists in SELECT";
	public String NO_TABLE_NAME_IN_INSERT = "Table name not exists in INSERT";
	public String NO_TABLE_NAME_IN_UPDATE = "Table name not exists in UPADTE";
	
	public String MAGICAL_FROM = "FROM";
	public String MAGICAL_WHERE = "WHERE";
	public String SELECT_END = "WITH UR;";
	public CharSequence INSERT_INTO = "INTO";
	public CharSequence INSERT_VALUES = "VALUES";
	public CharSequence UPDATE_SET = "SET";
	public String UPDATE_END = ";COMMIT;";
	public CharSequence DELETE_FROM = "FROM";
	
	public int MAGICAL_ZERO = 0;
	public int MAGICAL_ONE = 1;
	public int MAGICAL_TWO = 2;
	public int MAGICAL_THREE = 3;
	public int MAGICAL_FOUR = 4;

	
	
	public String SUBMITTED_STATUS = "submitted";
	public Object QUERYSUBMSN_SUCCESS_MSG = "your query is submitted successfully.";
	
	
	
	
	
	
	
	
	

}
