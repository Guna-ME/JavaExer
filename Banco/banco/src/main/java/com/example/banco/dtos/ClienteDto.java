package com.example.banco.dtos;

import jakarta.validation.constraints.NotBlank;

public record ClienteDto(
    @jakarta.validation.constraints.NotBlank(message = "O nome do cliente não pode estar em branco")
    String nome,
    @NotBlank(message = "O saldo do cliente não pode estar em branco")
    String saldo,
    @NotBlank(message = "A senha do cliente não pode estar em branco")
    String senha
) {

}
