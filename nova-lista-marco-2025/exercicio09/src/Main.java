public class Main {
    public static void main(String[] args) {
        Eleicao eleicao = new Eleicao();

        View.cadastrar(eleicao);
        Printer.imprimirCandidatos(eleicao);
        Printer.imprimirCandidatosEleitos(eleicao);
        Printer.imprimirGastosNaoReeleitos(eleicao);
        Printer.imprimirGastos(eleicao);
        Printer.imprimirCandidatoTiririca(eleicao);
        Printer.imprimirMediaCustos(eleicao);
    }
}