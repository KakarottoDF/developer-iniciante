public class Atleta{
    int inscricao;
    String nome;
    double tempoDeProva;
    int idade;

    public boolean isElite(){
        return tempoDeProva < 5;
    }
}
