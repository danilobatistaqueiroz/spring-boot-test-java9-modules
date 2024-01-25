package com.sample.printer;

import org.springframework.stereotype.Service;

@Service
public class Printer {

	public String output(String text) {
		System.out.println(text);
		return " #### out " + text + " out #### ";
	}

}
