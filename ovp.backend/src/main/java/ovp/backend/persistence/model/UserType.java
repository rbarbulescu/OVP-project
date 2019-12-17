package ovp.backend.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="user_type")
public class UserType {
	
	@Id
	@Column(name="Id")
	private int id;
	
	@Column(name="userType")
	private String userType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "UserType [id=" + id + ", userType=" + userType + "]";
	}

}
