package ovp.frontend;

import java.util.List;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import ovp.common.resources.dto.UserDTO;

public class AppMain {
	
	private static final String GET_USERS_ENDPOINT_URL = "http://localhost:8080/ovp.backend-0.0.1-SNAPSHOT/rest/users/";
//	private static final String GET_USER_ENDPOINT_URL = "http://localhost:8080/ovp.backend-0.0.1-SNAPSHOT/rest/users/{userName}";
	private static final String LOGIN_ENDPOINT_URL = "http://localhost:8080/ovp.backend-0.0.1-SNAPSHOT/rest/users/login";
	private static final String CREATE_USER_ENDPOINT_URL = "http://localhost:8080/ovp.backend-0.0.1-SNAPSHOT/rest/users/";
	
	@SuppressWarnings("unchecked")
	public static List<UserDTO> getUsers() {
		
		List<UserDTO> users = null;
		
		try {	
			
			Client client = Client.create();
			WebResource webResource = client.resource(GET_USERS_ENDPOINT_URL);
			ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
			
			if(response.getStatus() != 200) {
				throw new RuntimeException("Failed: Http error code : " + response.getStatus());
			} else {
				String jsonString = response.getEntity(String.class);
				Gson gson = new Gson();
				users = gson.fromJson(jsonString, List.class);

				System.out.println("Getting users...");
				System.out.println(users);
				
			}

			return users;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	public static UserDTO getUser(String userName) {
		
		UserDTO userDTO = new UserDTO();
		
		try {	
			Client client = Client.create();
			WebResource webResource = client.resource(GET_USERS_ENDPOINT_URL + userName);
			ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
			
			if(response.getStatus() != 200) {
				throw new RuntimeException("Failed: Http error code : " + response.getStatus());
			} else {
				String jsonString = response.getEntity(String.class);
				Gson gson = new Gson();
				userDTO = gson.fromJson(jsonString, UserDTO.class);
				
				System.out.println("Getting user...");
				System.out.println(jsonString);
				
			}
			
			return userDTO;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	public static UserDTO login(String userName, String password) {
		
		UserDTO user = new UserDTO();
		
		try {
			Client client = Client.create();
			WebResource webResource = client.resource(LOGIN_ENDPOINT_URL);
			
			String input = "{\"userName\":\"" + userName + "\"," + "\"password\""+":\"" +  password + "\"}";
			
			ClientResponse response = webResource.post(ClientResponse.class, input);			
			
			if (response.getStatus() != 200) {
				
				user.setUserName("UserName or password is wrong!");
				
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());

			} else {
				String jsonString = response.getEntity(String.class);
				Gson gson = new Gson();
				user = gson.fromJson(jsonString, UserDTO.class);
				
				return user;
			}			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	public static void addUser(String email, String userName, String password, int userTypeId) {
		
		try {
			Client client = Client.create();
			WebResource webResource = client.resource(CREATE_USER_ENDPOINT_URL);
			
			String input = "{\"email\":\"" + email + "\",\"userName\":\"" + userName + "\",\"password\":\"" +  password + "\",\"userTypeId\":\"" + userTypeId + "\"}";
			
			ClientResponse response = webResource.post(ClientResponse.class, input);			
			
			if (response.getStatus() != 204) {
				
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());

			} else {
				
				System.out.println("Well done!");

			}			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
}






















