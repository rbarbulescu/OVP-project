package ovp.backend.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ovp.backend.persistence.dao.UserDAO;
import ovp.backend.persistence.dao.UserTypeDAO;
import ovp.backend.persistence.model.User;
import ovp.backend.persistence.model.UserType;
import ovp.common.resources.dto.UserDTO;
import ovp.common.resources.dto.UserTypeDTO;

@Path("/users")
public class UserController {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

	UserDAO userDAO = context.getBean(UserDAO.class);
	UserTypeDAO userTypeDAO = context.getBean(UserTypeDAO.class);

	@GET
	@Path("/types")
	@Produces(MediaType.APPLICATION_JSON)
	public List<UserTypeDTO> getTypes() {
		
		List<UserType> userType = userTypeDAO.displayUserTypes();
		List<UserTypeDTO> userTypeDTO = new ArrayList<UserTypeDTO>();
		
		for(UserType ut : userType) {
			UserTypeDTO utd = new UserTypeDTO(ut.getId(), ut.getUserType());
			userTypeDTO.add(utd);
		}
		
		return userTypeDTO;
	}

	@POST
	@Path("/type")
	@Produces(MediaType.APPLICATION_JSON)
	public void createUserType(String json) {

		JSONObject jsonObj;
		try {
			jsonObj = new JSONObject(json);
			int id = jsonObj.getInt("id");
			String userType = jsonObj.getString("userType");

			UserType type = new UserType();
			type.setId(id);
			type.setUserType(userType);

			userTypeDAO.createUserType(type);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<UserDTO> getUsers() {
		
		List<User> usersList = userDAO.displayUsers();
		List<UserDTO> usersDTOList = new ArrayList<UserDTO>();
		for (User u : usersList) {
			UserDTO userDTO = new UserDTO(u.getEmail(), u.getUserName(), u.getUserTypeId());
			usersDTOList.add(userDTO);
		}

		return usersDTOList;
	}

	@GET
	@Path("/{userName}")
	@Produces(MediaType.APPLICATION_JSON)
	public UserDTO findUser(@PathParam("userName") String userName) {
		
		User user = userDAO.findUserByUserName(userName);
		
		UserDTO userDTO = new UserDTO(user.getEmail(), user.getUserName(), user.getUserTypeId());
		
		return userDTO;
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public void createUser(String json) {

		JSONObject jsonObj;
		try {
			jsonObj = new JSONObject(json);
			String email = jsonObj.getString("email");
			String userName = jsonObj.getString("userName");
			String password = jsonObj.getString("password");
			int userTypeId = jsonObj.getInt("userTypeId");

			User user = new User();
			user.setEmail(email);
			user.setUserName(userName);
			user.setPassword(password);
			user.setUserTypeId(userTypeId);

			userDAO.createUser(user);

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	@PUT
	public void changePassword(String json) {

		JSONObject jsonObj;
		try {
			jsonObj = new JSONObject(json);
			String userName = jsonObj.getString("userName");
			String oldPassword = jsonObj.getString("oldPassword");
			String newPassword = jsonObj.getString("newPassword");
			int userTypeId = jsonObj.getInt("userTypeId");

			userDAO.updatePassword(userName, oldPassword, newPassword, userTypeId);

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@DELETE
	@Path("/{userName}")
	public void deleteUser(@PathParam("userName") String userName) {
		userDAO.deleteUser(userName);
	}

	@POST
	@Path("/login")
	@Produces(MediaType.APPLICATION_JSON)
	public User loginCheck(String json) {

		JSONObject jsonObj;
		try {
			jsonObj = new JSONObject(json);
			String userName = jsonObj.getString("userName");
			String password = jsonObj.getString("password");
			int userTypeId = jsonObj.getInt("userTypeId");
			return userDAO.loginCheck(userName, password, userTypeId);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

}
