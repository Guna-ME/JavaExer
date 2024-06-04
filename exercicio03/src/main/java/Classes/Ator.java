package Classes;
import org.springframework.stereotype.Component;

@Component
public class Ator implements Indicavel {
    public Ator(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    private String nome;
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    private String nacionalidade;

    Boolean elegivel = true;
    Short numeroDeIndicacoes = 0;

    public boolean isElegivel() {
        return elegivel;
    }
    @Override
    public boolean getElegivel() {
        return elegivel;
    }
    @Override
    public void setElegivel(boolean elegivel) {
        this.elegivel = elegivel;
    }

    @Override
    public short getNumeroDeIndicacoes() {
        return numeroDeIndicacoes;
    }

    @Override
    public void incrementarIndicacoes() {
        this.numeroDeIndicacoes++;
    }
}