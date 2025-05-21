public class Facultativo extends AtoAdministrativo {
    private String conclusao;

    public String getConclusao() {
        return conclusao;
    }

    public void setConclusao(String conclusao) {
        this.conclusao = conclusao;
    }

    @Override
    public String toString() {
        return "Facultativo{" +
                "conclusao='" + getConclusao() + '\'' +
                '}';
    }
}
