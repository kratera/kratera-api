package io.kratera.userservice.domain.entity;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "kratera_user")
public class KrateraUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "kratera_id", nullable = false)
	private long id;
	
	@Column(name = "kratera_user", nullable = false)
	private String username;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name", nullable = true)
	private String lastName;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	@Enumerated(EnumType.STRING)
	@ElementCollection(fetch = FetchType.EAGER, targetClass = KrateraRole.class)
	@CollectionTable(name = "kratera_role", joinColumns = @JoinColumn(name = "kratera_id"))
	@Column(name = "role", length = 25, nullable = false)
	private Set<KrateraRole> roles;
	
	@Column(name = "verified", nullable = false, columnDefinition = "tinyint(1) default 0")
	private boolean verified;
	
	public KrateraUser(){
		roles = new HashSet<KrateraRole>(Arrays.asList(KrateraRole.USER));
	}
	
}
