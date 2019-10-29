package io.kratera.userservice.domain.entity;

import lombok.Data;

@Data
public class CompanyAccount {
	
	private Long id;
	private String cnpj;
	private String corporateName;
	private String fantasyName;
	private String municipalRegistration;
	private Address addres;
	
}
