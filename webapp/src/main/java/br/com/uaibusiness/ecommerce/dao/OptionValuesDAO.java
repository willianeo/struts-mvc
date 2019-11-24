package br.com.uaibusiness.ecommerce.dao;
// Generated Nov 24, 2019, 12:12:18 AM by Hibernate Tools 3.6.0.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import br.com.uaibusiness.ecommerce.model.OptionValues;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class OptionValues.
 * @see br.com.uaibusiness.ecommerce.model.OptionValues
 * @author Hibernate Tools
 */
public class OptionValuesDAO {

	private static final Log log = LogFactory.getLog(OptionValuesDAO.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(OptionValues transientInstance) {
		log.debug("persisting OptionValues instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(OptionValues instance) {
		log.debug("attaching dirty OptionValues instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(OptionValues instance) {
		log.debug("attaching clean OptionValues instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(OptionValues persistentInstance) {
		log.debug("deleting OptionValues instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public OptionValues merge(OptionValues detachedInstance) {
		log.debug("merging OptionValues instance");
		try {
			OptionValues result = (OptionValues) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public OptionValues findById(int id) {
		log.debug("getting OptionValues instance with id: " + id);
		try {
			OptionValues instance = (OptionValues) sessionFactory.getCurrentSession()
					.get("br.com.uaibusiness.ecommerce.model.OptionValues", id);
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

	public List<OptionValues> findByExample(OptionValues instance) {
		log.debug("finding OptionValues instance by example");
		try {
			List<OptionValues> results = (List<OptionValues>) sessionFactory.getCurrentSession()
					.createCriteria("br.com.uaibusiness.ecommerce.model.OptionValues").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
