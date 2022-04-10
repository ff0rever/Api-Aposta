package com.fforever.Aposta.controller;


import com.fforever.Aposta.model.dto.ApostadorIn;
import com.fforever.Aposta.repository.ApostadorRepository;
import com.fforever.Aposta.service.ApostadorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RequiredArgsConstructor
//pra spring entender que a controller eh a camada mais externa da chamada rest
@RestController

public class apostadorController {

    private final ApostadorRepository apostadorRepository;
    private final ApostadorService apostadorService;


    //sempre que estamos recebendo algo, e gostaríamos de salvar, é sempre POST!!!
    @PostMapping("/apostador")


    //todos os status http de uma aplicacao web
    //o response entity retorna um 201 caso tudo ocorra bem   //requestbody eh qdo tem requisição
    public ResponseEntity salvarApostador(@RequestBody ApostadorIn apostadorIn){
        apostadorService.salvaApostador(apostadorIn);

        return ResponseEntity.status(CREATED).build();
    }

}
