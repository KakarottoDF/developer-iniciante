public class Pessoa {
    private String nome;
    private String matricula;

    public Pessoa(String nome, String matricula) {
        setNome(nome);
        setMatricula(matricula);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return  "\nNOME: " + getNome() +
                "\nMATRÍCULA: " + getMatricula();
    }
}
