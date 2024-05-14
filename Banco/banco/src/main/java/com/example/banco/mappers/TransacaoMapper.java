package com.example.banco.mappers;

import org.springframework.stereotype.Component;

import com.example.banco.classes.Transacao;
import com.example.banco.dtos.TransacaoDto;

@Component
public class TransacaoMapper {
      public TransacaoDto toDto(Transacao transacao) {
        return new TransacaoDto(
            transacao.getRecebedor(),
            transacao.getPagador(),
            transacao.getQuantidade());
    }

    public Transacao toEntity(TransacaoDto transacaoDto) {
        return new Transacao(transacaoDto.recebedor(), transacaoDto.pagador(), transacaoDto.quantidade());
    }
}
