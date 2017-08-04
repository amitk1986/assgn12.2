package com.diablo.assgn122;

import org.springframework.context.ApplicationContext;



public class MessageBean {
	public String getValueFromContext(String beanName) {
		ApplicationContext appCtx = AppContextProvider.getApplicationContext();
		String strFromContext = (String) appCtx.getBean(beanName);
		return strFromContext;
	}
}
