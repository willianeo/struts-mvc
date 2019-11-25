package br.com.uaibusiness.ecommerce.dao;
// Generated Nov 24, 2019, 2:33:23 PM by Hibernate Tools 3.6.0.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import br.com.uaibusiness.ecommerce.hibernate.GenericHibernateDAO;
import br.com.uaibusiness.ecommerce.model.ProductMOptionValues;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class ProductMOptionValues.
 * @see br.com.uaibusiness.ecommerce.model.ProductMOptionValues
 * @author Hibernate Tools
 */
public class ProductMOptionValuesImplDAO extends GenericHibernateDAO<ProductMOptionValues, Integer>
		implements ProductMOptionValuesDAO {

	private static final Log log = LogFactory.getLog(ProductMOptionValuesImplDAO.class);
	
	public void persist(ProductMOptionValues transientInstance) {
		log.debug("persisting ProductMOptionValues instance");
		try {
			getSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ProductMOptionValues instance) {
		log.debug("attaching dirty ProductMOptionValues instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ProductMOptionValues instance) {
		log.debug("attaching clean ProductMOptionValues instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ProductMOptionValues persistentInstance) {
		log.debug("deleting ProductMOptionValues instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ProductMOptionValues merge(ProductMOptionValues detachedInstance) {
		log.debug("merging ProductMOptionValues instance");
		try {
			ProductMOptionValues result = (ProductMOptionValues) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProductMOptionValues findById(int id) {
		log.debug("getting ProductMOptionValues instance with id: " + id);
		try {
			ProductMOptionValues instance = (ProductMOptionValues) getSession()
					.get("br.com.uaibusiness.ecommerce.model.ProductMOptionValues", id);
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

	public List<ProductMOptionValues> findByExample(ProductMOptionValues instance) {
		log.debug("finding ProductMOptionValues instance by example");
		try {
			List<ProductMOptionValues> results = (List<ProductMOptionValues>) getSession()
					.createCriteria("br.com.uaibusiness.ecommerce.model.ProductMOptionValues").add(create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
