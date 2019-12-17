package ovp.backend.persistence.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import ovp.backend.persistence.dao.UserTypeDAO;
import ovp.backend.persistence.model.UserType;

public class UserTypeDAOImpl implements UserTypeDAO {
	
	static Session sessionObj;

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	public List<UserType> displayUserTypes() {

		List<UserType> usersTypesList = null;

		try {
			// getting session object from session factory
			sessionObj = this.sessionFactory.openSession();
			// getting transaction object from session object
			sessionObj.beginTransaction();
			usersTypesList = (List<UserType>) sessionObj.createCriteria(UserType.class).list();
		} catch (Exception e) {
			// TODO: handle exception
			if (sessionObj.getTransaction() != null) {
				sessionObj.getTransaction().rollback();
			}
		} finally {
			if (sessionObj != null) {
				sessionObj.close();
			}
		}
		return usersTypesList;
	}

	public void createUserType(UserType type) {
		
		try {
			// getting seesion from session factory
			sessionObj = this.sessionFactory.openSession();
			// getting transaction object from session object
			sessionObj.beginTransaction();
			
			sessionObj.persist(type);
			sessionObj.getTransaction().commit();	
			
		} catch (Exception e) {
			// TODO: handle exception
			if (sessionObj.getTransaction() != null) {
				sessionObj.getTransaction().rollback();
			}
		} finally {
			if (sessionObj != null) {
				sessionObj.close();
			}
		}
	}

}
