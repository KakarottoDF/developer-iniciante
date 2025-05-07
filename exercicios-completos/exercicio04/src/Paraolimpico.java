public class Paraolimpico extends Atleta {
    private String nomeResponsavel;

    public Paraolimpico(String nome, char sexo, int idade, int numero, String nomeResponsavel) {
        setNome(nome);
        setSexo(sexo);
        setIdade(idade);
        setNumero(numero);
        setNomeResponsavel(nomeResponsavel);
    }

    public String getNomeResponsavel() {
        return this.nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    @Override
    public double calcularCusto() {
        double custoBase = getNumero();
        if ("HENRIQUE SIQUEIRA".equals(getNomeResponsavel())) {
            custoBase *= 0.9;
        }
        return custoBase;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNome do Responsável: " + getNomeResponsavel();
    }
}
