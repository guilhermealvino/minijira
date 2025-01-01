package com.minijira.adapters.input.rest;


import com.minijira.commons.StatusAtividade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividades")
public class AtividadeDTO {

    private String nome;
    private String descricao;
    private StatusAtividade status;

    @PostMapping
    public ResponseEntity<String> criarAtividade() {
        return null;
    }
}
