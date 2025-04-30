import java.util.ArrayList;

public class Administrativo extends Sistema{
    private int quantidadeUsuariosSimultaneos;

    public Administrativo(String nomeResponsavel, String telefone, boolean fullTime, String nomeSistema, int quantidadeUsuariosSimultaneos) {
        super(nomeResponsavel, telefone, fullTime, nomeSistema);
        setQuantidadeUsuariosSimultaneos(quantidadeUsuariosSimultaneos);
    }

    public int getQuantidadeUsuariosSimultaneos() {
        return this.quantidadeUsuariosSimultaneos;
    }

    public void setQuantidadeUsuariosSimultaneos(int quantidadeUsuariosSimultaneos) {
        this.quantidadeUsuariosSimultaneos = quantidadeUsuariosSimultaneos;
    }
}
