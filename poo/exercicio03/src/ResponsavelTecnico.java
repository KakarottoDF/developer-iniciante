public class ResponsavelTecnico{
    private int matricula;
    private String nome;
    private int cargo; //(TECNICO OU ANALISTA)

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

    public int getCargo() {
        return this.cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "\nResponsável Técnico deste Laboratório:" +
                "\nMatrícula: " + getMatricula() +
                "\nNome: " + getNome() +
                "\nCargo: " + (getCargo() == 1 ? "TÉCNICO" : "ANALISTA") + "\n";
    }
}
