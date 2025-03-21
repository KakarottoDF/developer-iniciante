public class Piloto{
    String nome;
    String escuderia;
    double tempoDeVolta;

    public static Piloto setPiloto() {
        Piloto piloto = new Piloto();
        piloto.nome = Leitor.lerString("Informe o nome do piloto: ");
        piloto.escuderia = Leitor.lerString("Informe a escuderia do piloto: ");
        piloto.tempoDeVolta = Leitor.lerDouble("Informe o tempo do piloto em minutos: ", "Tempo inválido!", 1, 60);
        return piloto;
    }
}
