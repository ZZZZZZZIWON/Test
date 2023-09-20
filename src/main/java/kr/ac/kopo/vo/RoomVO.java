package kr.ac.kopo.vo;

import java.util.Date;

public class RoomVO {
		
	private Long roomNo;
	private Long agencyNo;
	private String roomType;
	private String address;
	private String dong;
	private String ho;
	private String memoShort;
	private String memoDetail;
	private Date registDate;
	private Date updateDate;
	private String useAt;
	
	public Long getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(Long roomNo) {
		this.roomNo = roomNo;
	}
	public Long getAgencyNo() {
		return agencyNo;
	}
	public void setAgencyNo(Long agencyNo) {
		this.agencyNo = agencyNo;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	public String getHo() {
		return ho;
	}
	public void setHo(String ho) {
		this.ho = ho;
	}
	public String getMemoShort() {
		return memoShort;
	}
	public void setMemoShort(String memoShort) {
		this.memoShort = memoShort;
	}
	public String getMemoDetail() {
		return memoDetail;
	}
	public void setMemoDetail(String memoDetail) {
		this.memoDetail = memoDetail;
	}
	public Date getRegistDate() {
		return registDate;
	}
	public void setRegistDate(Date registDate) {
		this.registDate = registDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getUseAt() {
		return useAt;
	}
	public void setUseAt(String useAt) {
		this.useAt = useAt;
	}
}
