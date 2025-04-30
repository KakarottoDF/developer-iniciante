import java.util.ArrayList;

public class Sistema {
    private String nomeResponsavel;
    private String telefone;
    private boolean fullTime;
    private String nomeSistema;

    ArrayList<Administrativo> administrativos;
    ArrayList<Corporativo> corporativos;

    public Sistema(){
        this.administrativos = new ArrayList<>();
        this.corporativos = new ArrayList<>();
    }

    public void setAdministrativos(Administrativo administrativos){
        getAdministrativos().add(administrativos);
    }

    public void setCorporativos(Corporativo corporativos){
        getCorporativos().add(corporativos);
    }

    public Sistema(String nomeResponsavel, String telefone, boolean fullTime, String nomeSistema) {
        setNomeResponsavel(nomeResponsavel);
        setTelefone(telefone);
        setFullTime(fullTime);
        setNomeSistema(nomeSistema);
    }

    public String getNomeResponsavel() {
        return this.nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isFullTime() {
        return this.fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public String getNomeSistema() {
        return this.nomeSistema;
    }

    public void setNomeSistema(String nomeSistema) {
        this.nomeSistema = nomeSistema;
    }

    public ArrayList<Administrativo> getAdministrativos() {
        return this.administrativos;
    }

    public ArrayList<Corporativo> getCorporativos() {
        return this.corporativos;
    }

}
