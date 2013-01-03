package com.bionme.dao.iface;

import java.io.Serializable;

public interface meterDAO {
	public com.bionme.meter get(int key);

	public com.bionme.meter load(int key);

	public java.util.List<com.bionme.meter> findAll ();


	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * @param meter a transient instance of a persistent class 
	 * @return the class identifier
	 */
	public java.lang.Integer save(com.bionme.meter meter);

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default
	 * the instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the
	 * identifier property mapping. 
	 * @param meter a transient instance containing new or updated state 
	 */
	public void saveOrUpdate(com.bionme.meter meter);

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * @param meter a transient instance containing updated state
	 */
	public void update(com.bionme.meter meter);

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param id the instance ID to be removed
	 */
	public void delete(int id);

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param meter the instance to be removed
	 */
	public void delete(com.bionme.meter meter);


}