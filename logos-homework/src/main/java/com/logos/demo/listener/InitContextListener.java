package com.logos.demo.listener;

import java.lang.invoke.MethodHandles;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;
import org.springframework.web.context.WebApplicationContext;

public class InitContextListener implements ServletContextListener {

	private static final Logger logger = Logger.getLogger(MethodHandles.lookup().lookupClass());

	protected WebApplicationContext getWebApplicationContext(ServletContextEvent event) {
		ServletContext servletContext = event.getServletContext();

		return (WebApplicationContext) servletContext
				.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		logger.info("Logos has been destroyed");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext context = sce.getServletContext();
		String contextPath = context.getContextPath();
		context.setAttribute("context", contextPath);
	}

}
