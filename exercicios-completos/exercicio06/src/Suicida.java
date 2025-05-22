public class Suicida extends Terrorista implements Periculosidade{
    private String religiao;
    private static final int CONST_RELIGIAO_ISLA = 5;
    private static final int CONST_RELIGIAO_OUTROS = 2;

    public Suicida(String nome, int quantidadeDeExplosivos, String religiao) {
        super(nome, quantidadeDeExplosivos);
        setReligiao(religiao);
    }

    @Override
    public int grauDePericulosidade(){
        return getReligiao().equals("ISLAMISMO") ? (2 * getQuantidadeDeExplosivos()) + CONST_RELIGIAO_ISLA : (2 * getQuantidadeDeExplosivos()) + CONST_RELIGIAO_OUTROS;
    }

    public String getReligiao() {
        return religiao;
    }

    public void setReligiao(String religiao) {
        this.religiao = religiao;
    }

    @Override
    public String toString() {
        return "\nTERRORISTA SUICIDA:" +
                super.toString() +
                "\nRELIGIÃO: " + getReligiao() +
                "\nGRAU DE PERICULOSIDADE: " + grauDePericulosidade() +
                "\n";
    }
}
