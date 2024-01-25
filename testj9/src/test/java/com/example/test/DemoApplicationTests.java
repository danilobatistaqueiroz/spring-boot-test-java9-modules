package com.example.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.*;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest(classes=DemoApplication.class)
class DemoApplicationTests {

	@Autowired
	private DemoApplication demo;

	@Test
	void contextLoads() {
	}

	@Test
	void imprimir_no_output(){
    demo.imprimir("x");
  }
		
	@Test
	void output(){
		demo.out("abc");
	}

}
