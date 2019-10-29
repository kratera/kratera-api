package io.kratera.userservice.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "kratera_user", schema = "user_service")
public class KrateraUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "kratera_id", nullable = false)
	private Long id;
	
	@Column(name = "email", length = 200, nullable = false, unique = true)
	private String email;
	
	@Column(name = "first_name", length = 100, nullable = false)
	private String firstName;
	
	@Column(name = "last_name", length = 100, nullable = true)
	private String lastName;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "role", length = 20, nullable = false)
	private UserRole role;
	
	@Column(name = "verified", nullable = false)
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean verified;
	
	@Column(name = "organizer", nullable = true)
	private Organizer organizer;
	
	public KrateraUser(){
		role = UserRole.NONE;
	}
	
}
