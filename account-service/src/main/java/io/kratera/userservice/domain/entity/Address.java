package io.kratera.userservice.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "address", schema = "user_service")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private String id;
	
	@Column(name = "cep", length = 9, nullable = false)
	private String cep;
	
	@Column(name = "street", length = 200, nullable = false)
	private String street;
	
	@Column(name = "complement", length = 250, nullable = true)
	private String complement;
	
	@Column(name = "neighborhood", length = 200, nullable = false)
	private String neighborhood;
	
	@Column(name = "number", length = 10, nullable = false)
	private String number;
	
	@Column(name = "city", length = 200, nullable = false)
	private String city;
	
}
