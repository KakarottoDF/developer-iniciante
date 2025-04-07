public class Main {
    public static void main(String[] args) {
        Eleicao eleicao = new Eleicao();

        View.cadastrar(eleicao);
        Printer.imprimirCandidatos(eleicao);
        Printer.imprimirCandidatosEleitos(eleicao);
        Printer.imprimirGastosNaoReeleitos(eleicao);
        Printer.imprimirMediaCustos(eleicao);
    }
}