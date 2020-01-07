package ovp.backend.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ovp.backend.business.UserManager;
import ovp.backend.business.UserTypeManager;
import ovp.backend.persistence.model.User;
import ovp.backend.persistence.model.UserType;
import ovp.common.resources.dto.UserDTO;
import ovp.common.resources.dto.UserTypeDTO;

@Path("/users")
public class UserController {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dto.xml");
	
	UserManager userManager = context.getBean(UserManager.class);
	UserTypeManager userTypeManager = context.getBean(UserTypeManager.class);
	
	@GET
	@Path("/types")
	@Produces(MediaType.APPLICATION_JSON)
	public List<UserTypeDTO> getTypes() {
		return userTypeManager.displayUserTypes();
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

			userTypeManager.createUserType(type);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<UserDTO> getUsers() {
		return userManager.displayUsers();
	}

	@GET
	@Path("/{userName}")
	@Produces(MediaType.APPLICATION_JSON)
	public UserDTO findUser(@PathParam("userName") String userName) {
		return userManager.findUserByUserName(userName);
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

			userManager.createUser(user);

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	@POST
	@Path("/edit")
	public void changePassword(String json) {

		JSONObject jsonObj;
		try {
			jsonObj = new JSONObject(json);
			String userName = jsonObj.getString("userName");
			String oldPassword = jsonObj.getString("oldPassword");
			String newPassword = jsonObj.getString("newPassword");

			userManager.updatePassword(userName, oldPassword, newPassword);

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@GET
	@Path("/delete/{userName}")
	public void deleteUser(@PathParam("userName") String userName) {
		userManager.deleteUser(userName);
	}

	@POST
	@Path("/login")
	@Produces(MediaType.APPLICATION_JSON)
	public UserDTO loginCheck(String json) {

		JSONObject jsonObj;
		try {
			jsonObj = new JSONObject(json);
			String userName = jsonObj.getString("userName");
			String password = jsonObj.getString("password");
		
			return userManager.loginCheck(userName, password);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

}
