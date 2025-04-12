public class ResponsavelTecnico{
    private int matricula;
    private String nome;
    private String cargo; //(TECNICO OU ANALISTA)

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "ResponsavelTecnico{" +
                "matricula=" + getMatricula() +
                ", nome='" + getNome() + '\'' +
                ", cargo='" + getCargo() + '\'' +
                '}';
    }
}
