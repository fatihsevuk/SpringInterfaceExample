package com.fatih.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SekilUygulamasi {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		/*
		 * Ucgen ucgen=(Ucgen)context.getBean("ucgen"); 
		 * ucgen.sekilCiz();
		 * 
		 * Daire daire=(Daire)context.getBean("daire"); 
		 * daire.sekilCiz();
		 */

		/*Sekil sekil = (Sekil) context.getBean("shape");
		sekil.sekilCiz();-->bu durmda spring.xml içeriinde shape diye bir bean tanımı yapmalıyız.

		Sekil sekil = (Sekil) context.getBean("ucgen");
		sekil.sekilCiz();*/
		
		Sekil sekil = (Sekil) context.getBean("daire");
		sekil.sekilCiz();

	}

}
