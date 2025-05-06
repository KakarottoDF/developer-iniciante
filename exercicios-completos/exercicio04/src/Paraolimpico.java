public class Paraolimpico extends Atleta{
    private String nomeResponsavel;

    public Paraolimpico(String nome, char sexo, int idade, int numero, String nomeResponsavel) {
        super(nome, sexo, idade, numero);
        setNomeResponsavel(nomeResponsavel);
    }

    public String getNomeResponsavel() {
        return this.nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    @Override
    public String toString() {
        return "Paraolimpico{" +
                "nomeResponsavel='" + getNomeResponsavel();
    }
}
