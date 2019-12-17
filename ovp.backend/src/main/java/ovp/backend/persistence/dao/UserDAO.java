package ovp.backend.persistence.dao;

import java.util.List;

import ovp.backend.persistence.model.User;

public interface UserDAO {

	void createUser(User user);
	void updateUser(String email, String userName, String password, int userTypeId);
	void updatePassword(String userName, String oldPassword, String newPassword, int userTypeId);
	void deleteUser(String userName);	
	User loginCheck(String userName, String password, int userTypeId);
	User findUserByUserName(String userName);
	List<User> displayUsers();
	
}
