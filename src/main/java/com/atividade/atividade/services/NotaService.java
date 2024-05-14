package com.atividade.atividade.services;

import com.atividade.atividade.dtos.NotaDTO;
import com.atividade.atividade.entities.Nota;
import com.atividade.atividade.exceptions.DBException;
import com.atividade.atividade.exceptions.ResourceNotFoundException;
import com.atividade.atividade.repositories.NotaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NotaService {
    @Autowired
    private NotaRepository repository;

    @Transactional(readOnly = true)
    public NotaDTO findById(Long id) {
        Nota nota = repository.findById(id).get();
        return new NotaDTO(nota);
    }

    @Transactional
    public NotaDTO insert(NotaDTO dto) {
        Nota entity = new Nota();
        entity.setNomeDisciplina(dto.getNomeDisciplina());
        entity.setNota(dto.getNota());
        entity = repository.save(entity);
        return new NotaDTO(entity);
    }


        @Transactional
    public NotaDTO update(Long id, NotaDTO dto) {
        try {
            Nota entity = repository.getReferenceById(id);
        entity.setNomeDisciplina(dto.getNomeDisciplina());
        entity.setNota(dto.getNota());
            return new NotaDTO(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException("Id não encontrado: " + id);
        }
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Id não encontrado: " + id);
        }
        try {
            repository.deleteById(id);
        }
        catch (DataIntegrityViolationException e) {
            throw new DBException("Violação de integridade referencial");
        }
    }
}