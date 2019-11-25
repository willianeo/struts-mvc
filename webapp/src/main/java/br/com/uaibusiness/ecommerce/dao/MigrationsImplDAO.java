package br.com.uaibusiness.ecommerce.dao;
// Generated Nov 24, 2019, 2:33:23 PM by Hibernate Tools 3.6.0.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import br.com.uaibusiness.ecommerce.hibernate.GenericHibernateDAO;
import br.com.uaibusiness.ecommerce.model.Migrations;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Migrations.
 * @see br.com.uaibusiness.ecommerce.model.Migrations
 * @author Hibernate Tools
 */
public class MigrationsImplDAO extends GenericHibernateDAO<Migrations, Integer>
		implements MigrationsDAO {

	private static final Log log = LogFactory.getLog(MigrationsImplDAO.class);
	
	public void persist(Migrations transientInstance) {
		log.debug("persisting Migrations instance");
		try {
			getSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Migrations instance) {
		log.debug("attaching dirty Migrations instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Migrations instance) {
		log.debug("attaching clean Migrations instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Migrations persistentInstance) {
		log.debug("deleting Migrations instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Migrations merge(Migrations detachedInstance) {
		log.debug("merging Migrations instance");
		try {
			Migrations result = (Migrations) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Migrations findById(int id) {
		log.debug("getting Migrations instance with id: " + id);
		try {
			Migrations instance = (Migrations) getSession()
					.get("br.com.uaibusiness.ecommerce.model.Migrations", id);
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

	public List<Migrations> findByExample(Migrations instance) {
		log.debug("finding Migrations instance by example");
		try {
			List<Migrations> results = (List<Migrations>) getSession()
					.createCriteria("br.com.uaibusiness.ecommerce.model.Migrations").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
