public class Suicida extends Terrorista{
    private String religiao;

    public Suicida(String nome, int quantidadeDeExplosivos, String religiao) {
        super(nome, quantidadeDeExplosivos);
        setReligiao(religiao);
    }

    public String getReligiao() {
        return this.religiao;
    }

    public void setReligiao(String religiao) {
        this.religiao = religiao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Religião: " + getReligiao();
    }
}
