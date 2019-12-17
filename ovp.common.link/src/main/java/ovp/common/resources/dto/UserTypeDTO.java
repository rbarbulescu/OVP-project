package ovp.common.resources.dto;

import java.io.Serializable;

import javax.ws.rs.Produces;
import javax.xml.bind.annotation.XmlRootElement;

@Produces("application/json")
@XmlRootElement
public class UserTypeDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2643876572084592113L;
	
	private int userTypedId;
	private String userType;
	
	public UserTypeDTO() {
		super();
	}
	
	public UserTypeDTO(int userTypeId, String userType) {
		this.userTypedId = userTypeId;
		this.userType = userType;
	}
	
	public int getUserTypedId() {
		return userTypedId;
	}
	public void setUserTypedId(int userTypedId) {
		this.userTypedId = userTypedId;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
}