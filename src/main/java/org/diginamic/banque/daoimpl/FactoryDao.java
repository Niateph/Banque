package org.diginamic.banque.daoimpl;


/**
 * Copie intégrals du FactoryDao fourni par Chistophe Germain
 */
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FactoryDao {
	
	private final EntityManagerFactory emf;
	
	public FactoryDao(String unitepersistence) throws Exception {
		// TODO Auto-generated constructor stub
		emf = Persistence.createEntityManagerFactory(unitepersistence);
	}
	
	/**
	public EntityManagerFactory getEmf() {
		return emf;
	}
	*/
	
	public EntityManager getEm() throws Exception{
		return emf.createEntityManager();
	}

	public void close(EntityManager em) throws Exception{
		if(em.isOpen()) {
			if(em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			em.close();
		}
	}
	
	private void close() throws Exception{
		if(emf.isOpen()) {
			emf.close();
		}
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		close();
	}
}