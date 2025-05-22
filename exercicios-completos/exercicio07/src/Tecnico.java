public class Tecnico extends AtoAdministrativo{
    private String notaTecnica;

    public Tecnico(AgentePublico agentePublico, String assunto, String exposicaoDeMotivos, String notaTecnica) {
        super(agentePublico, assunto, exposicaoDeMotivos);
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
        return "\nPOSICIONAMENTO DOUTRINÁRIO TÉCNICO" +
                super.toString() +
                "\nNOTA TÉCNICA: " + getNotaTecnica();
    }
}
