package io.github.doflavio.controle_ponto_acesso.repository;

import io.github.doflavio.controle_ponto_acesso.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
}
