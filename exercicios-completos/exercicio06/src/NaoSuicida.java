public class NaoSuicida extends Terrorista{
    private String paisDeOrigem;

    public NaoSuicida(String nome, int quantidadeDeExplosivos, String paisDeOrigem) {
        super(nome, quantidadeDeExplosivos);
        setPaisDeOrigem(paisDeOrigem);
    }

    public String getPaisDeOrigem() {
        return this.paisDeOrigem;
    }

    public void setPaisDeOrigem(String paisDeOrigem) {
        this.paisDeOrigem = paisDeOrigem;
    }

    @Override
    public String toString() {
        return "\nTERRORISTA NÃO SUICIDA:" +
                super.toString() +
                "\nPAÍS DE ORIGEM: " + getPaisDeOrigem()
                + "\n";
    }
}
