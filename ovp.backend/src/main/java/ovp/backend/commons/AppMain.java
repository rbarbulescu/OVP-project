package ovp.backend.commons;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ovp.backend.persistence.dao.UserDAO;
import ovp.backend.persistence.model.User;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		UserDAO userDAO = context.getBean(UserDAO.class);
		
		List<User> usersList = userDAO.displayUsers();
		for(User user : usersList) {
			System.out.println(user.toString());
		}
		
		context.close();
	}

}
