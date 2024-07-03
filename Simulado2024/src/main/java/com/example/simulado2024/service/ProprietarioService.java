package com.example.simulado2024.service;

import com.example.simulado2024.entity.Imovel;
import com.example.simulado2024.entity.Propietario;
import com.example.simulado2024.repository.ProprietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProprietarioService {
    @Autowired
    ProprietarioRepository proprietarioRepository;

 public List<Propietario> buscarProprietario() {
     return proprietarioRepository.findAll();

 }
     public void deletarProprietario(Long id) {
         proprietarioRepository.deleteById(id);
     }

     public Propietario atualizarPropietraio(Propietario propietario) {
         return proprietarioRepository.save(propietario);

     }

     public Propietario buscarProprietario(Long id){
         return proprietarioRepository.findById(id).get();

     }
 }

