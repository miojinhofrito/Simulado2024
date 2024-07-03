package com.example.simulado2024.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Propietario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
@Size(min = 5, max = 100, message = "O nome deve conter entre 5 a 100 caracteres")
    private String nome;

    private String cpf;

    @Email(message = "Este email tem que ser valido")
    private String email;

    private  String telefone;

    private String endereco;

@Past(message = "Tem quer uma data passada")
    private LocalDate dataNascimento;

    private LocalDate dataCadastro;

    @OneToMany(mappedBy = "propietarios")
    private List<Imovel> imoveis;






}
