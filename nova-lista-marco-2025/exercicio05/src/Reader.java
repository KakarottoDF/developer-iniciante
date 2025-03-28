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

    public GerenciarAtleta preencherAtletas(GerenciarAtleta gerenciarAtletas) {
        int quantidadeDeAtletas = 3;
        boolean inscricaoValida = false;

        gerenciarAtletas.atletas = new Atleta[quantidadeDeAtletas];

        for (int i = 0; i < quantidadeDeAtletas; i++) {
            Atleta novoAtleta = new Atleta(gerenciarAtletas);
            inscricaoValida = false;

            while (!inscricaoValida) {
                int inscricao = lerInt("Digite o número de inscrição do atleta: ");
                novoAtleta.setInscricao(inscricao);
                if (novoAtleta.getInscricao() != 0) {
                    inscricaoValida = true;
                }
            }

            novoAtleta.setNome(lerString("Digite o nome do atleta: "));
            novoAtleta.setIdade(lerInt("Digite a idade do atleta: "));
            novoAtleta.setTempoDeProva(lerDouble("Digite o tempo de prova do atleta: "));

            for (int j = 0; j < gerenciarAtletas.atletas.length; j++) {
                if (gerenciarAtletas.atletas[j] == null) {
                    gerenciarAtletas.atletas[j] = novoAtleta;
                }
            }
        }

        return gerenciarAtletas;
    }
}
