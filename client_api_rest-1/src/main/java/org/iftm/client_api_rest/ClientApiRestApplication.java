package org.iftm.client_api_rest;

import java.time.LocalDate;

import org.iftm.client_api_rest.entities.Usuario;
import org.iftm.client_api_rest.repositories.Usuariorepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApiRestApplication implements CommandLineRunner{
	@Autowired
	private Usuariorepo usuario;

	public static void main(String[] args) {
		SpringApplication.run(ClientApiRestApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

		// Criando um novo cliente usando o construtor
		Usuario usuario1 = new Usuario(1L, "01122333497", "Joao Marcelo", "joao-marcelo@gmail.com", LocalDate.of(1990, 1, 15), "123456789");
		Usuario usuario2 = new Usuario(2L, "02233444558", "Maria Clara", "maria-clara@gmail.com", LocalDate.of(1985, 6, 25), "987654321");
	    usuario.save(usuario1);
    	usuario.save(usuario2);
		System.out.println("\nUsuário : " + usuario.findById(1L).get().getNome());
		System.out.println();
        
    }

}
