public class Main {
    public static void main(String[] args) {
        Atleta atleta = new Atleta();
        View.cadastrar(atleta);
        Printer.imprimirRelatorioFinal(atleta);
    }
}
