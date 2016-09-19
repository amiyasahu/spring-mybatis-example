package com.amiyasahu.spm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amiyasahu.spm.service.DBOperations;

public class SelectOneCustomerApp {

	public static void main(String[] args) {
		String configLocation = "classpath:apps/application.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		DBOperations dbOperations = (DBOperations) context.getBean("DBOperations");
		dbOperations.showOneCustomerById("103");
		((ClassPathXmlApplicationContext) context).close();
	}

}
