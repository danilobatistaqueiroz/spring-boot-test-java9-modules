package br.labs.flop;

import org.springframework.stereotype.Service;

@Service
public class Flopper {

	public String flopping(String text) {
		System.out.println(text);
		return " #### out " + text + " out #### ";
	}

}
