public class Printer {
    private static final int LINHA_INICIAL = 1000;
    private static final int LINHA_FINAL = 7000;
    private static final String TERMO = "PROVA2";

    /*public static void imprimirTodosOsSistemas(SistemaDeArquivos sistemaDeArquivos){
        System.out.println(sistemaDeArquivos);
    }*/

    //interface comparable
    //

    public static void imprimirArquivosOrdenadosPorTempoDeCompilacao(SistemaDeArquivos sistema) {
        System.out.println("\nARQUIVOS ORDENADOS POR TEMPO DE COMPILAÇÃO (DECRESCENTE):");

        for (Arquivo arq : sistema.getArquivosOrdenadosPorTempoDeCompilacaoDecrescente()) {
            System.out.println(arq);
            System.out.println("TEMPO TOTAL DE COMPILAÇÃO: " + arq.tempoDeCompilacaoTotal() + " SEGUNDOS");
        }
    }

    public static void imprimirArquivoComMaiorTempoDeCompilacao(SistemaDeArquivos sistemaDeArquivos) {
        if (sistemaDeArquivos.getArquivo().isEmpty()) {
            System.out.println("NENHUM ARQUIVO CADASTRADO.");
        }else{
            sistemaDeArquivos.verificarArquivoComMaiorTempoDeCompilacao();
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
            if (arquivo.getNome().toUpperCase().contains(TERMO)) {
                System.out.println(arquivo);
            }
        }
    }

    public static void menu(){
        System.out.println("[1] CADASTRAR ARQUIVOS DOTNET");
        System.out.println("[2] CADASTRAR ARQUIVOS C");
        System.out.println("[3] LISTAR ARQUIVOS ORDENADOS EM FORMA DECRESCENTE POR TEMPO DE COMPILAÇÃO");
        System.out.println("[4] LISTAR ARQUIVO QUE MAIS DEMORA PARA SER COMPILADO");
        System.out.println("[5] LISTAR ARQUIVOS QUE POSSUEM ENTRE " + LINHA_INICIAL + " E " + LINHA_FINAL + " LINHAS");
        System.out.println("[6] LISTAR ARQUIVOS QUE POSSUEM O TERMO " + TERMO + " NO NOME");
        System.out.println("[7] SAIR");
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
