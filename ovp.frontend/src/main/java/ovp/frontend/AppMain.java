package ovp.frontend;

public class AppMain {
/*
	public static void main(String[] args) {
		AppMain.getUsers();
	}
	
	public static void getUserTypes() {
		try {
			Client client = Client.create();
			WebResource webResource = client.resource("http://localhost:8080/ovp.backend-0.0.1-SNAPSHOT/rest/users/types");
			ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
			
			if(response.getStatus() != 200) {
				throw new RuntimeException("Failed due to next error: " + response.getStatus());
			} else {
				System.out.println("Getting user types");
				String output = response.getEntity(String.class);
				System.out.println(output);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void getUsers() {
		try {	
			Client client = Client.create();
			WebResource webResource = client.resource("http://localhost:8080/ovp.backend-0.0.1-SNAPSHOT/rest/users/");
			ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
			
			if(response.getStatus() != 200) {
				throw new RuntimeException("Failed: Http error code : " + response.getStatus());
			} else {
				String output = response.getEntity(String.class);
				
				System.out.println("Getting users...");
				System.out.println(output);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void getUser(String userName) {
		try {	
			Client client = Client.create();
			WebResource webResource = client.resource("http://localhost:8080/ovp.backend-0.0.1-SNAPSHOT/rest/users/" + userName);
			ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
			
			if(response.getStatus() != 200) {
				throw new RuntimeException("Failed: Http error code : " + response.getStatus());
			} else {
				String output = response.getEntity(String.class);
				
				System.out.println("Getting user...");
				System.out.println(output);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void createUser (String userName, String email, String password, int userTypeId) {
		try {
			Client client = Client.create();
			WebResource webResource = client.resource("http://localhost:8080/ovp.backend-0.0.1-SNAPSHOT/rest/users/");
			
			String input = "{"
					+ "email" + ":" + email + ","
					+ "userName" + ":" + userName + ","
					+ "password" + ":" + password + ","
					+ "userTypeId" + ":"  + userTypeId
					+ "}";
			
			ClientResponse response = webResource.type("applicatio/json").post(ClientResponse.class, input);
			
			if(response.getStatus() != 204) {
				throw new RuntimeException("Failed: HTTP error code: " + response.getStatus());
			} else {
				System.out.println("User was inserted to database...");
				String output = response.getEntity(String.class);
				System.out.println(output);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void changePassword(String userName, String oldPassword, String newPassword, int userTypeId) {
		try {
			Client client = Client.create();
			WebResource webResource = client.resource("http://localhost:8080/ovp.backend-0.0.1-SNAPSHOT/rest/users/");
			
			String input = "{"
					+ "userName" + ":" + userName + ","
					+ "oldPassword" + ":" + oldPassword + ","
					+ "newPassword" + ":" + newPassword + ","
					+ "userTypeId" + ":"  + userTypeId
					+ "}";
			
			ClientResponse response = webResource.type("applicatio/json").put(ClientResponse.class, input);
			
			if(response.getStatus() != 204) {
				throw new RuntimeException("Failed: HTTP error code: " + response.getStatus());
			} else {
				System.out.println("User was succesfully updated...");
				String output = response.getEntity(String.class);		
				System.out.println(output);					
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void deleteUser(String userName) {
		try {
			Client client = Client.create();
			WebResource webResource = client.resource("http://localhost:8080/ovp.backend-0.0.1-SNAPSHOT/rest/users/" + userName);
			
			ClientResponse response = webResource.type("application/json").delete(ClientResponse.class);
			
			if(response.getStatus() != 204) {
				throw new RuntimeException("Failed: HTTP error code: " + response.getStatus());
			} else {
				System.out.println("User was successfully deleted from database...");
				String output = response.getEntity(String.class);
				System.out.println(output);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
*/
}
