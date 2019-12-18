package ovp.backend.business;

import java.util.List;

import ovp.backend.persistence.model.User;
import ovp.common.resources.dto.UserDTO;

public interface UserManager {

	void createUser(User user);
	void updateUser(String email, String userName, String password, int userTypeId);
	void updatePassword(String userName, String oldPassword, String newPassword);
	void deleteUser(String userName);	
	UserDTO loginCheck(String userName, String password);
	UserDTO findUserByUserName(String userName);
	List<UserDTO> displayUsers();
	
}
