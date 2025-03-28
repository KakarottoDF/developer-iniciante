import java.util.Scanner;

public class Reader{

    public String lerString(){
        return new Scanner(System.in).nextLine().trim().toUpperCase();
    }

    public String lerString(String msg){
        System.out.print(msg);
        return lerString();
    }

    public int lerInt(){
        return new Scanner(System.in).nextInt();
    }

    public int lerInt(String msg){
        System.out.print(msg);
        return lerInt();
    }

    public double lerDouble(){
        return new Scanner(System.in).nextDouble();
    }

    public double lerDouble(String msg){
        System.out.print(msg);
        return lerDouble();
    }

    private void preencherInscricao(Atleta novoAtleta, GerenciarAtleta gerenciarAtletas) {
        boolean inscricaoValida = false;
        int inscricao;

        do {

            inscricao = lerInt("Digite o número de inscrição do atleta: ");

            if (gerenciarAtletas.validarNumeroDeIncricao(inscricao)) {
                System.out.println("Número de inscrição já cadastrado! Tente novamente.");
            } else {
                novoAtleta.setInscricao(inscricao);
                inscricaoValida = true;
            }
        } while (!inscricaoValida);
    }

    public void preencherAtletas(GerenciarAtleta gerenciarAtletas) {
        int quantidadeDeAtletas = 3;

        gerenciarAtletas.atletas = new Atleta[quantidadeDeAtletas];

        for (int i = 0; i < quantidadeDeAtletas; i++) {
            Atleta novoAtleta = new Atleta(gerenciarAtletas);

            preencherInscricao(novoAtleta, gerenciarAtletas);

            novoAtleta.setNome(lerString("Digite o nome do atleta: "));
            novoAtleta.setIdade(lerInt("Digite a idade do atleta: "));
            novoAtleta.setTempoDeProva(lerDouble("Digite o tempo de prova do atleta: "));
            novoAtleta.setAtletaDeElite(novoAtleta.isElite());

            adicionarAtleta(gerenciarAtletas, novoAtleta);
        }
    }

    private void adicionarAtleta(GerenciarAtleta gerenciarAtletas, Atleta novoAtleta) {
        for (int i = 0; i < gerenciarAtletas.atletas.length; i++) {
            if (gerenciarAtletas.atletas[i] == null) {
                gerenciarAtletas.atletas[i] = novoAtleta;
                return;
            }
        }
    }
}
