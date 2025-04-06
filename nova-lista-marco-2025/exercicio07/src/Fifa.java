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
                "Gasto com Jogadores: R$ " + getGastoJogadores();
    }
}
