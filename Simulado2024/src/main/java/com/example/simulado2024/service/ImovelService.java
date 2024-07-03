package com.example.simulado2024.service;

import com.example.simulado2024.entity.Imovel;
import com.example.simulado2024.repository.ImovelRepositrory;
import com.example.simulado2024.repository.ProprietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImovelService {

   @Autowired
    ImovelRepositrory imovelRepository;

    public Imovel atualizarImovel(Imovel imovel) {
        return imovelRepository.save(imovel);

    }

    public Imovel buscarImovel(Long id){
        return imovelRepository.findById(id).get();

    }
    public void deletarImovel(Long id) {
        imovelRepository.deleteById(id);
    }
    public Imovel CadastrarImovel(Imovel imovel) {
        return imovelRepository.save(imovel);
    }
}


