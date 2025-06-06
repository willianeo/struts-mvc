package br.com.uaibusiness.ecommerce.dao;
// Generated Nov 24, 2019, 2:33:23 PM by Hibernate Tools 3.6.0.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import br.com.uaibusiness.ecommerce.hibernate.GenericHibernateDAO;
import br.com.uaibusiness.ecommerce.model.Brands;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Brands.
 * @see br.com.uaibusiness.ecommerce.model.Brands
 * @author Hibernate Tools
 */
public class BrandsImplDAO extends GenericHibernateDAO<Brands, Integer>
		implements BrandsDAO {

	private static final Log log = LogFactory.getLog(BrandsImplDAO.class);
	
	public void persist(Brands transientInstance) {
		log.debug("persisting Brands instance");
		try {
			getSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Brands instance) {
		log.debug("attaching dirty Brands instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Brands instance) {
		log.debug("attaching clean Brands instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Brands persistentInstance) {
		log.debug("deleting Brands instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Brands merge(Brands detachedInstance) {
		log.debug("merging Brands instance");
		try {
			Brands result = (Brands) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Brands findById(int id) {
		log.debug("getting Brands instance with id: " + id);
		try {
			Brands instance = (Brands) getSession()
					.get("br.com.uaibusiness.ecommerce.model.Brands", id);
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

	public List<Brands> findByExample(Brands instance) {
		log.debug("finding Brands instance by example");
		try {
			List<Brands> results = (List<Brands>) getSession()
					.createCriteria("br.com.uaibusiness.ecommerce.model.Brands").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
