package br.com.uaibusiness.ecommerce.dao;
// Generated Nov 24, 2019, 2:33:23 PM by Hibernate Tools 3.6.0.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import br.com.uaibusiness.ecommerce.hibernate.GenericHibernateDAO;
import br.com.uaibusiness.ecommerce.model.Shops;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Shops.
 * @see br.com.uaibusiness.ecommerce.model.Shops
 * @author Hibernate Tools
 */
public class ShopsImplDAO extends GenericHibernateDAO<Shops, Integer>
		implements ShopsDAO {

	private static final Log log = LogFactory.getLog(ShopsImplDAO.class);
	
	public void persist(Shops transientInstance) {
		log.debug("persisting Shops instance");
		try {
			getSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Shops instance) {
		log.debug("attaching dirty Shops instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Shops instance) {
		log.debug("attaching clean Shops instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Shops persistentInstance) {
		log.debug("deleting Shops instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Shops merge(Shops detachedInstance) {
		log.debug("merging Shops instance");
		try {
			Shops result = (Shops) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Shops findById(int id) {
		log.debug("getting Shops instance with id: " + id);
		try {
			Shops instance = (Shops) getSession().get("br.com.uaibusiness.ecommerce.model.Shops",
					id);
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

	public List<Shops> findByExample(Shops instance) {
		log.debug("finding Shops instance by example");
		try {
			List<Shops> results = (List<Shops>) getSession()
					.createCriteria("br.com.uaibusiness.ecommerce.model.Shops").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
