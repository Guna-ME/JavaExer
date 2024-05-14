package com.example.banco.controlador;

import org.springframework.web.bind.annotation.RestController;

import com.example.banco.classes.Cliente;
import com.example.banco.dtos.ClienteDto;
import com.example.banco.dtos.TransacaoDto;
import com.example.banco.mappers.ClienteMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class BancoControlador {

    @Autowired
    TransacaoService transacaoService;

    private final ClienteService clienteService;
    private final ClienteMapper clienteMapper;

    public BancoControlador(ClienteService clienteService, ClienteMapper clienteMapper) {
        this.clienteService = clienteService;
        this.clienteMapper = clienteMapper;
    }

    @GetMapping("/cliente/{nome}")
      public ResponseEntity<Object> getClientePorNome(@PathVariable String nome) {
        Cliente cliente = clienteService.getClientePorNome(nome);
        if (cliente != null) {
            ClienteDto clienteDto = clienteMapper.toDto(cliente);
            ClienteDto clienteDtoSemSenha = new ClienteDto(clienteDto.nome(), clienteDto.saldo(), null);
            return ResponseEntity.status(HttpStatus.OK).body(clienteDtoSemSenha);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não encontrado");
        }
    }
    
    @PostMapping("/transicao")
    public ResponseEntity<Object> getTransacao() {
        TransacaoDto transacaoDto = transacaoService.getTransacao();
        return ResponseEntity.status(HttpStatus.OK).body(transacaoDto);

    }
    
}
