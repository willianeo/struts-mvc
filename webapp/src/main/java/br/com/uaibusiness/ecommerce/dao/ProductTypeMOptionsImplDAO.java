package br.com.uaibusiness.ecommerce.dao;
// Generated Nov 24, 2019, 2:33:23 PM by Hibernate Tools 3.6.0.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import br.com.uaibusiness.ecommerce.hibernate.GenericHibernateDAO;
import br.com.uaibusiness.ecommerce.model.ProductTypeMOptions;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class ProductTypeMOptions.
 * @see br.com.uaibusiness.ecommerce.model.ProductTypeMOptions
 * @author Hibernate Tools
 */
public class ProductTypeMOptionsImplDAO extends GenericHibernateDAO<ProductTypeMOptions, Integer>
		implements ProductTypeMOptionsDAO {

	private static final Log log = LogFactory.getLog(ProductTypeMOptionsImplDAO.class);
	
	public void persist(ProductTypeMOptions transientInstance) {
		log.debug("persisting ProductTypeMOptions instance");
		try {
			getSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ProductTypeMOptions instance) {
		log.debug("attaching dirty ProductTypeMOptions instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ProductTypeMOptions instance) {
		log.debug("attaching clean ProductTypeMOptions instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ProductTypeMOptions persistentInstance) {
		log.debug("deleting ProductTypeMOptions instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ProductTypeMOptions merge(ProductTypeMOptions detachedInstance) {
		log.debug("merging ProductTypeMOptions instance");
		try {
			ProductTypeMOptions result = (ProductTypeMOptions) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProductTypeMOptions findById(int id) {
		log.debug("getting ProductTypeMOptions instance with id: " + id);
		try {
			ProductTypeMOptions instance = (ProductTypeMOptions) getSession()
					.get("br.com.uaibusiness.ecommerce.model.ProductTypeMOptions", id);
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

	public List<ProductTypeMOptions> findByExample(ProductTypeMOptions instance) {
		log.debug("finding ProductTypeMOptions instance by example");
		try {
			List<ProductTypeMOptions> results = (List<ProductTypeMOptions>) getSession()
					.createCriteria("br.com.uaibusiness.ecommerce.model.ProductTypeMOptions").add(create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
