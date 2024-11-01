package org.iftm.client_api_rest;

import java.time.LocalDate;

import org.iftm.client_api_rest.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApiRestApplication implements CommandLineRunner{
	@Autowired
	private Usuario Usuario;
	public static void main(String[] args) {
		SpringApplication.run(ClientApiRestApplication.class, args);
	}

    public ClientApiRestApplication() {
    }

    @Override
    public void run(String... args) throws Exception {

		// Criando um novo cliente usando o construtor
		Usuario usuario1 = new Usuario(1L, "01122333497", "Joao Marcelo", "joao-marcelo@gmail.com", LocalDate.of(1990, 1, 15), "123456789");
		Usuario usuario2 = new Usuario(2L, "02233444558", "Maria Clara", "maria-clara@gmail.com", LocalDate.of(1985, 6, 25), "987654321");
	    Usuario.save(usuario1);
    	Usuario.save(usuario2);
		System.out.println("\nUsuário : " + Usuario.findByid(1L).get().getName());
		System.out.println();
        
    }

}
