package br.com.alura.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("/")
	@ResponseBody // anotação q assume a responsabilidade de devolver a string de return direto na
					// pagina a nao procurar jsp
	public String hello() {
		return "Hello Wolrd!";
	}

}
