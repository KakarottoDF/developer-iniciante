//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SistemaDeArquivos sistemaDeArquivos = new SistemaDeArquivos();

        View.alimentarArrayDotNet(sistemaDeArquivos);
        View.alimentarArrayC(sistemaDeArquivos);

        Printer.imprimirTodosOsSistemas(sistemaDeArquivos);

        /*Printer.imprimirArquivosCondicionais(sistemaDeArquivos);
        Printer.imprimirArquivosComTermo(sistemaDeArquivos);*/
    }
}