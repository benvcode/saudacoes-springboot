package com.benvcode.saudacoes.springboot.domain;

import org.springframework.stereotype.Service;

// A anotação '@Service' indica que esta classe, contém a lógica de negócios da aplicação
@Service
public class SaudacaoService {
    public String olaMundo() {
        return "Olá, Mundo!";
    }

}
