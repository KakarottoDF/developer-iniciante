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

    private void preencherInscricao(Atleta novoAtleta) {
        boolean inscricaoValida = false;

        while (!inscricaoValida) {
            int inscricao = lerInt("Digite o número de inscrição do atleta: ");
            novoAtleta.setInscricao(inscricao);
            if (novoAtleta.getInscricao() != 0) {
                inscricaoValida = true;
            }
        }
    }

    public void preencherAtletas(GerenciarAtleta gerenciarAtletas) {
        int quantidadeDeAtletas = 3;

        gerenciarAtletas.atletas = new Atleta[quantidadeDeAtletas];

        for (int i = 0; i < quantidadeDeAtletas; i++) {
            Atleta novoAtleta = new Atleta(gerenciarAtletas);

            preencherInscricao(novoAtleta);

            novoAtleta.setNome(lerString("Digite o nome do atleta: "));
            novoAtleta.setIdade(lerInt("Digite a idade do atleta: "));
            novoAtleta.setTempoDeProva(lerDouble("Digite o tempo de prova do atleta: "));

            adicionarAtleta(gerenciarAtletas, novoAtleta);
        }
    }

    private void adicionarAtleta(GerenciarAtleta gerenciarAtletas, Atleta novoAtleta) {
        for (int i = 0; i < gerenciarAtletas.atletas.length; i++) {
            if (gerenciarAtletas.atletas[i] == null) {
                gerenciarAtletas.atletas[i] = novoAtleta;
            }
        }
    }
}
