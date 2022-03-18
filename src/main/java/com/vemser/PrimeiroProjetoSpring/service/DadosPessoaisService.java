package com.vemser.PrimeiroProjetoSpring.service;

import com.vemser.PrimeiroProjetoSpring.client.DadosPessoaisClient;
import com.vemser.PrimeiroProjetoSpring.controller.DadosPessoaisController;
import com.vemser.PrimeiroProjetoSpring.dto.DadosPessoaisDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DadosPessoaisService {
    
    @Autowired
    private static DadosPessoaisClient client;


    public static List<DadosPessoaisDTO> getAll() {
        return client.getAll();
    }

    public static DadosPessoaisDTO post(DadosPessoaisDTO dadosPessoaisDTO) {
        return client.post(dadosPessoaisDTO);
    }

    public static DadosPessoaisDTO put(String cpf, DadosPessoaisDTO dto) {
        return client.put(cpf, dto);
    }

    public static DadosPessoaisDTO get(String cpf) {
        return client.get(cpf);
    }

    public static void delete(String cpf) {
        client.delete(cpf);
    }
}
