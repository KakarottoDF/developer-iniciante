import java.util.ArrayList;

public class Printer {
    private static final int LINHA_INICIAL = 1000;
    private static final int LINHA_FINAL = 7000;
    private static final String TERMO = "PROVA2";

    public static void imprimirTodosOsSistemas(SistemaDeArquivos sistemaDeArquivos){
        System.out.println(sistemaDeArquivos);
    }

    //interface comparable
    //

    public static void imprimirArquivoComMaiorTempoDeCompilacao(SistemaDeArquivos sistemaDeArquivos) {
        if (sistemaDeArquivos.getArquivo().isEmpty()) {
            System.out.println("NENHUM ARQUIVO CADASTRADO.");
            return;
        }
        sistemaDeArquivos.verificarArquivoComMaiorTempoDeCompilacao();

    }

    public static void imprimirArquivosCondicionais(SistemaDeArquivos sistema) {
        System.out.println("\nIII. ARQUIVOS ENTRE " + LINHA_INICIAL + " E " + LINHA_FINAL + " LINHAS:");

        for (DotNet dotnet : sistema.getDotNets()) {
            if (dotnet.getQtdLinhas() >= LINHA_INICIAL && dotnet.getQtdLinhas() <= LINHA_FINAL) {
                System.out.println(dotnet);
            }
        }

        for (C c : sistema.getCArrayList()) {
            if (c.getQtdLinhas() >= LINHA_INICIAL && c.getQtdLinhas() <= LINHA_FINAL) {
                System.out.println(c);
            }
        }
    }

    public static void imprimirArquivosComTermo(SistemaDeArquivos sistema) {
        System.out.println("\nIV. ARQUIVOS COM " + TERMO + " NO NOME:");

        for (DotNet dotnet : sistema.getDotNets()) {
            if (dotnet.getNome().toUpperCase().contains(TERMO)) {
                System.out.println(dotnet);
            }
        }

        for (C c : sistema.getCArrayList()) {
            if (c.getNome().toUpperCase().contains(TERMO)) {
                System.out.println(c);
            }
        }
    }
}
