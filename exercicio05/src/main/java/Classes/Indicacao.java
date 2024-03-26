package Classes;
import org.springframework.stereotype.Component;

@Component
public class Indicacao {
    public Indicacao(Indicavel indicavel, String categoria) {
        this.indicavel = indicavel;
        this.categoria = categoria;
    }

    public Indicavel getIndicavel() {
        return indicavel;
    }
    public void setIndicavel(Indicavel indicavel) {
        this.indicavel = indicavel;
    }
    private Indicavel indicavel;
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    private String categoria;
}