package com.mapeamento.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.mapeamento.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
	//Query Methods
	List<Aluno> findByCidade(String cidade);
	//List<Aluno> findByNome(String nome);	
	List<Aluno> findByNomeAndRenda(String nome, Double renda);
	List<Aluno> findByCidadeAndRenda(String cidade, Double renda);
	Aluno findByRa(String ra);
	List<Aluno> findByRenda(Double renda);

	// @querys

	//Buscar todos os alunos com nome "xxxx":
	@Query("SELECT a FROM Aluno a WHERE a.nome = :nome")
	List<Aluno> findByNome(@Param("nome") String nome);

	//Buscar Nome completo
	@Query("SELECT a FROM Aluno a WHERE a.nomeCompleto LIKE :nomeCompleto")
	List<Aluno> findByNomeLike(@Param("nomeCompleto") String nomeCompleto);

	//Buscar todos os alunos de uma determinada turma:
	@Query("SELECT a FROM Aluno a JOIN a.turma t WHERE t.id = :turmaId")
	List<Aluno> findByTurmaId(@Param("turmaId") Long turmaId);






}



