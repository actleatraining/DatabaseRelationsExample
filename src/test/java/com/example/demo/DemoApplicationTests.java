package com.example.demo;

import com.example.demo.entity.BankAccount;
import com.example.demo.entity.UserEntity;
import com.example.demo.repository.BankAccountRepository;
import com.example.demo.repository.UserRepository;
import org.apache.catalina.User;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	BankAccountRepository bankAccountRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void init() {
		// Creating one user with one account
		UserEntity user = new UserEntity();
		user.setName("Andreas");
		userRepository.save(user);

		BankAccount bankAccount = new BankAccount();
		bankAccount.setBalance(125450.0);
		bankAccount.setUser(user);

		bankAccountRepository.save(bankAccount);

		// Creating another user with two accounts
		UserEntity user2 = new UserEntity();
		user.setName("Andreas2");
		userRepository.save(user);

		BankAccount bankAccount2 = new BankAccount();
		bankAccount2.setBalance(50.0);
		bankAccount2.setUser(user);

		bankAccountRepository.save(bankAccount2);

		BankAccount bankAccount3 = new BankAccount();
		bankAccount3.setBalance(5080.0);
		bankAccount3.setUser(user);

		bankAccountRepository.save(bankAccount3);
	}


}
