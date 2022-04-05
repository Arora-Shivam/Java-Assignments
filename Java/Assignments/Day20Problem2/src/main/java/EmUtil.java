import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmUtil {
	
	public static EntityManager provideEntityManager() {
		EntityManager em=null;
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("HBApp2");
		em=emf.createEntityManager();
		return em;
		
	}
}
