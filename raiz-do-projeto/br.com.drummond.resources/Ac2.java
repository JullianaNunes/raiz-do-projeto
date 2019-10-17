package br.com.drummond;

import java.text.*;
import java.util.*;
import org.springframework.*;

import com.example.demo.ResquestMethod;

import org.springframeword.web.bind.annotation.ResquestMapping;

	@RestController
	public class Ac2 {
	 
		@ResquestMapping(value= "/api8/{valor}", method = ResquestMethod.GET) 
			public String multiplo(@PathVariable Integer valor) {
		
			for(valor=0; valor <=100; valor++) { 
				if(valor % 8 == 0)
					multiplo = "sim";
					return multiplo;
			} else {
				multiplo = "não";
				return multiplo;
			}
		
		}
}
