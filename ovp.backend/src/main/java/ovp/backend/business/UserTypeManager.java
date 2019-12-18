package ovp.backend.business;

import java.util.List;

import ovp.backend.persistence.model.UserType;
import ovp.common.resources.dto.UserTypeDTO;

public interface UserTypeManager {

	List<UserTypeDTO> displayUserTypes();
	void createUserType(UserType userType);
	
}
