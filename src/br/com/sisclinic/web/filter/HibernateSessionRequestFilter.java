package br.com.sisclinic.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.hibernate.SessionFactory;

import br.com.sisclinic.util.HibernateUtil;


public class HibernateSessionRequestFilter implements Filter {

	private SessionFactory sF;

	
	public void init(FilterConfig config) throws ServletException {
		sF = HibernateUtil.getSf();

	}

	
	public void destroy() {
		// TODO Auto-generated method stub

	}

	
	public void doFilter(ServletRequest sRq, ServletResponse sRp,
			FilterChain chain) throws IOException, ServletException {
		try {
			sF.getCurrentSession().beginTransaction();
			chain.doFilter(sRq, sRp);
			sF.getCurrentSession().getTransaction().commit();
			sF.getCurrentSession().close();

		} catch (Throwable e) {
			try {
				if (sF.getCurrentSession().getTransaction().isActive()) {
					sF.getCurrentSession().getTransaction().rollback();
				}

			} catch (Throwable ex) {
				ex.printStackTrace();
			}
			throw new ServletException(e);
		}

	}
}
	

    
   