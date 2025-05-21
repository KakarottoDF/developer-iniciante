public class NaoSuicida extends Terrorista{
    private String paisDeOrigem;
    private final int CONST_PAIS_ARABIA = 7;
    private final int CONST_PAIS_OUTROS = 5;

    public NaoSuicida(String nome, int quantidadeDeExplosivos, String paisDeOrigem) {
        super(nome, quantidadeDeExplosivos);
        setPaisDeOrigem(paisDeOrigem);
    }

    @Override
    public int grauDePericulosidade(){
        return getPaisDeOrigem() == "ARÁBIA" ? (3 * getQuantidadeDeExplosivos()) + getCONST_PAIS_ARABIA() : (3 * getQuantidadeDeExplosivos()) + getCONST_PAIS_OUTROS();
    }

    public String getPaisDeOrigem() {
        return this.paisDeOrigem;
    }

    public void setPaisDeOrigem(String paisDeOrigem) {
        this.paisDeOrigem = paisDeOrigem;
    }

    public int getCONST_PAIS_ARABIA() {
        return CONST_PAIS_ARABIA;
    }

    public int getCONST_PAIS_OUTROS() {
        return CONST_PAIS_OUTROS;
    }

    @Override
    public String toString() {
        return "\nTERRORISTA NÃO SUICIDA:" +
                super.toString() +
                "\nPAÍS DE ORIGEM: " + getPaisDeOrigem()
                + "\n";
    }
}
