import java.util.Observable;
import java.util.Observer;

public class Morador extends Pessoa implements Observer {
    private Regiao regiao;

    public Morador(String nome, Endereco endereco, String telefone, Regiao regiao) {
        super(nome, endereco, telefone);
        setRegiao(regiao);
    }

    public Regiao getRegiao() {
        return this.regiao;
    }

    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }

    @Override
    public boolean equals(Object obj) {
        Morador morador = (Morador) obj;
        return getNome().equals(morador.getNome());
    }

    @Override
    public void update(Observable o, Object arg) {

    }

    @Override
    public String toString() {
        return "Morador{" +
                super.toString() +
                "regiao=" + getRegiao() +
                '}';
    }
}
