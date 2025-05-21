public class Suicida extends Terrorista{
    private final String RELIGIAO;
    private final int RELIGIAO_ISLA = 5;
    private final int RELIGIAO_OUTROS = 2;

    public Suicida(String nome, int quantidadeDeExplosivos, boolean religiaoInformada) {
        super(nome, quantidadeDeExplosivos);
        if (religiaoInformada == true) {
            this.RELIGIAO = "ISLAMISMO";
        } else {
            this.RELIGIAO = "OUTRA";
        }
    }

    @Override
    public int grauDePericulosidade(){
        return getRELIGIAO() == "ISLAMISMO" ? (3 * getQuantidadeDeExplosivos()) + getRELIGIAO_ISLA() : (3 * getQuantidadeDeExplosivos()) + getRELIGIAO_OUTROS();
    }

    public String getRELIGIAO() {
        return RELIGIAO;
    }

    public int getRELIGIAO_ISLA() {
        return RELIGIAO_ISLA;
    }

    public int getRELIGIAO_OUTROS() {
        return RELIGIAO_OUTROS;
    }

    @Override
    public String toString() {
        return "\nTERRORISTA SUICIDA:" +
                super.toString() +
                "\nRELIGIÃO: " + getRELIGIAO()
                + "\n";
    }
}
