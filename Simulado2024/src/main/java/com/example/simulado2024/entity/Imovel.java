package com.example.simulado2024.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.jmx.export.annotation.ManagedNotification;

import java.time.LocalDate;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Imovel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(min = 10, max = 30, message = "o seu endereco deve conter entre 10 a 30 caracteres")
    private String endereco;
    private Tipos tipos;
    @Min(value = 1, message = "No minimo tem que ser tamanho 1")
    @Max(value = 10, message = " No maximo tem que ser tamanho 10")
    private double tamanho;
    @Max(value = 10, message = " No maximo tem que ter tamanho 10")
    private int numeroQuartos;
    @Max(value = 5, message = " No maximo tem que ter tamanho 5")
    private int numeroBanheiros;
    @Max(value = 5, message = " No maximo tem que ter tamanho 5")
    private double valor;

    private LocalDate dataCadastro;
    @ManyToOne
    private  Propietario propietario;

}
