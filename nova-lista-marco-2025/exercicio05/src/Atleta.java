public class Atleta{
    private int inscricao;
    private String nome;
    private double tempoDeProva;
    private int idade;
    private GerenciarAtleta gerenciador;

    public Atleta(GerenciarAtleta gerenciador) {
        this.gerenciador = gerenciador;
    }

    public Atleta() {
    }

    public boolean isElite(){
        return tempoDeProva < 5;
    }

    public int getInscricao(){
        return inscricao;
    }

    public void setInscricao(int inscricao){
        if (gerenciador != null && gerenciador.validarNumeroDeIncricao(inscricao)) {
            System.out.println("Número de inscrição já cadastrado!");
        } else {
            this.inscricao = inscricao;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTempoDeProva() {
        return tempoDeProva;
    }

    public void setTempoDeProva(double tempoDeProva) {
        this.tempoDeProva = tempoDeProva;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Atleta Ironman 70.3" +
                "\nInscrição: " + getInscricao() +
                "\nNome: '" + getNome() + '\'' +
                "\nTempo de Prova: " + getTempoDeProva() +
                "\nIdade: " + getIdade();
    }
}
