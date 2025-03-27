public class Atleta{
    private int inscricao;
    private String nome;
    private double tempoDeProva;
    private int idade;

    public boolean isElite(){
        return tempoDeProva < 5;
    }

    public int getInscricao(){
        return inscricao;
    }

    public void setInscricao(int inscricao){
        this.inscricao = inscricao;
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
}
