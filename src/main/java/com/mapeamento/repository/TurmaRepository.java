package com.mapeamento.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapeamento.entities.Turma;

public interface TurmaRepository extends JpaRepository<Turma, Long> {
	//List<Turma> findByNomeAndRenda(String nome, String descricao);

}
