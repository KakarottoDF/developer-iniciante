public class Candidato{
    private String nome;
    private int numeroFiliacao;
    private String tipoCandidatura;
    private double verba;

    public Candidato(String nome, int numeroFiliacao, String tipoCandidatura, double verba) {
        this.nome = nome;
        this.numeroFiliacao = numeroFiliacao;
        this.tipoCandidatura = tipoCandidatura;
        this.verba = verba;
    }

    private static String tipoCandidatura(){
        int escolha = Reader.lerInt("Informe o tipo de candidatura: \n[1]Deputado Federal\n[2]Deputado Distrital\n[3]Senador", "\nEscolha somente uma das opções.\n", 1, 3);0

        return switch (escolha) {
            case 1 -> "Deputado Federal";
            case 2 -> "Deputado Distrital";
            case 3 -> "Senador";
            default -> "Opção Inválida!";
        };
    }

    private static boolean isReeleito(){

    }

    /*nome, numero de filiação, se a candidatura é para deputado federal,
    distrital ou senador. Cada candidato tem direito a uma verba de campanha de acordo com o
    seu tipo de candidatura. Se o candidato almejar candidatura para deputado distrital a verba
    destinada a ele é de R$ 170.000,00 caso almeje deputado federal R$ 250.000,00 e por fim
    caso almeje senador R$ 350.000,00. Outra característica de candidato é se ele já foi ou não
    reeleito, caso ele já tenha sido reeleito a verba de campanha será dobrada.
    Sabe-se que serão informados um número fixo de candidatos, pergunte ao usuário a
    quantidade e receba os dados dos mesmo.*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroFiliacao() {
        return numeroFiliacao;
    }

    public void setNumeroFiliacao(int numeroFiliacao) {
        this.numeroFiliacao = numeroFiliacao;
    }

    public String getTipoCandidatura() {
        return tipoCandidatura;
    }

    public void setTipoCandidatura(String tipoCandidatura) {
        this.tipoCandidatura = tipoCandidatura;
    }

    public double getVerba() {
        return verba;
    }

    public void setVerba(double verba) {
        this.verba = verba;
    }
}
