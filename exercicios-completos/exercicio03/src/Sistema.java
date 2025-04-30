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

    public int calcularFuncionarios(Administrativo administrativo) {
        int funcionarios = 1; // 1 funcionário mínimo para sistemas administrativos
        if (administrativo.isFullTime()) {
            if (administrativo.getQuantidadeUsuariosSimultaneos() > 200) {
                funcionarios += 2; // Adicional de 2 funcionários
            }
        }
        return funcionarios;
    }

    public int calcularFuncionarios(Corporativo corporativo) {
        int funcionarios = 2; // 2 funcionários mínimo para sistemas corporativos
        if (corporativo.isFullTime()) {
            if (corporativo.getQuantidadeAcessosPorMinuto() >= 3000 && corporativo.getQuantidadeAcessosPorMinuto() <= 5000) {
                funcionarios += 2; // Adicional de 2 funcionários
            } else if (corporativo.getQuantidadeAcessosPorMinuto() > 5000) {
                funcionarios += 3; // Adicional de 3 funcionários
            }
        }
        return funcionarios;
    }

    @Override
    public String toString() {
        return "Sistema: " + getNomeSistema() + "\n" +
                "Responsável: " + getNomeResponsavel() + "\n" +
                "Telefone: " + getTelefone() + "\n" +
                "Full Time: " + (isFullTime() ? "Sim" : "Não");
    }

}
