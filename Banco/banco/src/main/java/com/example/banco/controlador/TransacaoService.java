package com.example.banco.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.banco.classes.Transacao;
import com.example.banco.dtos.TransacaoDto;
import com.example.banco.mappers.TransacaoMapper;

@Service
public class TransacaoService {
    @Autowired
    TransacaoMapper transacaoMapper;

    public TransacaoDto getTransacao() {
        Transacao transacao = new Transacao(
            "EmpresaAi",
            "Maduzete",
            10000.00);
        return transacaoMapper.toDto(transacao);

    }


}
