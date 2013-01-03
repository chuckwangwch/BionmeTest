package com.bionme.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the meter table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="meter"
 */

public abstract class Basemeter  implements Serializable {

	public static String REF = "meter";
	public static String PROP_DELETE_TAG = "delete_tag";
	public static String PROP_CREATE_DATE = "create_date";
	public static String PROP_IS_ONLINE = "is_online";
	public static String PROP_TAG = "tag";
	public static String PROP_IS_LOCK = "is_lock";
	public static String PROP_MODIFY_DATE = "modify_date";
	public static String PROP_SN = "sn";
	public static String PROP_ID = "id";


	// constructors
	public Basemeter () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public Basemeter (int id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private int id;

	// fields
	private java.lang.String sn;
	private java.lang.String tag;
	private byte[] is_lock;
	private byte[] is_online;
	private java.util.Date create_date;
	private java.util.Date modify_date;
	private byte[] delete_tag;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="assigned"
     *  column="meter_id"
     */
	public int getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (int id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: sn
	 */
	public java.lang.String getSn () {
		return sn;
	}

	/**
	 * Set the value related to the column: sn
	 * @param sn the sn value
	 */
	public void setSn (java.lang.String sn) {
		this.sn = sn;
	}



	/**
	 * Return the value associated with the column: tag
	 */
	public java.lang.String getTag () {
		return tag;
	}

	/**
	 * Set the value related to the column: tag
	 * @param tag the tag value
	 */
	public void setTag (java.lang.String tag) {
		this.tag = tag;
	}



	/**
	 * Return the value associated with the column: is_lock
	 */
	public byte[] getIs_lock () {
		return is_lock;
	}

	/**
	 * Set the value related to the column: is_lock
	 * @param is_lock the is_lock value
	 */
	public void setIs_lock (byte[] is_lock) {
		this.is_lock = is_lock;
	}



	/**
	 * Return the value associated with the column: is_online
	 */
	public byte[] getIs_online () {
		return is_online;
	}

	/**
	 * Set the value related to the column: is_online
	 * @param is_online the is_online value
	 */
	public void setIs_online (byte[] is_online) {
		this.is_online = is_online;
	}



	/**
	 * Return the value associated with the column: create_date
	 */
	public java.util.Date getCreate_date () {
		return create_date;
	}

	/**
	 * Set the value related to the column: create_date
	 * @param create_date the create_date value
	 */
	public void setCreate_date (java.util.Date create_date) {
		this.create_date = create_date;
	}



	/**
	 * Return the value associated with the column: modify_date
	 */
	public java.util.Date getModify_date () {
		return modify_date;
	}

	/**
	 * Set the value related to the column: modify_date
	 * @param modify_date the modify_date value
	 */
	public void setModify_date (java.util.Date modify_date) {
		this.modify_date = modify_date;
	}



	/**
	 * Return the value associated with the column: delete_tag
	 */
	public byte[] getDelete_tag () {
		return delete_tag;
	}

	/**
	 * Set the value related to the column: delete_tag
	 * @param delete_tag the delete_tag value
	 */
	public void setDelete_tag (byte[] delete_tag) {
		this.delete_tag = delete_tag;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.bionme.meter)) return false;
		else {
			com.bionme.meter meter = (com.bionme.meter) obj;
			return (this.getId() == meter.getId());
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			return (int) this.getId();
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}