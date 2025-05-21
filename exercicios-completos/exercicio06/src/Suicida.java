public class Suicida extends Terrorista{
    private String religiao;
    private final int CONST_RELIGIAO_ISLA = 5;
    private final int CONST_RELIGIAO_OUTROS = 2;

    public Suicida(String nome, int quantidadeDeExplosivos, String religiao) {
        super(nome, quantidadeDeExplosivos);
        setReligiao(religiao);
    }

    @Override
    public int grauDePericulosidade(){
        return getReligiao() == "ISLAMISMO" ? (3 * getQuantidadeDeExplosivos()) + getCONST_RELIGIAO_ISLA() : (3 * getQuantidadeDeExplosivos()) + getCONST_RELIGIAO_OUTROS();
    }

    public String getReligiao() {
        return religiao;
    }

    public void setReligiao(String religiao) {
        this.religiao = religiao;
    }

    public int getCONST_RELIGIAO_ISLA() {
        return this.CONST_RELIGIAO_ISLA;
    }

    public int getCONST_RELIGIAO_OUTROS() {
        return this.CONST_RELIGIAO_OUTROS;
    }

    @Override
    public String toString() {
        return "\nTERRORISTA SUICIDA:" +
                super.toString() +
                "\nRELIGIÃO: " + getReligiao()
                + "\n";
    }
}
