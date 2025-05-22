public class Facultativo extends AtoAdministrativo {
    private String conclusao;

    public Facultativo(AgentePublico agentePublico, String assunto, String exposicaoDeMotivos, String conclusao) {
        super(agentePublico, assunto, exposicaoDeMotivos);
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
        return "\n*** POSICIONAMENTO DOUTRINÁRIO FACULTATIVO ***" +
                super.toString() +
                "\nCONCLUSÃO: " + getConclusao() +
                "\n";
    }
}
