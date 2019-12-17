package ovp.backend.persistence.dao;

import java.util.List;

import ovp.backend.persistence.model.UserType;

public interface UserTypeDAO {
	
	List<UserType> displayUserTypes();
	void createUserType(UserType type);

}
