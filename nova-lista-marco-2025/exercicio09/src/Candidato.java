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

    public double totalGastos(Eleicao eleicao){
        double gastoGeral = 0.0;
        for (Candidato candidato : eleicao.getCandidatos()) {
            gastoGeral += candidato.getVerba();
            }
        return gastoGeral;
    }

    public double totalGastos(Eleicao eleicao, boolean incluirReeleitos) {
        double gastoGeral = 0.0;
        for (Candidato candidato : eleicao.getCandidatos()) {
            if (incluirReeleitos || (!candidato.getReeleito() &&
                    (candidato.getTipoCandidatura().equalsIgnoreCase("Deputado Federal") ||
                            candidato.getTipoCandidatura().equalsIgnoreCase("Deputado Distrital")))) {
                gastoGeral += candidato.getVerba();
            }
        }
        return gastoGeral;
    }

    public double mediaGastos(Eleicao eleicao){

        return totalGastos(eleicao) / eleicao.getCandidatos().size();
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
        return "Candidato:" +
                "\nNome: '" + getNome() +
                "\nNúmero de Filiação: " + getNumeroFiliacao() +
                "\nTipo de Candidatura: " + getTipoCandidatura() +
                "\nFoi reeleito? " + (getReeleito() ? "Sim" : "Não") +
                "\nVerba R$" + getVerba();
    }
}