import java.util.ArrayList;

public class AtoAdministrativo {
    //Um ato administrativo não pode ter o mesmo assunto que outro
    private AgentePublico agentePublico;
    private String assunto;
    private String exposicaoDeMotivos;

    public AtoAdministrativo(AgentePublico agentePublico, String assunto, String exposicaoDeMotivos) {
        setAgentePublico(agentePublico);
        setAssunto(assunto);
        setExposicaoDeMotivos(exposicaoDeMotivos);
    }

    public String getAssunto() {
        return this.assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getExposicaoDeMotivos() {
        return this.exposicaoDeMotivos;
    }

    public void setExposicaoDeMotivos(String exposicaoDeMotivos) {
        this.exposicaoDeMotivos = exposicaoDeMotivos;
    }

    public AgentePublico getAgentePublico() {
        return this.agentePublico;
    }

    public void setAgentePublico(AgentePublico agentePublico) {
        this.agentePublico = agentePublico;
    }

    @Override
    public boolean equals(Object obj) {
        AtoAdministrativo atoAdministrativo = (AtoAdministrativo) obj;
        return getAssunto() != null && getAssunto().equals(atoAdministrativo.getAssunto());
    }

    @Override
    public int hashCode() {
        return getAssunto() != null ? getAssunto().hashCode() : 0;
    }

    @Override
    public String toString() {
        return getAgentePublico() +
                "\n--- ATO ADMINISTRATIVO ---" +
                "\nASSUNTO: " + getAssunto() +
                "\nEXPOSIÇÃO DE MOTIVOS: " + getExposicaoDeMotivos();
    }
}
