public class AgentePublico {
    private String nome;
    private String matricula;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "AgentePublico{" +
                "nome='" + getNome() + '\'' +
                ", matricula='" + getMatricula() + '\'' +
                '}';
    }
}
