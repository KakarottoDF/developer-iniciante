public class Tecnico extends AtoAdministrativo{
    private String notaTecnica;

    public Tecnico(String assunto, String exposicaoDeMotivos, AgentePublico agentePublico, String notaTecnica) {
        super(assunto, exposicaoDeMotivos, agentePublico);
        setNotaTecnica(notaTecnica);
    }

    public String getNotaTecnica() {
        return this.notaTecnica;
    }

    public void setNotaTecnica(String notaTecnica) {
        this.notaTecnica = notaTecnica;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "notaTecnica='" + getNotaTecnica() + '\'' +
                '}';
    }
}
