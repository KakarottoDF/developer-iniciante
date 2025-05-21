import java.util.ArrayList;

public class AtoAdministrativo {
    //Um ato administrativo não pode ter o mesmo assunto que outro
    private String assunto;
    private String exposicaoDeMotivos;
    private AgentePublico agentePublico;


    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getExposicaoDeMotivos() {
        return exposicaoDeMotivos;
    }

    public void setExposicaoDeMotivos(String exposicaoDeMotivos) {
        this.exposicaoDeMotivos = exposicaoDeMotivos;
    }

    public AgentePublico getAgentePublico() {
        return agentePublico;
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
