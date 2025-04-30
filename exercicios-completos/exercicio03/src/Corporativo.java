import java.util.ArrayList;

public class Corporativo extends Sistema{
    private int quantidadeAcessosPorMinuto;

    public Corporativo(String nomeResponsavel, String telefone, boolean fullTime, String nomeSistema, int quantidadeAcessosPorMinuto) {
        super(nomeResponsavel, telefone, fullTime, nomeSistema);
        setQuantidadeAcessosPorMinuto(quantidadeAcessosPorMinuto);
    }

    public int getQuantidadeAcessosPorMinuto() {
        return this.quantidadeAcessosPorMinuto;
    }

    public void setQuantidadeAcessosPorMinuto(int quantidadeAcessosPorMinuto) {
        this.quantidadeAcessosPorMinuto = quantidadeAcessosPorMinuto;
    }
}
