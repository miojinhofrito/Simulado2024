package com.example.simulado2024.repository;

import com.example.simulado2024.entity.Imovel;
import com.example.simulado2024.entity.Propietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProprietarioRepository extends JpaRepository<Propietario, Long> {
}
