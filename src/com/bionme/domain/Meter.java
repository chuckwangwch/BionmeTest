package com.bionme.domain;

import java.sql.Blob;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="meter")

public class Meter {
	
	private Long meterId;
	private String sn;
	private String tag;
	private byte[] isLock;
	private byte[] isOnline;
	private Date createDate;
	private Date modifyDate;
	private byte[] deleteTag;
	
	
	@Id
	@GeneratedValue
	@Column(name="meter_id")
	public Long getMeterId() {
		return meterId;
	}
	
	public void setMeterId(Long meterId) {
		this.meterId = meterId;
	}


	@Column(name="sn")
	public String getSn() {
		return sn;
	}
	
	public void setSn(String sn) {
		this.sn = sn;
	}
	
	@Column(name="tag")
	public String getTag() {
		return tag;
	}
	
	public void setTag(String tag) {
		this.tag = tag;
	}

	@Column(name="is_lock")
	@Lob
	public byte[] getIsLock() {
		return isLock;
	}
	
	public void setIsLock(byte[] isLock) {
		this.isLock = isLock;
	}
	@Column(name="is_online")
	@Lob
	public byte[] getIsOnline() {
		return isOnline;
	}
	
	public void setIsOnline(byte[] isOnline) {
		this.isOnline = isOnline;
	}
	
	@Column(name="create_date")
	public Date getCreateDate() {
		return createDate;
	}
	
	public void setCreateDate(Date createDate){
		this.createDate = createDate;
	}
	
	@Column(name="modify_date")
	public Date getModifyDate() {
		return modifyDate;
	}
	
	public void setModifyDate(Date modifyDate){
		this.modifyDate = modifyDate;
	}
	
	@Column(name="delete_tag")
	@Lob
	public byte[] getDeleteTag(){
		return deleteTag;
	}
	
	public void setDeleteTag(byte[] deleteTag){
		this.deleteTag = deleteTag;
	}
	

		

}
