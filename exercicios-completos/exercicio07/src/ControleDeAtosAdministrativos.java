import java.util.ArrayList;

public class ControleDeAtosAdministrativos {
    private ArrayList<AtoAdministrativo> listaAtoAdministrativos;

    public ControleDeAtosAdministrativos() {
        this.listaAtoAdministrativos = new ArrayList<>();
    }

    public ArrayList<AtoAdministrativo> getListaAtoAdministrativos() {
        return this.listaAtoAdministrativos;
    }

    public boolean validarSeAssuntoExiste(String assunto) {
        AtoAdministrativo novoAtoAdministrativo = new AtoAdministrativo(null, assunto, null);
        return getListaAtoAdministrativos().contains(novoAtoAdministrativo);
    }

    @Override
    public String toString() {
        return "---------- SISTEMA DE CONTROLE DE ATOS ADMINISTRATIVOS ----------" +
                "\nLISTA DE ATOS ADMINISTRATIVOS: " + getListaAtoAdministrativos();
    }
}
