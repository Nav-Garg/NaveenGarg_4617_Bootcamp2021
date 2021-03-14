package com.hibernateinheritance.inheritancemapping;

import com.hibernateinheritance.inheritancemapping.entities.Check;
import com.hibernateinheritance.inheritancemapping.entities.CreditCard;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InheritancemappingApplicationTests {

	@Autowired
	PaymentRepository repository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createPayment(){
		CreditCard cc = new CreditCard();
		cc.setId(213);
		cc.setAmount(5000);
		cc.setCardnumber("9876543210");
		repository.save(cc);
	}

	@Test
	public void createCheckPayment(){
		Check ch = new Check();
		ch.setId(214);
		ch.setAmount(6000);
		ch.setChecknumber("9876543210");
		repository.save(ch);
	}

}
