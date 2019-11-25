package br.com.uaibusiness.ecommerce.dao;
// Generated Nov 24, 2019, 2:33:23 PM by Hibernate Tools 3.6.0.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import br.com.uaibusiness.ecommerce.hibernate.GenericHibernateDAO;
import br.com.uaibusiness.ecommerce.model.ProductTypes;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class ProductTypes.
 * @see br.com.uaibusiness.ecommerce.model.ProductTypes
 * @author Hibernate Tools
 */
public class ProductTypesImplDAO extends GenericHibernateDAO<ProductTypes, Integer>
		implements ProductTypesDAO {

	private static final Log log = LogFactory.getLog(ProductTypesImplDAO.class);
	
	public void persist(ProductTypes transientInstance) {
		log.debug("persisting ProductTypes instance");
		try {
			getSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ProductTypes instance) {
		log.debug("attaching dirty ProductTypes instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ProductTypes instance) {
		log.debug("attaching clean ProductTypes instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ProductTypes persistentInstance) {
		log.debug("deleting ProductTypes instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ProductTypes merge(ProductTypes detachedInstance) {
		log.debug("merging ProductTypes instance");
		try {
			ProductTypes result = (ProductTypes) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProductTypes findById(int id) {
		log.debug("getting ProductTypes instance with id: " + id);
		try {
			ProductTypes instance = (ProductTypes) getSession()
					.get("br.com.uaibusiness.ecommerce.model.ProductTypes", id);
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

	public List<ProductTypes> findByExample(ProductTypes instance) {
		log.debug("finding ProductTypes instance by example");
		try {
			List<ProductTypes> results = (List<ProductTypes>) getSession()
					.createCriteria("br.com.uaibusiness.ecommerce.model.ProductTypes").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
