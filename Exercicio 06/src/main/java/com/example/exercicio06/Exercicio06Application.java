package com.example.exercicio06;

import Service.MensagemService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio06Application {

    public static void main(String[] args) {
        SpringApplication.run(Exercicio06Application.class, args);

        MensagemService mensagemService = new MensagemService();
        try {
            String mensagem = mensagemService.pegaMensagem();
            System.out.println(mensagem);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
