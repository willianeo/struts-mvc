package br.com.uaibusiness.ecommerce.dao;
// Generated Nov 24, 2019, 12:12:18 AM by Hibernate Tools 3.6.0.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import br.com.uaibusiness.ecommerce.model.BrandModels;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class BrandModels.
 * @see br.com.uaibusiness.ecommerce.model.BrandModels
 * @author Hibernate Tools
 */
public class BrandModelsDAO {

	private static final Log log = LogFactory.getLog(BrandModelsDAO.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(BrandModels transientInstance) {
		log.debug("persisting BrandModels instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(BrandModels instance) {
		log.debug("attaching dirty BrandModels instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(BrandModels instance) {
		log.debug("attaching clean BrandModels instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(BrandModels persistentInstance) {
		log.debug("deleting BrandModels instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public BrandModels merge(BrandModels detachedInstance) {
		log.debug("merging BrandModels instance");
		try {
			BrandModels result = (BrandModels) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public BrandModels findById(int id) {
		log.debug("getting BrandModels instance with id: " + id);
		try {
			BrandModels instance = (BrandModels) sessionFactory.getCurrentSession()
					.get("br.com.uaibusiness.ecommerce.model.BrandModels", id);
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

	public List<BrandModels> findByExample(BrandModels instance) {
		log.debug("finding BrandModels instance by example");
		try {
			List<BrandModels> results = (List<BrandModels>) sessionFactory.getCurrentSession()
					.createCriteria("br.com.uaibusiness.ecommerce.model.BrandModels").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
