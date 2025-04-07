public class Candidato {
    private String nome;
    private int numeroFiliacao;
    private String tipoCandidatura;
    private boolean reeleito;
    private double verba;

    public Candidato(String nome, int numeroFiliacao, int tipoCandidatura, boolean reeleito, double verba) {
        setNome(nome);
        setNumeroFiliacao(numeroFiliacao);
        setTipoCandidatura(tipoCandidatura);
        setReeleito(reeleito);
        setVerba(verba);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroFiliacao() {
        return this.numeroFiliacao;
    }

    public void setNumeroFiliacao(int numeroFiliacao) {
        this.numeroFiliacao = numeroFiliacao;
    }

    public String getTipoCandidatura() {
        return this.tipoCandidatura;
    }

    public void setTipoCandidatura(int escolha) {
        this.tipoCandidatura = switch (escolha) {
            case 1 -> "Deputado Federal";
            case 2 -> "Deputado Distrital";
            case 3 -> "Senador";
            default -> "Opção Inválida!";
        };
    }

    public boolean getReeleito() {
        return this.reeleito;
    }

    public void setReeleito(boolean reeleito) {
        this.reeleito = reeleito;
    }

    public double getVerba() {
        return this.verba;
    }

    public void setVerba(double verba) {
        this.verba = verba;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "nome='" + getNome() + '\'' +
                ", numeroFiliacao=" + getNumeroFiliacao() +
                ", tipoCandidatura='" + getTipoCandidatura() + '\'' +
                ", reeleito=" + (getReeleito() ? "Sim" : "Não") +
                ", verba=" + getVerba() +
                '}';
    }
}