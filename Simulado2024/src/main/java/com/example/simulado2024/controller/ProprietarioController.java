package com.example.simulado2024.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ProprietarioController {


    @GetMapping("buscar")
public List<Jogador> buscarJogador() {
    return jogadorService.buscarJogador();
}

    @PostMapping("cadastrar")
    public Jogador cadrastarJogador(@RequestBody Jogador jogador) {
        return jogadorService.cadastraJogador(jogador);
    }

    @PutMapping("atualizar")
    public String atualiazarJogador(@RequestBody Jogador jogador) {
        jogadorService.atualizarJogador(jogador);
        return "Jogador atualizado com sucesso";
    }

    @DeleteMapping("deletar/{id}")
    public String deletarJogador(@PathVariable Long id) {
        jogadorService.delete(id);
        return "Jogador deletado com sucesso";
    }
}
