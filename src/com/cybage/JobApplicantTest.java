package com.cybage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JobApplicantTest {

	private static EntityManager em;

	JobApplicantTest()
	{}

	

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JobPortalDBConnection");
        em = emf.createEntityManager();
        
        createJobApplicant(3,"Sam","B.E.","5 years",6134,"sam@yahoo.com");
        
    }
    
    private static void createJobApplicant(int id, String name, String qual, String exp, int phn, String email) {
        em.getTransaction().begin();
       JobApplicant ja=new JobApplicant( id,  name,  qual,  exp,  phn,  email);
        em.persist(ja);
        em.getTransaction().commit();
        
    }
}
