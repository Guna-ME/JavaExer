package com.example.banco.mappers;

import org.springframework.stereotype.Component;

import com.example.banco.classes.Cliente;
import com.example.banco.dtos.ClienteDto;

@Component
public class ClienteMapper {
    public ClienteDto toDto(Cliente cliente) {
        return new ClienteDto(
            cliente.getNome(),
            cliente.getSaldo(),
            cliente.getSenha());
    }

    public Cliente toEntity(ClienteDto clienteDto) {
        return new Cliente(clienteDto.nome(), clienteDto.saldo(), clienteDto.senha());
    }

}


