package  com.centralizedData.centralized.configuration;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDao<PK extends Serializable, T> {

	private final Class<T> persistentClass;

	@SuppressWarnings("unchecked")
	public AbstractDao() {
		this.persistentClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass())
				.getActualTypeArguments()[1];
	}

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.openSession();
	}

	public T getByKey(PK key) {
		return (T) getSession().get(persistentClass, key);
	}

	public T loadByKey(PK key) {
		return (T) getSession().load(persistentClass, key);
	}

	public T findByKey(PK key) {
		return (T) getSession().find(persistentClass, key);
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return getSession().createQuery("from " + persistentClass.getName() + " as type where type.isActive='1'")
				.list();
	}

	public void persist(T entity) {
		getSession().persist(entity);
	}

	public T persistAndGet(T entity) {
		getSession().persist(entity);
		getSession().flush();
		getSession().refresh(entity);
		return entity;
	}

	public void update(T entity) {
		getSession().update(entity);
	}

	public void delete(T entity) {
		getSession().delete(entity);
	}

	public void remove(T entity) {
		getSession().remove(entity);
	}

	public void merge(T entity) {
		getSession().merge(entity);
	}

	public void expliciteFlush() {
		getSession().flush();
	}

	protected CriteriaBuilder createCriteriaBuilder() {
		return getSession().getCriteriaBuilder();
	}

	public Session getMySession() {
		return sessionFactory.openSession();
	}
}
