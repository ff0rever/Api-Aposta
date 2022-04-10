package com.fforever.Aposta.service;


import com.fforever.Aposta.model.Apostador;
import com.fforever.Aposta.model.dto.ApostadorIn;
import com.fforever.Aposta.repository.ApostadorRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ApostadorService {

    private final ApostadorRepository apostadorRepository;
    private final ModelMapper modelMapper;

    public void salvaApostador(ApostadorIn apostadorIn){
        Apostador apostador = modelMapper.map(apostadorIn, Apostador.class);
        apostadorRepository.save(apostador);
    }
}
