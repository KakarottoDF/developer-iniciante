package printer;

import classes.gerais.Arquivo;
import classes.gerais.DotNet;
import classes.gerais.LinguagemC;
import classes.gerais.SistemaDeArquivos;
import singleton.Singleton;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Printer {
    private static final int LINHA_INICIAL = 1000;
    private static final int LINHA_FINAL = 7000;
    private static final String TERMO = "PROVA2";

    public static void imprimirTodosOsSistemas() {

        File file = new File("arquivos.txt");
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter br = new BufferedWriter(fw)) {
            br.write(Singleton.getInstancia().getSistema().toString());
            br.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void imprimirArquivosOrdenadosPorTempoDeCompilacaoDecrescente() {

        StringBuilder sb = new StringBuilder("ARQUIVOS ORDENADOS POR TEMPO DE COMPILAÇÃO (DECRESCENTE):\n\n");

        for (Arquivo arq : Singleton.getInstancia().getSistema().getArquivosOrdenadosPorTempoDeCompilacaoDecrescente()) {
            sb.append(arq).append("\n");
            sb.append("TEMPO TOTAL DE COMPILAÇÃO: ").append(arq.tempoDeCompilacao()).append(" SEGUNDOS\n\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void imprimirArquivoComMaiorTempoDeCompilacao() {

        if (Singleton.getInstancia().getSistema().getArquivo().isEmpty()) {
            System.out.println("NENHUM ARQUIVO CADASTRADO.");
        } else {
            System.out.println("\nARQUIVO COM MAIOR TEMPO DE COMPILAÇÃO:");
            System.out.println(Singleton.getInstancia().getSistema().verificarArquivoComMaiorTempoDeCompilacao());
        }
    }

    public static void imprimirArquivosComLinhasCondicionais() {

        System.out.println("\nARQUIVOS ENTRE " + LINHA_INICIAL + " E " + LINHA_FINAL + " LINHAS:");

        for (Arquivo arquivo : Singleton.getInstancia().getSistema().getArquivo()) {
            if (arquivo.getQtdLinhas() >= LINHA_INICIAL && arquivo.getQtdLinhas() <= LINHA_FINAL) {
                System.out.println(arquivo);
            }
        }
    }

    public static void imprimirArquivosComTermo() {
        SistemaDeArquivos sistema = Singleton.getInstancia().getSistema();
        System.out.println("\nARQUIVOS COM \"" + TERMO + "\" NO NOME:");

        for (Arquivo arquivo : sistema.getArquivo()) {
            if (arquivo.getNome().contains(TERMO)) {
                System.out.println(arquivo);
            }
        }
    }

    public static void imprimirArquivosDotNet() {
        SistemaDeArquivos sistema = Singleton.getInstancia().getSistema();
        for (Arquivo arquivo : sistema.getArquivo()) {
            if (arquivo instanceof DotNet) {
                System.out.println(arquivo);
            }
        }
    }

    public static void imprimirArquivosLinguagemC() {
        SistemaDeArquivos sistema = Singleton.getInstancia().getSistema();
        for (Arquivo arquivo : sistema.getArquivo()) {
            if (arquivo instanceof LinguagemC) {
                System.out.println(arquivo);
            }
        }
    }
}

