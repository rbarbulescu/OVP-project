package ovp.backend.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ovp.backend.business.UserManager;
import ovp.backend.persistence.dao.UserDAO;
import ovp.backend.persistence.model.User;
import ovp.common.resources.dto.UserDTO;

public class UserManagerImpl implements UserManager {
	
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

	UserDAO userDAO = context.getBean(UserDAO.class);

	@Override
	public void createUser(User user) {
		// TODO Auto-generated method stub
		try {
			userDAO.createUser(user);		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void updateUser(String email, String userName, String password, int userTypeId) {
		// TODO Auto-generated method stub
		try {
			userDAO.updateUser(email, userName, password, userTypeId);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();		
		}		
	}

	@Override
	public void updatePassword(String userName, String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		try {
			userDAO.updatePassword(userName, oldPassword, newPassword);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void deleteUser(String userName) {
		// TODO Auto-generated method stub
		try {
			userDAO.deleteUser(userName);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}		
	}

	@Override
	public UserDTO loginCheck(String userName, String password) {
		// TODO Auto-generated method stub		
		try {
			User userObj = userDAO.loginCheck(userName, password);		
			
			if(userObj.getUserName() != null) {
				UserDTO userDTO = new UserDTO();
				userDTO.setEmail(userObj.getEmail());
				userDTO.setUserName(userObj.getUserName());
				userDTO.setUserTypeId(userObj.getUserTypeId());
				
				return userDTO;
			}else {
				System.out.println("The username or the password is incorrect!");
				return null;
			}	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public UserDTO findUserByUserName(String userName) {
		// TODO Auto-generated method stub
		try {

			User userObj = userDAO.findUserByUserName(userName);
			UserDTO userDTO = new UserDTO();
			userDTO.setEmail(userObj.getEmail());
			userDTO.setUserName(userObj.getUserName());
			userDTO.setUserTypeId(userObj.getUserTypeId());
			
			return userDTO;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public List<UserDTO> displayUsers() {
		// TODO Auto-generated method stub		
		try {
			List<UserDTO> usersDTO = new ArrayList<UserDTO>();
			
			List<User> usersList = userDAO.displayUsers();
			for(User user : usersList) {
				UserDTO userDTO = new UserDTO();
				userDTO.setEmail(user.getEmail());
				userDTO.setUserName(user.getUserName());
				userDTO.setUserTypeId(user.getUserTypeId());
				
				usersDTO.add(userDTO);
			}
			
			return usersDTO;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
	}

}
