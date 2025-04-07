public class Candidato{
    private String nome;
    private int numeroFiliacao;
    private String tipoCandidatura;
    private boolean reeleito;
    private double verba;

    /*public Candidato(String nome, int numeroFiliacao, String tipoCandidatura, boolean reeleito, double verba) {
        this.nome = nome;
        this.numeroFiliacao = numeroFiliacao;
        this.tipoCandidatura = tipoCandidatura;
        this.reeleito = reeleito;
        this.verba = verba;
    }*/

    private static String tipoCandidatura(){
        int escolha = Reader.lerInt("Informe o tipo de candidatura: \n[1]Deputado Federal\n[2]Deputado Distrital\n[3]Senador", "\nEscolha somente uma das opções.\n", 1, 3);

        return switch (escolha) {
            case 1 -> "Deputado Federal";
            case 2 -> "Deputado Distrital";
            case 3 -> "Senador";
            default -> "Opção Inválida!";
        };
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
        switch (escolha) {
            case 1:
                this.tipoCandidatura = "Deputado Federal";
                break;
            case 2:
                this.tipoCandidatura = "Deputado Distrital";
                break;
            case 3:
                this.tipoCandidatura = "Senador";
                break;
            default:
                this.tipoCandidatura = "Opção Inválida!";
        }
    }

    public boolean getReeleito(){
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
