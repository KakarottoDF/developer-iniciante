public class Facultativo extends AtoAdministrativo {
    private String conclusao;

    public Facultativo(String assunto, String exposicaoDeMotivos, AgentePublico agentePublico, String conclusao) {
        super(assunto, exposicaoDeMotivos, agentePublico);
        setConclusao(conclusao);
    }

    public String getConclusao() {
        return this.conclusao;
    }

    public void setConclusao(String conclusao) {
        this.conclusao = conclusao;
    }

    @Override
    public String toString() {
        return "\nPOSICIONAMENTO DOUTRINÁRIO FACULTATIVO" +
                super.toString() +
                "\nCONCLUSÃO: " + getConclusao();
    }
}
