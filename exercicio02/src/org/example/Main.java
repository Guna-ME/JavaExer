
package org.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Main {

    public static void main(String[] args) throws Exception {

        String nome = getNome();
        String sobrenome = getSobrenome();
        String posicao = getPosicao();
        int idade = getIdade();
        String clube = getClube();
        String descricao = getDescricao(nome, sobrenome, posicao, idade, clube);

        System.out.println(descricao);
    }

    public static String getNome() throws Exception {
        String listaDeNomes = retornaListaDaURI("https://venson.net.br/resources/data/nomes.txt");
        String nome = retornaIndiceAleatorio(listaDeNomes);
        return nome;
    }

    public static String getSobrenome() throws Exception {
        String listaDeSobrenome = retornaListaDaURI("https://venson.net.br/resources/data/sobrenomes.txt");
        String sobrenome = retornaIndiceAleatorio(listaDeSobrenome);
        return sobrenome;
    }

    public static String getPosicao() throws Exception {
        String listaDePosicoes = retornaListaDaURI("https://venson.net.br/resources/data/posicoes.txt");
        String posicao = retornaIndiceAleatorio(listaDePosicoes);
        return posicao;
    }

    public static int getIdade() {
        return geraNumeroAleatorio(17, 40);
    }

    public static String getClube() throws Exception {
        String listaDeClubes = retornaListaDaURI("https://venson.net.br/resources/data/clubes.txt");
        String clube = retornaIndiceAleatorio(listaDeClubes);
        return clube;
    }

    public static String getDescricao(String nome, String sobrenome, String posicao, int idade, String clube) {
        return nome + " " + sobrenome + " é um futebolista brasileiro de " + idade + " anos que atua como " + posicao + " e atualmente defende o " + clube + ".";
    }

    public static int geraNumeroAleatorio(int menor, int maior) {
        int diferenca = maior - menor;
        int aleatorio = (int) Math.floor(Math.random() * diferenca);
        int numero = aleatorio + menor + 1;
        return numero;
    }

    public static String retornaListaDaURI(String minhaUri) throws Exception{
        // Puxando o arquivo de texto usando HTTP
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(minhaUri)).build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String lista = response.body();
        return lista;
    }

    public static String retornaIndiceAleatorio(String stringao) {
        // Quebrando o texto em varias strings (colocando dentro de um vetor)
        String[] listaDeNomes = stringao.split("\n");
            /* gera um numero aleatorio entre 0 e o tamanho do meu vetor - 1 */
        int indiceAleatorio = (int) Math.floor(Math.random() * listaDeNomes.length);
        return listaDeNomes[indiceAleatorio];
    }
}
