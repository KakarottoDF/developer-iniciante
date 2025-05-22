import javax.swing.*;

public class Printer {
    private static final int LINHA_INICIAL = 1000;
    private static final int LINHA_FINAL = 7000;
    private static final String TERMO = "PROVA2";

    /*public static void imprimirTodosOsSistemas(SistemaDeArquivos sistemaDeArquivos){
        System.out.println(sistemaDeArquivos);
    }*/

    //interface comparable
    //

    public static void imprimirArquivosOrdenadosPorTempoDeCompilacaoDecrescente(SistemaDeArquivos sistema) {
        StringBuilder sb = new StringBuilder("ARQUIVOS ORDENADOS POR TEMPO DE COMPILAÇÃO (DECRESCENTE):\n\n");

        for (Arquivo arq : sistema.getArquivosOrdenadosPorTempoDeCompilacaoDecrescente()) {
            sb.append(arq).append("\n");
            sb.append("TEMPO TOTAL DE COMPILAÇÃO: ").append(arq.tempoDeCompilacao()).append(" SEGUNDOS\n\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }


    public static void imprimirArquivoComMaiorTempoDeCompilacao(SistemaDeArquivos sistemaDeArquivos) {
        if (sistemaDeArquivos.getArquivo().isEmpty()) {
            System.out.println("NENHUM ARQUIVO CADASTRADO.");
        }else{
            System.out.println("\nARQUIVO COM MAIOR TEMPO DE COMPILAÇÃO:");
            System.out.println(sistemaDeArquivos.verificarArquivoComMaiorTempoDeCompilacao());
        }
    }

    public static void imprimirArquivosComLinhasCondicionais(SistemaDeArquivos sistema) {
        System.out.println("\nARQUIVOS ENTRE " + LINHA_INICIAL + " E " + LINHA_FINAL + " LINHAS:");

        for (Arquivo arquivo : sistema.getArquivo()) {
            if (arquivo.getQtdLinhas() >= LINHA_INICIAL && arquivo.getQtdLinhas() <= LINHA_FINAL) {
                System.out.println(arquivo);
            }
        }
    }

    public static void imprimirArquivosComTermo(SistemaDeArquivos sistema) {
        System.out.println("\nARQUIVOS COM \"" + TERMO + "\" NO NOME:");

        for (Arquivo arquivo : sistema.getArquivo()) {
            if (arquivo.getNome().contains(TERMO)) {
                System.out.println(arquivo);
            }
        }
    }

    public static void imprimirArquivosDotNet(SistemaDeArquivos sistema) {
        for (Arquivo arquivo : sistema.getArquivo()) {
            if (arquivo instanceof DotNet) {
                System.out.println(arquivo);
            }
        }
    }

    public static void imprimirArquivosLinguagemC(SistemaDeArquivos sistema) {
        for (Arquivo arquivo : sistema.getArquivo()) {
            if (arquivo instanceof LinguagemC) {
                System.out.println(arquivo);
            }
        }
    }

}
