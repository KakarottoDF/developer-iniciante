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

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Tipo: Corporativo\n" +
                "Acessos por Minuto: " + getQuantidadeAcessosPorMinuto();
    }

    public int calcularFuncionarios() {
        if (isFullTime()) {
            if (getQuantidadeAcessosPorMinuto() > 5000) {
                return 5;
            } else if (getQuantidadeAcessosPorMinuto() >= 3000) {
                return 4;
            }
            return 2;
        }
        return 0;
    }
}
