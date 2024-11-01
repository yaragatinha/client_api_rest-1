package org.iftm.client_api_rest.repositories;

import org.iftm.client_api_rest.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Usuariorepo extends JpaRepository<Usuario, Long> {
    // JpaRepository já oferece métodos como save(), findById(), deleteById(), etc.
}
