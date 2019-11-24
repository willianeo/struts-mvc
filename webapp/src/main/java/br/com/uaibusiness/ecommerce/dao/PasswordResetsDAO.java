package br.com.uaibusiness.ecommerce.dao;
// Generated Nov 24, 2019, 12:12:18 AM by Hibernate Tools 3.6.0.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import br.com.uaibusiness.ecommerce.model.PasswordResets;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class PasswordResets.
 * @see br.com.uaibusiness.ecommerce.model.PasswordResets
 * @author Hibernate Tools
 */
public class PasswordResetsDAO {

	private static final Log log = LogFactory.getLog(PasswordResetsDAO.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(PasswordResets transientInstance) {
		log.debug("persisting PasswordResets instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(PasswordResets instance) {
		log.debug("attaching dirty PasswordResets instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PasswordResets instance) {
		log.debug("attaching clean PasswordResets instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(PasswordResets persistentInstance) {
		log.debug("deleting PasswordResets instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PasswordResets merge(PasswordResets detachedInstance) {
		log.debug("merging PasswordResets instance");
		try {
			PasswordResets result = (PasswordResets) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PasswordResets findById(br.com.uaibusiness.ecommerce.model.PasswordResetsId id) {
		log.debug("getting PasswordResets instance with id: " + id);
		try {
			PasswordResets instance = (PasswordResets) sessionFactory.getCurrentSession()
					.get("br.com.uaibusiness.ecommerce.model.PasswordResets", id);
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

	public List<PasswordResets> findByExample(PasswordResets instance) {
		log.debug("finding PasswordResets instance by example");
		try {
			List<PasswordResets> results = (List<PasswordResets>) sessionFactory.getCurrentSession()
					.createCriteria("br.com.uaibusiness.ecommerce.model.PasswordResets").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
