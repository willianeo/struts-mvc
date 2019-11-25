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
import br.com.uaibusiness.ecommerce.model.Countries;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Countries.
 * @see br.com.uaibusiness.ecommerce.model.Countries
 * @author Hibernate Tools
 */
public class CountriesImplDAO extends GenericHibernateDAO<Countries, Integer>
		implements CountriesDAO {

	private static final Log log = LogFactory.getLog(CountriesImplDAO.class);
	
	public void persist(Countries transientInstance) {
		log.debug("persisting Countries instance");
		try {
			getSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Countries instance) {
		log.debug("attaching dirty Countries instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Countries instance) {
		log.debug("attaching clean Countries instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Countries persistentInstance) {
		log.debug("deleting Countries instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Countries merge(Countries detachedInstance) {
		log.debug("merging Countries instance");
		try {
			Countries result = (Countries) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Countries findById(int id) {
		log.debug("getting Countries instance with id: " + id);
		try {
			Countries instance = (Countries) getSession()
					.get("br.com.uaibusiness.ecommerce.model.Countries", id);
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

	public List<Countries> findByExample(Countries instance) {
		log.debug("finding Countries instance by example");
		try {
			List<Countries> results = (List<Countries>) getSession()
					.createCriteria("br.com.uaibusiness.ecommerce.model.Countries").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
