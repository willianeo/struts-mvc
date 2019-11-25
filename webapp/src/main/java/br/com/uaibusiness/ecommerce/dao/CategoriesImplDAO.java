package br.com.uaibusiness.ecommerce.dao;
// Generated Nov 24, 2019, 2:33:23 PM by Hibernate Tools 3.6.0.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import br.com.uaibusiness.ecommerce.hibernate.GenericHibernateDAO;
import br.com.uaibusiness.ecommerce.model.Categories;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Categories.
 * @see br.com.uaibusiness.ecommerce.model.Categories
 * @author Hibernate Tools
 */
public class CategoriesImplDAO extends GenericHibernateDAO<Categories, Integer>
		implements CategoriesDAO {

	private static final Log log = LogFactory.getLog(CategoriesImplDAO.class);
	
	public void persist(Categories transientInstance) {
		log.debug("persisting Categories instance");
		try {
			getSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Categories instance) {
		log.debug("attaching dirty Categories instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Categories instance) {
		log.debug("attaching clean Categories instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Categories persistentInstance) {
		log.debug("deleting Categories instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Categories merge(Categories detachedInstance) {
		log.debug("merging Categories instance");
		try {
			Categories result = (Categories) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Categories findById(int id) {
		log.debug("getting Categories instance with id: " + id);
		try {
			Categories instance = (Categories) getSession()
					.get("br.com.uaibusiness.ecommerce.model.Categories", id);
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

	public List<Categories> findByExample(Categories instance) {
		log.debug("finding Categories instance by example");
		try {
			List<Categories> results = (List<Categories>) getSession()
					.createCriteria("br.com.uaibusiness.ecommerce.model.Categories").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
