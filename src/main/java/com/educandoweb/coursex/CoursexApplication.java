package com.educandoweb.coursex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoursexApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursexApplication.class, args);
	}

}
/*
Controller → recebe requisição
Service → processa
Repository → acessa banco
Spring → cria e conecta tudo automaticamente
Resposta → JSON
*/

/*
Quando acessa /users/2, o Spring chama o UserResource.
O metodo findById é executado e recebe o ID via @PathVariable.
O controller chama o UserService.
O UserService usa o UserRepository, que foi injetado pelo Spring.
O UserRepository busca os dados no banco usando JPA/Hibernate.
O objeto User é retornado até o controller.
O Spring converte esse objeto para JSON e envia na resposta HTTP.
*/