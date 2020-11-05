package sn.SenForage.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sn.SenForage.entities.User;

public class UserImpl implements IUser{
	
private EntityManager em;

 public UserImpl() {
	EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("SenForagePU");
	em =emf.createEntityManager();
}
	@Override
	public int add(User user) {
		try {
			em.getTransaction().begin();
			em.persist(user);
			em.getTransaction().commit();
			return 1;
			
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		
	}
	@Override
	public User getUserByEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		 try {
	            return (User)em
	                    .createQuery("select u from User u where u.email=:e and u.password=:p")
	                    .setParameter("e",email)
	                    .setParameter("p",password)
	                    .getSingleResult();

	        }catch (Exception e)
	        {
	            return null;
	        }
	}


}
