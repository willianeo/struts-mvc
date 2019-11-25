package br.com.uaibusiness.ecommerce.dao;
// Generated Nov 24, 2019, 2:33:23 PM by Hibernate Tools 3.6.0.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import br.com.uaibusiness.ecommerce.hibernate.GenericHibernateDAO;
import br.com.uaibusiness.ecommerce.model.MOptionValues;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class MOptionValues.
 * @see br.com.uaibusiness.ecommerce.model.MOptionValues
 * @author Hibernate Tools
 */
public class MOptionValuesImplDAO extends GenericHibernateDAO<MOptionValues, Integer>
		implements MOptionValuesDAO {

	private static final Log log = LogFactory.getLog(MOptionValuesImplDAO.class);
	
	public void persist(MOptionValues transientInstance) {
		log.debug("persisting MOptionValues instance");
		try {
			getSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(MOptionValues instance) {
		log.debug("attaching dirty MOptionValues instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MOptionValues instance) {
		log.debug("attaching clean MOptionValues instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(MOptionValues persistentInstance) {
		log.debug("deleting MOptionValues instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MOptionValues merge(MOptionValues detachedInstance) {
		log.debug("merging MOptionValues instance");
		try {
			MOptionValues result = (MOptionValues) getSession().merge(detachedInstance);
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
			MOptionValues instance = (MOptionValues) getSession()
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
			List<MOptionValues> results = (List<MOptionValues>) getSession()
					.createCriteria("br.com.uaibusiness.ecommerce.model.MOptionValues").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
