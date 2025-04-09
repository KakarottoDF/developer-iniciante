public class Main {
    public final int TRIMESTRE_DESEJADO = 3;
    public final int ANO_DESEJADO = 2017;

    public static void main(String[] args) {
        Administracao administracao = new Administracao();

        View.cadastrar(administracao);
        Printer.imprimirAcoes(administracao);
    }
}