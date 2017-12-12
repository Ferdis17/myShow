package edu.mum.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import net.minidev.json.annotate.JsonIgnore;

@Entity
public class User implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "user_id")
	private long UserId;
	
	@NotEmpty(message = "NotEmpty.validation")
	@Column(name = "user_name")
	private String userName;
	
	@NotEmpty(message = "NotEmpty.validation")
	@Size(min = 6, message = "{Size.user.password.validation}")
	@Column(name = "password")
	private String password;
	
	@NotEmpty(message = "{NotEmpty.validation}")
	@Column(name = "first_name")
	private String firstName;
	
	@NotEmpty(message = "{NotEmpty.validation}")
	@Column(name = "last_name")
	private String lastName;
	
	@Email(message = "{Email.User.email.validation}")
	@NotEmpty(message = "{NotEmpty.validation}")
	@Column(name = "email")
	private String email;
	
	@Column(name = "active")
	private int active;
	
	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private List<Role> roles;
	
	@JsonIgnore
	@Transient
	private MultipartFile profilePicture;

	public long getUserId() {
		return UserId;
	}

	public void setUserId(long userId) {
		UserId = userId;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	@XmlTransient
	public MultipartFile getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(MultipartFile profilePicture) {
		this.profilePicture = profilePicture;
	}
	
	

}
