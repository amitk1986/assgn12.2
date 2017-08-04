package com.diablo.assgn122;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
    	MessageBean hw = (MessageBean) appContext.getBean("msg");
		
		String output = hw.getValueFromContext("strHello");
		System.out.print(output);
    }
}
