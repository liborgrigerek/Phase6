package cz.morosystems.phase6.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "BOOKTABLE")
public class BookEntity {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="USERID")
	private Integer userId;

	@Pattern(regexp = "[a-zA-Z0-9 ]+", message = "Title can not be empty and can have alphanumerical characters only.")
	@Column(name = "TITLE")
	private String title;

	@Pattern(regexp = "[a-zA-Z0-9 ]+", message = "Description can not be empty and can have alphanumerical characters only.")
	@Column(name = "DESCRIPTION")
	private String description;

	@ManyToMany(cascade = { CascadeType.ALL }, mappedBy = "books", targetEntity = UserEntity.class)
	private Set<UserEntity> users;

	public Integer getId() {
		return id;
	}

	public Integer getUserId() {
		return userId;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public Set<UserEntity> getUsers() {
		return users;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setUsers(Set<UserEntity> users) {
		this.users = users;
	}
}
