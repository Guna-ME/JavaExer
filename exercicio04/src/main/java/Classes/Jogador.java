package Classes;

import Service.MensagemService;

public class Jogador {

    private String nome;
    private String sobrenome;
    private int idade;
    private String posicao;
    private String clube;

    public String getNome() throws Exception {
        String listaDeNomes = MensagemService.retornaListaDaURI("https://venson.net.br/resources/data/nomes.txt");
        return MensagemService.retornaIndiceAleatorio(listaDeNomes);
    }

    public String getSobrenome() throws Exception {
        String listaDeSobrenome = MensagemService.retornaListaDaURI("https://venson.net.br/resources/data/sobrenomes.txt");
        return MensagemService.retornaIndiceAleatorio(listaDeSobrenome);
    }

    public int getIdade() {
        return MensagemService.geraNumeroAleatorio(17, 40);
    }

    public String getPosicao() throws Exception {
        String listaDePosicoes = MensagemService.retornaListaDaURI("https://venson.net.br/resources/data/posicoes.txt");
        return MensagemService.retornaIndiceAleatorio(listaDePosicoes);
    }

    public String getClube() throws Exception {
        String listaDeClubes = MensagemService.retornaListaDaURI("https://venson.net.br/resources/data/clubes.txt");
        return MensagemService.retornaIndiceAleatorio(listaDeClubes);
    }

    public String gerarMensagem() {
        try {
            nome = getNome();
            sobrenome = getSobrenome();
            idade = getIdade();
            posicao = getPosicao();
            clube = getClube();
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao gerar mensagem";
        }
        return nome + " " + sobrenome + " é um futebolista brasileiro de " + idade + " anos que atua como " + posicao + " e atualmente defende o " + clube + ".";
    }

}
