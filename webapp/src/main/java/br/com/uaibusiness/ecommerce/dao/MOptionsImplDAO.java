package br.com.uaibusiness.ecommerce.dao;
// Generated Nov 24, 2019, 2:33:23 PM by Hibernate Tools 3.6.0.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import br.com.uaibusiness.ecommerce.hibernate.GenericDAO;
import br.com.uaibusiness.ecommerce.hibernate.GenericHibernateDAO;
import br.com.uaibusiness.ecommerce.model.MOptions;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class MOptions.
 * @see br.com.uaibusiness.ecommerce.model.MOptions
 * @author Hibernate Tools
 */
public class MOptionsImplDAO extends GenericHibernateDAO<MOptions, Integer>
		implements MOptionsDAO {

	private static final Log log = LogFactory.getLog(MOptionsImplDAO.class);
	
	public void persist(MOptions transientInstance) {
		log.debug("persisting MOptions instance");
		try {
			getSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(MOptions instance) {
		log.debug("attaching dirty MOptions instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MOptions instance) {
		log.debug("attaching clean MOptions instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(MOptions persistentInstance) {
		log.debug("deleting MOptions instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MOptions merge(MOptions detachedInstance) {
		log.debug("merging MOptions instance");
		try {
			MOptions result = (MOptions) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public MOptions findById(int id) {
		log.debug("getting MOptions instance with id: " + id);
		try {
			MOptions instance = (MOptions) getSession()
					.get("br.com.uaibusiness.ecommerce.model.MOptions", id);
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

	public List<MOptions> findByExample(MOptions instance) {
		log.debug("finding MOptions instance by example");
		try {
			List<MOptions> results = (List<MOptions>) getSession()
					.createCriteria("br.com.uaibusiness.ecommerce.model.MOptions").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
