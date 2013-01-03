package com.bionme.form;

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

public class dataform {
	
	@Id
	@Column(name="meterid")
	@GeneratedValue
	private Integer id;
	
	@Column(name="sn")
	private String sn;
	
	@Column(name="tag")
	private String tag;

	@Column(name="is_lock")
	@Lob
	private Blob is_lock;
	
	@Column(name="is_online")
	@Lob
	private Blob is_online;
	
	@Column(name="create_date")
	private Date create_date;
	
	@Column(name="modify_date")
	private Date modify_date;
	
	@Column(name="delete_tag")
	@Lob
	private Blob delete_tag;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getSn() {
		return sn;
	}
	
	public void setId(String sn) {
		this.sn = sn;
	}
	
	public String getTag() {
		return tag;
	}
	
	public void setTag(String tag) {
		this.tag = tag;
	}
	
	public Blob getIsLock() {
		return is_lock;
	}
	
	public void setIsLock(Blob is_lock) {
		this.is_lock = is_lock;
	}

	public Blob getIsOnline() {
		return is_online;
	}
	
	public void setIsOnline(Blob is_online) {
		this.is_online = is_online;
	}
	
	public Date getCreateDate() {
		return create_date;
	}
	
	public void setCreateDate(Date create_date){
		this.create_date = create_date;
	}
	
	public Date getModifyDate() {
		return modify_date;
	}
	
	public void setModifyDate(Date modify_date){
		this.modify_date = modify_date;
	}
	
	public Blob getDeleteTag(){
		return delete_tag;
	}
	
	public void setDeleteTag(Blob delete_tag){
		this.delete_tag = delete_tag;
	}
}
