package com.example.supercrud;

import com.example.supercrud.controller.EmpolyeeController;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SuperCrudApplicationTests {

	@Test
	void contextLoads() {
		ApplicationContext context = new AnnotationConfigApplicationContext();
		EmpolyeeController ec = context.getBean(EmpolyeeController.class);
		assertNotNull(ec);
	}

}
