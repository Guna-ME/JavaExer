package com.example.exercicio05;
import Classes.Ator;
import Classes.Filme;
import Classes.Indicacao;
import Servico.OscarService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class Exercicio05Application {

    public static void main(String[] args) {
        SpringApplication.run(Exercicio05Application.class, args);

        OscarService oscarService = new OscarService();

        Filme filme = new Filme("Interstellar", "Ficção Científica");
        oscarService.criarIndicavel(filme, "Melhor Filme");

        Ator ator = new Ator("Leonardo DiCaprio", "Estadunidense");
        oscarService.criarIndicavel(ator, "Melhor Ator");

        ArrayList<Indicacao> listaDeIndicados = oscarService.getIndicados();
        oscarService.imprimirIndicados();
    }
}
