public class Inicializador{
    public static void iniciarArrays(Piloto piloto, Corrida corrida){
        piloto.nome = new String[corrida.quantidadeDeVoltas];
        piloto.escuderia = new String[corrida.quantidadeDeVoltas];
        corrida.tempoDeVolta = new double[corrida.quantidadeDeVoltas];
    }
}
