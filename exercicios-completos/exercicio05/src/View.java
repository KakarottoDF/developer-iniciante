public class View{
    public static DotNet cadastrarDotNet(SistemaDeArquivos sistemaDeArquivos){
        String nome;
        do {
            nome = Reader.lerString("INFORME O NOME DO ARQUIVO: ");
            if(sistemaDeArquivos.validarSeNomeExiste(nome)){
                System.out.println("O ARQUIVO JÁ EXISTE, INFORME OUTRO!");
            }else{
                if(nome.isEmpty() || nome.isBlank()){
                    System.out.println("VOCÊ TEM QUE DIGITAR UM NOME.");
                }
            }
        }while(!sistemaDeArquivos.validarSeNomeExiste(nome) || nome.isEmpty() || nome.isBlank());

        return new DotNet(
                nome,
                Reader.lerInt("Insira a quantidade de linhas deste código."),
                Reader.lerString("Insira o pacote: "),
                Reader.lerInt("Informe a quantidade de métodos: ")
        );
    }

    public static C cadastrarC(SistemaDeArquivos sistemaDeArquivos){
        String nome;
        do {
            nome = Reader.lerString("INFORME O NOME DO ARQUIVO: ");
            if(sistemaDeArquivos.validarSeNomeExiste(nome)){
                System.out.println("O ARQUIVO JÁ EXISTE, INFORME OUTRO!");
            }else{
                if(nome.isEmpty() || nome.isBlank()){
                    System.out.println("VOCÊ TEM QUE DIGITAR UM NOME.");
                }
            }
        }while(!sistemaDeArquivos.validarSeNomeExiste(nome) || nome.isEmpty() || nome.isBlank());

        return new C(
                nome,
                Reader.lerInt("Insira a quantidade de linhas deste código."),
                Reader.lerInt("Informe a quantidade de bibliotecas: "),
                Reader.lerInt("Informe a quantidade de funções: ")
        );
    }

    public static void alimentarArrayDotNet(DotNet dotNet){
        boolean continuar = true;

        while(continuar){
            dotNet.adicionar(cadastrarDotNet(dotNet));

            continuar = Reader.lerBoolean("Deseja continuar com o cadastro? [S]Sim [N]Não: ", "Digite somente [S]Sim [N]Não", "S", "N");
        }
    }

    public static void alimentarArrayC(C cadastroC){
        boolean continuar = true;

        while(continuar){
            cadastroC.adicionar(cadastrarC(cadastroC));

            continuar = Reader.lerBoolean("Deseja continuar com o cadastro? [S]Sim [N]Não: ", "Digite somente [S]Sim [N]Não", "S", "N");
        }
    }


}
