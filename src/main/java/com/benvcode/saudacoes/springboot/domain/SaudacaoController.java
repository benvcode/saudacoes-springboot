package com.benvcode.saudacoes.springboot.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// A anotação '@RestController' indica que esta classe é um 'Controlador Rest' (que contém métodos responsáveis
// por lidar com 'requisições' e 'respostas' HTTP).
// '@RequiredArgsConstructor' do Lombok: Permite realizar 'injecção de dependência por constructor'
// seguindo o princípio de 'IoC'.
@RestController
@RequiredArgsConstructor
@RequestMapping("saudacao") // Define 'saudacao' como 'URL base' para todos os métodos dentro deste controlador.
public class SaudacaoController {

    // Injecção de dependência por constructor
    private final SaudacaoService saudacaoService;

    // 'olaMundo()', este método está mapeado (associado) ao endpoint(URL) '/ola-mundo'
    // '@GetMapping' indica que o método lida com requisições do tipo 'HTTP GET'
    @GetMapping("/ola-mundo")
    public String olaMundo() {
        return saudacaoService.olaMundo();
    }

    // Outros métodos...

}
