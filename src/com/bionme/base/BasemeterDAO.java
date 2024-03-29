package com.bionme.base;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import com.bionme.dao.iface.meterDAO;
import org.hibernate.criterion.Order;

/**
 * This is an automatically generated DAO class which should not be edited.
 */
public abstract class BasemeterDAO extends com.bionme.dao._RootDAO {

	public BasemeterDAO () {}
	
	public BasemeterDAO (Session session) {
		super(session);
	}

	// query name references


	public static meterDAO instance;

	/**
	 * Return a singleton of the DAO
	 */
	public static meterDAO getInstance () {
		if (null == instance) instance = new com.bionme.dao.meterDAO();
		return instance;
	}

	public Class getReferenceClass () {
		return com.bionme.meter.class;
	}

    public Order getDefaultOrder () {
		return null;
    }

	/**
	 * Cast the object as a com.bionme.meter
	 */
	public com.bionme.meter cast (Object object) {
		return (com.bionme.meter) object;
	}

	public com.bionme.meter get(int key)
	{
		return (com.bionme.meter) get(getReferenceClass(), new java.lang.Integer(key));
	}

	public com.bionme.meter get(int key, Session s)
	{
		return (com.bionme.meter) get(getReferenceClass(), new java.lang.Integer(key), s);
	}

	public com.bionme.meter load(int key)
	{
		return (com.bionme.meter) load(getReferenceClass(), new java.lang.Integer(key));
	}

	public com.bionme.meter load(int key, Session s)
	{
		return (com.bionme.meter) load(getReferenceClass(), new java.lang.Integer(key), s);
	}

	public com.bionme.meter loadInitialize(int key, Session s) 
	{ 
		com.bionme.meter obj = load(key, s); 
		if (!Hibernate.isInitialized(obj)) {
			Hibernate.initialize(obj);
		} 
		return obj; 
	}

/* Generic methods */

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 */
	public java.util.List<com.bionme.meter> findAll () {
		return super.findAll();
	}

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 */
	public java.util.List<com.bionme.meter> findAll (Order defaultOrder) {
		return super.findAll(defaultOrder);
	}

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 * Use the session given.
	 * @param s the Session
	 */
	public java.util.List<com.bionme.meter> findAll (Session s, Order defaultOrder) {
		return super.findAll(s, defaultOrder);
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * @param meter a transient instance of a persistent class 
	 * @return the class identifier
	 */
	public java.lang.Integer save(com.bionme.meter meter)
	{
		return (java.lang.Integer) super.save(meter);
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * Use the Session given.
	 * @param meter a transient instance of a persistent class
	 * @param s the Session
	 * @return the class identifier
	 */
	public java.lang.Integer save(com.bionme.meter meter, Session s)
	{
		return (java.lang.Integer) save((Object) meter, s);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default
	 * the instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the
	 * identifier property mapping. 
	 * @param meter a transient instance containing new or updated state 
	 */
	public void saveOrUpdate(com.bionme.meter meter)
	{
		saveOrUpdate((Object) meter);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default the
	 * instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the identifier
	 * property mapping. 
	 * Use the Session given.
	 * @param meter a transient instance containing new or updated state.
	 * @param s the Session.
	 */
	public void saveOrUpdate(com.bionme.meter meter, Session s)
	{
		saveOrUpdate((Object) meter, s);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * @param meter a transient instance containing updated state
	 */
	public void update(com.bionme.meter meter) 
	{
		update((Object) meter);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * Use the Session given.
	 * @param meter a transient instance containing updated state
	 * @param the Session
	 */
	public void update(com.bionme.meter meter, Session s)
	{
		update((Object) meter, s);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param id the instance ID to be removed
	 */
	public void delete(int id)
	{
		delete((Object) load(id));
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * Use the Session given.
	 * @param id the instance ID to be removed
	 * @param s the Session
	 */
	public void delete(int id, Session s)
	{
		delete((Object) load(id, s), s);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param meter the instance to be removed
	 */
	public void delete(com.bionme.meter meter)
	{
		delete((Object) meter);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * Use the Session given.
	 * @param meter the instance to be removed
	 * @param s the Session
	 */
	public void delete(com.bionme.meter meter, Session s)
	{
		delete((Object) meter, s);
	}
	
	/**
	 * Re-read the state of the given instance from the underlying database. It is inadvisable to use this to implement
	 * long-running sessions that span many business tasks. This method is, however, useful in certain special circumstances.
	 * For example 
	 * <ul> 
	 * <li>where a database trigger alters the object state upon insert or update</li>
	 * <li>after executing direct SQL (eg. a mass update) in the same session</li>
	 * <li>after inserting a Blob or Clob</li>
	 * </ul>
	 */
	public void refresh (com.bionme.meter meter, Session s)
	{
		refresh((Object) meter, s);
	}


}