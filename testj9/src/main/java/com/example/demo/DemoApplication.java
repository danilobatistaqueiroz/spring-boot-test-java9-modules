package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import com.sample.printer.Printer;
import br.labs.flop.Flopper;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan({
  "com.sample.printer", "br.labs.flop"
})
@SpringBootApplication
public class DemoApplication {

	@Autowired
	Printer printer;

	@Autowired
	Flopper flopper;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public void imprimir(String x){
		System.out.println(x);
	}

	public String out(String texto) {
		return printer.output(texto);
	}

	public String flopping(String texto) {
		return flopper.flopping(texto);
	}
}
