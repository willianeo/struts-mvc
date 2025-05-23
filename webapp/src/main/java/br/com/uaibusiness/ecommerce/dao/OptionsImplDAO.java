package br.com.uaibusiness.ecommerce.dao;
// Generated Nov 24, 2019, 2:33:23 PM by Hibernate Tools 3.6.0.Final

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import br.com.uaibusiness.ecommerce.hibernate.GenericHibernateDAO;
import br.com.uaibusiness.ecommerce.model.Options;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Options.
 * @see br.com.uaibusiness.ecommerce.model.Options
 * @author Hibernate Tools
 */
public class OptionsImplDAO extends GenericHibernateDAO<Options, Integer>
		implements OptionsDAO {

	private static final Log log = LogFactory.getLog(OptionsImplDAO.class);
	
	public void persist(Options transientInstance) {
		log.debug("persisting Options instance");
		try {
			getSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Options instance) {
		log.debug("attaching dirty Options instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Options instance) {
		log.debug("attaching clean Options instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Options persistentInstance) {
		log.debug("deleting Options instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Options merge(Options detachedInstance) {
		log.debug("merging Options instance");
		try {
			Options result = (Options) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Options findById(int id) {
		log.debug("getting Options instance with id: " + id);
		try {
			Options instance = (Options) getSession()
					.get("br.com.uaibusiness.ecommerce.model.Options", id);
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

	public List<Options> findByExample(Options instance) {
		log.debug("finding Options instance by example");
		try {
			List<Options> results = (List<Options>) getSession()
					.createCriteria("br.com.uaibusiness.ecommerce.model.Options").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
