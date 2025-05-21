import java.util.ArrayList;

public class AtoAdministrativo {
    //Um ato administrativo não pode ter o mesmo assunto que outro
    private String assunto;
    private String exposicaoDeMotivos;
    private AgentePublico agentePublico;

    public AtoAdministrativo(String assunto, String exposicaoDeMotivos, AgentePublico agentePublico) {
        setAssunto(assunto);
        setExposicaoDeMotivos(exposicaoDeMotivos);
        setAgentePublico(agentePublico);
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
    public String toString() {
        return "AtoAdministrativo{" +
                "assunto='" + getAssunto() + '\'' +
                ", exposicaoDeMotivos='" + getExposicaoDeMotivos() + '\'' +
                ", agentePublico=" + getAgentePublico() +
                '}';
    }
}
