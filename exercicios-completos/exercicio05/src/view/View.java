package view;

import classes.gerais.DotNet;
import classes.gerais.LinguagemC;
import reader.Reader;
import singleton.Singleton;

public class View{
    public static DotNet alimentarArrayDotNet(){
        String nome;
        do {
            nome = Reader.lerString("INFORME O NOME DO ARQUIVO: ");
            if(Singleton.getInstancia().getSistema().validarSeNomeExiste(nome)){
                System.out.println("O ARQUIVO JÁ EXISTE, INFORME OUTRO!");
            }else{
                if(nome.isEmpty() || nome.isBlank()){
                    System.out.println("VOCÊ TEM QUE DIGITAR UM NOME.");
                }
            }
        }while(Singleton.getInstancia().getSistema().validarSeNomeExiste(nome) || nome.isEmpty() || nome.isBlank());

        return new DotNet(
                nome,
                Reader.lerInt("INSIRA A QUANTIDADE DE LINHAS DESTE CÓDIGO: "),
                Reader.lerString("INSIRA O NOME DO PACOTE: "),
                Reader.lerInt("INFORME A QUANTIDADE DE MÉTODOS: ")
        );
    }

    public static LinguagemC alimentarArrayC(){
        String nome;
        do {
            nome = Reader.lerString("INFORME O NOME DO ARQUIVO: ");
            if(Singleton.getInstancia().getSistema().validarSeNomeExiste(nome)){
                System.out.println("O ARQUIVO JÁ EXISTE, INFORME OUTRO!");
            }else{
                if(nome.isEmpty() || nome.isBlank()){
                    System.out.println("VOCÊ TEM QUE DIGITAR UM NOME.");
                }
            }
        }while(Singleton.getInstancia().getSistema().validarSeNomeExiste(nome) || nome.isEmpty() || nome.isBlank());

        return new LinguagemC(
                nome,
                Reader.lerInt("INSIRA A QUANTIDADE DE LINHAS DESTE CÓDIGO: "),
                Reader.lerInt("INFORME A QUANTIDADE DE BIBLIOTECAS: "),
                Reader.lerInt("INFORME A QUANTIDADE DE FUNÇÕES: ")
        );
    }

    public static void cadastrarDotNet(){
        boolean continuar = true;

        while(continuar){
            Singleton.getInstancia().getSistema().adicionar(alimentarArrayDotNet());

            continuar = Reader.lerBoolean("DESEJA CONTINUAR COM O CADASTRO? [S]SIM [N]NÃO: ", "DIGITE SOMENTE [S]SIM [N]NÃO", "S", "N");
        }
    }

    public static void cadastrarLinguagemC(){
        boolean continuar = true;

        while(continuar) {

            Singleton.getInstancia().getSistema().adicionar(alimentarArrayC());

            continuar = Reader.lerBoolean("DESEJA CONTINUAR COM O CADASTRO? [S]SIM [N]NÃO: ", "DIGITE SOMENTE [S]SIM [N]NÃO", "S", "N");
        }
    }
}
