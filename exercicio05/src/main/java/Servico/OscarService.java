package Servico;
import Classes.Ator;
import Classes.Filme;
import Classes.Indicacao;
import Classes.Indicavel;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Service
public class OscarService {
    private ArrayList<Indicacao> listaDeIndicados;

    public OscarService() {
        this.listaDeIndicados = new ArrayList<>();
    }

    public void criarIndicavel(Indicavel indicavel, String categoria) {
        if (indicavel.getElegivel()) {
            indicavel.incrementarIndicacoes();
            Indicacao novaIndicacao = new Indicacao(indicavel, categoria);
            listaDeIndicados.add(novaIndicacao);
            System.out.println("Indicação adicionada: " + novaIndicacao);
        } else {
            System.out.println("Este indicável não é elegível.");
        }
    }

    public ArrayList<Indicacao> getIndicados() {
        return listaDeIndicados;
    }

    public void imprimirIndicados() {
        System.out.println("Lista de Indicados:");
        for (Indicacao indicacao : listaDeIndicados) {
            System.out.println(indicacao.toString());
        }

    }
}