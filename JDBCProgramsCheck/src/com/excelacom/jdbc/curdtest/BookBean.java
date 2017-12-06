package com.excelacom.jdbc.curdtest;

public class BookBean {
	private String bid;
	private String bname;
	private String author;
	private String edition;
	private String ISBN;
	private String publication;
	private String cost;
	public BookBean(){}
	public BookBean(String bid, String bname, String author, String edition,
			String iSBN, String publication, String cost) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.author = author;
		this.edition = edition;
		ISBN = iSBN;
		this.publication = publication;
		this.cost = cost;
	}
	/**
	 * @return the bid
	 */
	public final String getBid() {
		return bid;
	}
	/**
	 * @param bid the bid to set
	 */
	public final void setBid(String bid) {
		this.bid = bid;
	}
	/**
	 * @return the bname
	 */
	public final String getBname() {
		return bname;
	}
	/**
	 * @param bname the bname to set
	 */
	public final void setBname(String bname) {
		this.bname = bname;
	}
	/**
	 * @return the author
	 */
	public final String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public final void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the edition
	 */
	public final String getEdition() {
		return edition;
	}
	/**
	 * @param edition the edition to set
	 */
	public final void setEdition(String edition) {
		this.edition = edition;
	}
	/**
	 * @return the iSBN
	 */
	public final String getISBN() {
		return ISBN;
	}
	/**
	 * @param iSBN the iSBN to set
	 */
	public final void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	/**
	 * @return the publication
	 */
	public final String getPublication() {
		return publication;
	}
	/**
	 * @param publication the publication to set
	 */
	public final void setPublication(String publication) {
		this.publication = publication;
	}
	/**
	 * @return the cost
	 */
	public final String getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public final void setCost(String cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		//bid    | bname        | author        | publication | cost | edition | isbn
		String str="Book ID="+bid+"\t"+"Book Name="+bname+"\t"+"Author Name="+author+"\t"+"Publication="+publication+"\t"+"Cost of book="+cost+"\t"+"Edition="+edition+"\t"+"ISBN="+ISBN;
		return str;
	}

}
