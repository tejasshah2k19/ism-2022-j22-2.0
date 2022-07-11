package com.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServerLogListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent sc) {
		System.out.println("ServerShutDown....");
		//
	}

	public void contextInitialized(ServletContextEvent sc) {
		System.out.println("ServerStarted.....");
		//
	}
}
