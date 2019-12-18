package ovp.backend.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ovp.backend.business.UserTypeManager;
import ovp.backend.persistence.dao.UserTypeDAO;
import ovp.backend.persistence.model.UserType;
import ovp.common.resources.dto.UserTypeDTO;

public class UserTypeManagerImpl implements UserTypeManager{
	
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

	UserTypeDAO userTypeDAO = context.getBean(UserTypeDAO.class);

	@Override
	public List<UserTypeDTO> displayUserTypes() {
		// TODO Auto-generated method stub
		List<UserType> userTypes = userTypeDAO.displayUserTypes();
		List<UserTypeDTO> userTypesDTO = new ArrayList<UserTypeDTO>();
		
		for(UserType ut : userTypes) {
			UserTypeDTO userTypeDTO = new UserTypeDTO();
			userTypeDTO.setUserType(ut.getUserType());
			userTypeDTO.setUserTypedId(ut.getId());
			
			userTypesDTO.add(userTypeDTO);
		}
		
		return userTypesDTO;
	}

	@Override
	public void createUserType(UserType userType) {
		// TODO Auto-generated method stub
		userTypeDAO.createUserType(userType);
	}

}
