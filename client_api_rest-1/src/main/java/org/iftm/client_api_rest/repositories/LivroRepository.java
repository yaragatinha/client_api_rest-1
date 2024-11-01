package org.iftm.client_api_rest.repositories;

import org.iftm.client_api_rest.entities.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
    // Métodos adicionais de consulta podem ser adicionados aqui, se necessário
}
