public class Resultado {

    public static void resultdoDaCorrida(Piloto pilotos, Corrida corrida){

        for (int i = 0; i < corrida.quantidadeDeVoltas; i++) {
            System.out.println("Piloto " + (i + 1) + ": " + pilotos.nome[i]);
            System.out.println("Escuderia: " + pilotos.escuderia[i]);
            //System.out.println("Regular: " + (aluno.situacaoRegular[i] ? "Sim" : "Não"));

        }
    }
}
