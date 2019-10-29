package io.kratera.userservice.domain.entity;

import java.time.LocalDate;

import lombok.Data;

@Data
public class PersonalAccount {
	
	private Long id;
	private String cpf;
	private String fullName;
	private LocalDate dateOfBirth;
	private String phone;
	private Address addres;
	
}
