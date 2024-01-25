package com.example.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.ComponentScan;

import com.web.controllers.*;
import org.springframework.ui.Model;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;


@ComponentScan({
  "nerdstore.web.mvc.controllers",
  "nerdstore.web.mvc.setup",
  "nerdstore.web"
})
@SpringBootTest(classes=CarrinhoController.class)
class CarrinhoTests {
  @Test
  void carrinho_iniciar_pedido(){
      
  }

	@Autowired
	private CarrinhoController controller;

	@Test
	void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

  @Test
  void atualizarItem() {
      ResponseEntity retorno = controller.atualizarItem("aa", 1, null);
      HttpHeaders headers = new HttpHeaders();
      ResponseEntity e = new ResponseEntity<String>(headers,HttpStatus.OK);
      assertEquals(e.ok("index"),retorno);
  }

}