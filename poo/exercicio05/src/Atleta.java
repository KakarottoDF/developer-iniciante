public class Atleta{
    private int numeroDeInscricao;
    private String nome;
    private int tempoDeProva;
    private int idade;

    public Atleta(int numeroDeInscricao, String nome) {
        this.numeroDeInscricao = numeroDeInscricao;
        this.nome = nome;
    }

    public boolean isElite(){
        return getTempoDeProva() < 5;
    }

    /*numero de inscrição (que deve ser único), nome, tempo de prova (em horas
    completas), idade e se o atleta é elite. Ele será considerado elite se o tempo de prova for
    menor que 5 horas. Para a construção de um atleta é obrigatório o nome e numero da
    inscrição.*/

    public int getNumeroDeInscricao() {
        return numeroDeInscricao;
    }

    public void setNumeroDeInscricao(int numeroDeInscricao) {
        this.numeroDeInscricao = numeroDeInscricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTempoDeProva() {
        return tempoDeProva;
    }

    public void setTempoDeProva(int tempoDeProva) {
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
        return "Atleta{" +
                "numeroDeInscricao=" + getNumeroDeInscricao() +
                ", nome='" + getNome() + '\'' +
                ", tempoDeProva=" + getTempoDeProva() +
                ", idade=" + getIdade() +
                '}';
    }
}
