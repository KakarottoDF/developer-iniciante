import java.util.Arrays;

public class Fifa {
    private Jogador[] jogadores;
    private double gastoJogadores;

    public Fifa() {
        this.jogadores = new Jogador[0];
    }

    public void adicionar(Jogador jogador){
        Jogador[] novosJogadores = new Jogador[jogadores.length +1];
        int i = 0;

        for(Jogador jg : jogadores){
            novosJogadores[i++] = jg;
        }

        novosJogadores[novosJogadores.length -1] = jogador;
        setJogadores(novosJogadores);
        setGastoJogadores(totalGastos());
    }

    public int totalGolsMaioresDeIdade() {
        int totalGols = 0;
        for (Jogador jogador : jogadores) {
            if (jogador.getIdade() > 18) {
                totalGols += jogador.getQuantidadeDeGols();
            }
        }
        return totalGols;
    }

    public double mediaGolsMaioresDeIdade() {
        int totalGols = totalGolsMaioresDeIdade();
        int contador = 0;
        double media;

        for (Jogador jogador : jogadores) {
            if (jogador.getIdade() > 18) {
                contador++;
            }
        }
        media = totalGols / contador;

        return media;
    }

    public double totalGastos(){
        double gastoFinal = 0.0;

        for(Jogador jog : jogadores){
            gastoFinal += jog.getRemuneracao();
        }
        return gastoFinal;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public double getGastoJogadores() {
        return gastoJogadores;
    }

    public void setGastoJogadores(double gastoJogador) {
        this.gastoJogadores = gastoJogador;
    }

    @Override
    public String toString() {
        return "Lista Fifa:" +
                Arrays.toString(jogadores) +
                "\n\nGasto total com Jogadores: R$ " + getGastoJogadores();
    }
}
