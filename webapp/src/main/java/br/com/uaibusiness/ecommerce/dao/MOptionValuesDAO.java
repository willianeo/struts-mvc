package br.com.uaibusiness.ecommerce.dao;
// Generated Nov 24, 2019, 12:12:18 AM by Hibernate Tools 3.6.0.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import br.com.uaibusiness.ecommerce.model.MOptionValues;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class MOptionValues.
 * @see br.com.uaibusiness.ecommerce.model.MOptionValues
 * @author Hibernate Tools
 */
public class MOptionValuesDAO {

	private static final Log log = LogFactory.getLog(MOptionValuesDAO.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(MOptionValues transientInstance) {
		log.debug("persisting MOptionValues instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(MOptionValues instance) {
		log.debug("attaching dirty MOptionValues instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MOptionValues instance) {
		log.debug("attaching clean MOptionValues instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(MOptionValues persistentInstance) {
		log.debug("deleting MOptionValues instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MOptionValues merge(MOptionValues detachedInstance) {
		log.debug("merging MOptionValues instance");
		try {
			MOptionValues result = (MOptionValues) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public MOptionValues findById(int id) {
		log.debug("getting MOptionValues instance with id: " + id);
		try {
			MOptionValues instance = (MOptionValues) sessionFactory.getCurrentSession()
					.get("br.com.uaibusiness.ecommerce.model.MOptionValues", id);
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

	public List<MOptionValues> findByExample(MOptionValues instance) {
		log.debug("finding MOptionValues instance by example");
		try {
			List<MOptionValues> results = (List<MOptionValues>) sessionFactory.getCurrentSession()
					.createCriteria("br.com.uaibusiness.ecommerce.model.MOptionValues").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
