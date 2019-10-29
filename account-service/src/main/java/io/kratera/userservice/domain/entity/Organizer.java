package io.kratera.userservice.domain.entity;

import lombok.Data;

@Data
public class Organizer {
	
	private BankAccount bankAccount;
	private CompanyAccount company;
	private PersonalAccount pesonal;
	
}
