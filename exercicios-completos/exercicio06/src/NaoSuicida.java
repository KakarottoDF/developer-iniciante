public class NaoSuicida extends Terrorista implements Periculosidade{
    private String paisDeOrigem;
    private static final int CONST_PAIS_ARABIA = 7;
    private static final int CONST_PAIS_OUTROS = 5;

    public NaoSuicida(String nome, int quantidadeDeExplosivos, String paisDeOrigem) {
        super(nome, quantidadeDeExplosivos);
        setPaisDeOrigem(paisDeOrigem);
    }

    @Override
    public int grauDePericulosidade(){
        return getPaisDeOrigem().equals("ARÁBIA") ? (3 * getQuantidadeDeExplosivos()) + CONST_PAIS_ARABIA : (3 * getQuantidadeDeExplosivos()) + CONST_PAIS_OUTROS;
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
                "\nPAÍS DE ORIGEM: " + getPaisDeOrigem() +
                "\nGRAU DE PERICULOSIDADE: " + grauDePericulosidade() +
                "\n";
    }
}
