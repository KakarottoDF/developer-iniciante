public class Suicida extends Terrorista{
    private final String RELIGIAO;

    public Suicida(String nome, int quantidadeDeExplosivos, boolean religiaoInformada) {
        super(nome, quantidadeDeExplosivos);
        if (religiaoInformada == true) {
            this.RELIGIAO = "ISLAMISMO";
        } else {
            this.RELIGIAO = "OUTROS";
        }
    }

    public String getReligiao() {
        return this.RELIGIAO;
    }

    @Override
    public String toString() {
        return "\nTERRORISTA SUICIDA:" +
                super.toString() +
                "\nRELIGIÃO: " + getReligiao()
                + "\n";
    }
}
