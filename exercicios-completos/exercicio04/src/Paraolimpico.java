public class Paraolimpico extends Atleta {
    private String nomeResponsavel;
    private final String TREINADOR_PADRAO = "HENRIQUE SIQUEIRA";

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

    public String getTREINADOR_PADRAO() {
        return TREINADOR_PADRAO;
    }

    @Override
    public double calcularCusto() {
        double custoBase = getNumero();
        if (getTREINADOR_PADRAO().equals(getNomeResponsavel())) {
            custoBase *= 0.10;
        }
        return custoBase;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNome do Responsável: " + getNomeResponsavel();
    }
}
