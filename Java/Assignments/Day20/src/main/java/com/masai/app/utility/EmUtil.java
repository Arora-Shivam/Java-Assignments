package com.masai.app.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmUtil {

	public static EntityManager provideEntityManager() {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("HBApp");
		
		EntityManager em=emf.createEntityManager();
		
		
		return em;
	}
}
