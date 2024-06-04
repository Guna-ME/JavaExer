package com.example.banco.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public record TransacaoDto(
    @NotBlank(message = "O nome do pagador não pode estar em branco")
    String recebedor,
    @NotNull(message = "A quantidade de dinheiro a ser debitada não pode ser nula")
    @Positive(message = "A quantidade de dinheiro a ser debitada deve ser positiva ou zero")
    String pagador,
    @NotNull(message = "A quantidade de dinheiro a ser creditada não pode ser nula")
    @PositiveOrZero(message = "A quantidade de dinheiro a ser creditada deve ser positiva ou zero")
    Double quantidade
) {

}
