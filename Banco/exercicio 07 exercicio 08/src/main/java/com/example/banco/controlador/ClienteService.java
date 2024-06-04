package com.example.banco.controlador;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.banco.classes.Cliente;

@Service
public class ClienteService {
      private final Map<String, Cliente> clientes;

    public ClienteService() {
        this.clientes = new HashMap<>();
        
        Cliente cliente1 = new Cliente("Maduzete", "10000.00", "senha123");
        Cliente cliente2 = new Cliente("Gaaybriel", "50.00", "senha456");
        clientes.put(cliente1.getNome(), cliente1);
        clientes.put(cliente2.getNome(), cliente2);
    }

    public Cliente getClientePorNome(String nome) {
        return clientes.get(nome);
    }

}
