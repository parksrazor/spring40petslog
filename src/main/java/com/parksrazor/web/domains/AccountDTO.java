package com.parksrazor.web.domains;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class AccountDTO {
	private int id;
	private String email, hashedPassword, salt, name, type;
	
}
