package ovp.common.resources.dto;

public class FullUserDTO {
	
	private String email;
	private String userName;
	private String password;
	private int userTypeId;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUserTypeId() {
		return userTypeId;
	}
	public void setUserTypeId(int userTypeId) {
		this.userTypeId = userTypeId;
	}
	
	@Override
	public String toString() {
		return "FullUserDTO [email=" + email + ", userName=" + userName + ", password=" + password + ", userTypeId="
				+ userTypeId + "]";
	}	
	
}
