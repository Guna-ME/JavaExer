package Classes;
import org.springframework.stereotype.Component;

@Component
public class Filme implements Indicavel {
    public Filme(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    private String nome;
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    private String genero;

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