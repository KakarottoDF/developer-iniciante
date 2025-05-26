import java.util.ArrayList;

public class GerenciarPessoas {
    ArrayList<Pessoa> listaDePessoas;

    public GerenciarPessoas(){
        this.listaDePessoas = new ArrayList<>();
    }

    public ArrayList<Pessoa> getPessoas() {
        return this.listaDePessoas;
    }

    public void adicionar(Pessoa pessoa){
        getPessoas().add(pessoa);
    }

    @Override
    public String toString() {
        return "GerenciarPessoas{" +
                "listaDePessoas=" + getPessoas() +
                '}';
    }
}
