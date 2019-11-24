package br.com.uaibusiness.ecommerce.hibernate;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.StaleObjectStateException;
import org.hibernate.engine.FilterDefinition;

public class SessionRequestFilter implements Filter {

    private SessionFactory sf;

    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain)
            throws IOException, ServletException {

        try {

            sf.getCurrentSession().beginTransaction();
            chain.doFilter(request, response);
            sf.getCurrentSession().getTransaction().commit();

        } catch (StaleObjectStateException staleEx) {
            throw staleEx;
        } catch (Throwable ex) {
            // Rollback only
            ex.printStackTrace();
            try {
                if (sf.getCurrentSession().getTransaction().isActive()) {
                    sf.getCurrentSession().getTransaction().rollback();
                }
            } catch (Throwable rbEx) {
            		System.out.print(rbEx.getStackTrace());
            }
            throw new ServletException(ex);
        }
    }

    public void init(FilterConfig filterConfig) throws ServletException {
        sf = SessionUtil.getSessionFactory();
    }

    public void destroy() {}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public FilterDefinition getFilterDefinition() {
		// TODO Auto-generated method stub
		return null;
	}

	public Filter setParameter(String name, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	public Filter setParameterList(String name, Collection values) {
		// TODO Auto-generated method stub
		return null;
	}

	public Filter setParameterList(String name, Object[] values) {
		// TODO Auto-generated method stub
		return null;
	}

	public void validate() throws HibernateException {
		// TODO Auto-generated method stub
		
	}


}
