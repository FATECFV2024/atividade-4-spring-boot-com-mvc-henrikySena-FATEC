package com.atividade.atividade.services;

import com.atividade.atividade.dtos.EnderecoDTO;
import com.atividade.atividade.entities.Endereco;
import com.atividade.atividade.exceptions.DBException;
import com.atividade.atividade.exceptions.ResourceNotFoundException;
import com.atividade.atividade.repositories.EnderecoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository repository;

    @Transactional(readOnly = true)
    public EnderecoDTO findById(Long id) {
        Endereco endereco = repository.findById(id).get();
        return new EnderecoDTO(endereco);
    }

    @Transactional
    public EnderecoDTO insert(EnderecoDTO dto) {
        Endereco entity = new Endereco();
        entity.setRua(dto.getRua());
        entity.setNumero(dto.getNumero());
        entity.setCidade(dto.getCidade());
        entity.setEstado(dto.getEstado());
        entity.setCep(dto.getCep());
        entity = repository.save(entity);
        return new EnderecoDTO(entity);
    }


        @Transactional
    public EnderecoDTO update(Long id, EnderecoDTO dto) {
        try {
            Endereco entity = repository.getReferenceById(id);
            entity.setRua(dto.getRua());
            entity.setNumero(dto.getNumero());
            entity.setCidade(dto.getCidade());
            entity.setEstado(dto.getEstado());
            entity.setCep(dto.getCep());
            return new EnderecoDTO(entity);
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