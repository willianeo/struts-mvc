package br.com.uaibusiness.ecommerce.dao;
// Generated Nov 24, 2019, 12:12:18 AM by Hibernate Tools 3.6.0.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import br.com.uaibusiness.ecommerce.model.ProductOptionValues;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class ProductOptionValues.
 * @see br.com.uaibusiness.ecommerce.model.ProductOptionValues
 * @author Hibernate Tools
 */
public class ProductOptionValuesDAO {

	private static final Log log = LogFactory.getLog(ProductOptionValuesDAO.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(ProductOptionValues transientInstance) {
		log.debug("persisting ProductOptionValues instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ProductOptionValues instance) {
		log.debug("attaching dirty ProductOptionValues instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ProductOptionValues instance) {
		log.debug("attaching clean ProductOptionValues instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ProductOptionValues persistentInstance) {
		log.debug("deleting ProductOptionValues instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ProductOptionValues merge(ProductOptionValues detachedInstance) {
		log.debug("merging ProductOptionValues instance");
		try {
			ProductOptionValues result = (ProductOptionValues) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProductOptionValues findById(int id) {
		log.debug("getting ProductOptionValues instance with id: " + id);
		try {
			ProductOptionValues instance = (ProductOptionValues) sessionFactory.getCurrentSession()
					.get("br.com.uaibusiness.ecommerce.model.ProductOptionValues", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<ProductOptionValues> findByExample(ProductOptionValues instance) {
		log.debug("finding ProductOptionValues instance by example");
		try {
			List<ProductOptionValues> results = (List<ProductOptionValues>) sessionFactory.getCurrentSession()
					.createCriteria("br.com.uaibusiness.ecommerce.model.ProductOptionValues").add(create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
