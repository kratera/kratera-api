package io.kratera.userservice.domain.entity;

import lombok.Data;

@Data
public class BankAccount {
	
	private Long id;
	private String name;
	private Long agency;
	private Long account;
	private Integer digit;
	private TypeBankAccount typeAccount;
	
}
