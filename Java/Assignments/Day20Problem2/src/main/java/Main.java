import javax.persistence.EntityManager;

public class Main {
	public static void main(String[] args) {
		
		EntityManager em=EmUtil.provideEntityManager();
		
		Department dept=new Department();
		dept.setdName("HR");
		dept.setLocation("Delhi");
		
		//First Emplooyee
		Employee emp1=new Employee();
		emp1.setAddress("Rampur");
		emp1.seteName("Shivam");
		emp1.setSalary(96000);
		emp1.setDept(dept);
		
		//Second Employee
		Employee emp2=new Employee();
		emp2.setAddress("Moradabad");
		emp2.seteName("Shiva");
		emp2.setSalary(86000);
		emp2.setDept(dept);
		
		//Third Employee
		Employee emp3=new Employee();
		emp3.setAddress("Chandigarh");
		emp3.seteName("Surri");
		emp3.setSalary(76000);
		emp3.setDept(dept);
		
		//Saving emp to dept
		dept.getEmployees().add(emp1);
		dept.getEmployees().add(emp2);
		dept.getEmployees().add(emp3);
		
		
		em.getTransaction().begin();
		
		em.persist(dept);
		em.persist(emp1);
		em.persist(emp2);
		em.persist(emp3);
		
		em.getTransaction().commit();
		em.close();
		
		System.out.println("Done");
	}
}
