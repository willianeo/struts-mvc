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
import br.com.uaibusiness.ecommerce.model.Admins;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Admins.
 * @see br.com.uaibusiness.ecommerce.model.Admins
 * @author Hibernate Tools
 */
public class AdminsImplDAO extends GenericHibernateDAO<Admins, Integer>
		implements AdminsDAO {

	private static final Log log = LogFactory.getLog(AdminsImplDAO.class);

	public Admins findByEmail(String email) {
		return (Admins) getSession().createCriteria(Admins.class)
				.add(Restrictions.eq("email", email)).uniqueResult();
	}
	
	public void persist(Admins transientInstance) {
		log.debug("persisting Admins instance");
		try {
			getSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Admins instance) {
		log.debug("attaching dirty Admins instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Admins instance) {
		log.debug("attaching clean Admins instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Admins persistentInstance) {
		log.debug("deleting Admins instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Admins merge(Admins detachedInstance) {
		log.debug("merging Admins instance");
		try {
			Admins result = (Admins) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Admins findById(int id) {
		log.debug("getting Admins instance with id: " + id);
		try {
			Admins instance = (Admins) getSession()
					.get("br.com.uaibusiness.ecommerce.model.Admins", id);
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

	public List<Admins> findByExample(Admins instance) {
		log.debug("finding Admins instance by example");
		try {
			List<Admins> results = (List<Admins>) getSession()
					.createCriteria("br.com.uaibusiness.ecommerce.model.Admins")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
