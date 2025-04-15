public class Atleta{
    private int numeroDeInscricao;
    private String nome;
    private int tempoDeProva;
    private int idade;

    public Atleta(int numeroDeInscricao, String nome) {
        setNumeroDeInscricao(numeroDeInscricao);
        setNome(nome);
    }

    public boolean isElite(){
        return getTempoDeProva() > 0 && getTempoDeProva() < 5;
    }

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
        return this.tempoDeProva;
    }

    public void setTempoDeProva(int tempoDeProva) {
        if(tempoDeProva > 8){
            System.out.println("O TEMPO MÁXIMO DE PROVA É DE 8 HORAS. ATLETA DESCLASSIFICADO!");
            this.tempoDeProva = 0;
        }else{
            if(tempoDeProva <= 0){
                System.out.println("ATLETA NÃO PARTICIPOU DA PROVA!");
                this.tempoDeProva = 0;
            }else{
                this.tempoDeProva = tempoDeProva;
            }
        }
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "\nATLETA:" +
                "\nNÚMERO DE INSCRIÇÃO: " + getNumeroDeInscricao() +
                "\nNOME: " + getNome() +
                "\nTEMPO DE PROVA: " + getTempoDeProva() +
                "\nATLETA DE ELITE? " + (isElite() ? "Sim" : "Não") +
                "\nIDADE: " + getIdade() + "\n";
    }
}
