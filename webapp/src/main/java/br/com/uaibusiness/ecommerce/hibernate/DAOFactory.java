package br.com.uaibusiness.ecommerce.hibernate;

import br.com.uaibusiness.ecommerce.dao.AdminsDAO;
import br.com.uaibusiness.ecommerce.dao.BrandModelsDAO;
import br.com.uaibusiness.ecommerce.dao.BrandsDAO;
import br.com.uaibusiness.ecommerce.dao.CategoriesDAO;
import br.com.uaibusiness.ecommerce.dao.CountriesDAO;
import br.com.uaibusiness.ecommerce.dao.MarketsDAO;

public abstract class DAOFactory {
	/**
     * Creates a standalone DAOFactory that returns unmanaged DAO
     * beans for use in any environment Hibernate has been configured
     * for. Uses HibernateUtil/SessionFactory and Hibernate context
     * propagation (CurrentSessionContext), thread-bound or transaction-bound,
     * and transaction scoped.
     */
    public static final Class HIBERNATE = DAOHibernateFactory.class;

    /**
     * Factory method for instantiation of concrete factories.
     */
    public static DAOFactory instance(Class factory) {
        try {
            return (DAOFactory)factory.newInstance();
        } catch (Exception ex) {
            throw new RuntimeException("Couldn't create DAOFactory: " + factory);
        }
    }

    // Add your DAO interfaces here
    public abstract AdminsDAO getAdminsDAO();
    public abstract BrandModelsDAO getBrandModelsDAO();
    public abstract BrandsDAO getBrandsDAO();
    public abstract CategoriesDAO getCategoriesDAO();
    public abstract CountriesDAO getCountriesDAO();
    public abstract MarketsDAO getMarketsDAO();


}
