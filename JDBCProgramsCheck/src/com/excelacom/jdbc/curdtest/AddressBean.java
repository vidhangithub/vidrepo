package com.excelacom.jdbc.curdtest;

public class AddressBean {

	private String addressId;
	private String streetName;
	private String houseNo;
	private String plotNo;
	private String roomNo;
	private String bedNo;
	public AddressBean(String addressId, String streetName, String houseNo,
			String plotNo, String roomNo, String bedNo) {
		super();
		this.addressId = addressId;
		this.streetName = streetName;
		this.houseNo = houseNo;
		this.plotNo = plotNo;
		this.roomNo = roomNo;
		this.bedNo = bedNo;
	}
	/**
	 * @return the addressId
	 */
	public final String getAddressId() {
		return addressId;
	}
	/**
	 * @param addressId the addressId to set
	 */
	public final void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	/**
	 * @return the streetName
	 */
	public final String getStreetName() {
		return streetName;
	}
	/**
	 * @param streetName the streetName to set
	 */
	public final void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	/**
	 * @return the houseNo
	 */
	public final String getHouseNo() {
		return houseNo;
	}
	/**
	 * @param houseNo the houseNo to set
	 */
	public final void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	/**
	 * @return the plotNo
	 */
	public final String getPlotNo() {
		return plotNo;
	}
	/**
	 * @param plotNo the plotNo to set
	 */
	public final void setPlotNo(String plotNo) {
		this.plotNo = plotNo;
	}
	/**
	 * @return the roomNo
	 */
	public final String getRoomNo() {
		return roomNo;
	}
	/**
	 * @param roomNo the roomNo to set
	 */
	public final void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	/**
	 * @return the bedNo
	 */
	public final String getBedNo() {
		return bedNo;
	}
	/**
	 * @param bedNo the bedNo to set
	 */
	public final void setBedNo(String bedNo) {
		this.bedNo = bedNo;
	}
	
	
}
