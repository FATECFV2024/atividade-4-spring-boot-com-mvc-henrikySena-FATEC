package com.atividade.atividade.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.atividade.atividade.entities.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository <Aluno,Long>{
    
}
