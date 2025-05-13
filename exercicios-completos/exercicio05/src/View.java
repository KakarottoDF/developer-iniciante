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
        }while(sistemaDeArquivos.validarSeNomeExiste(nome) || nome.isEmpty() || nome.isBlank());

        return new DotNet(
                nome,
                Reader.lerInt("INSIRA A QUANTIDADE DE LINHAS DESTE CÓDIGO: "),
                Reader.lerString("INSIRA O NOME DO PACOTE: "),
                Reader.lerInt("INFORME A QUANTIDADE DE MÉTODOS: ")
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
        }while(sistemaDeArquivos.validarSeNomeExiste(nome) || nome.isEmpty() || nome.isBlank());

        return new C(
                nome,
                Reader.lerInt("INSIRA A QUANTIDADE DE LINHAS DESTE CÓDIGO: "),
                Reader.lerInt("INFORME A QUANTIDADE DE BIBLIOTECAS: "),
                Reader.lerInt("INFORME A QUANTIDADE DE FUNÇÕES: ")
        );
    }

    public static void alimentarArrayDotNet(SistemaDeArquivos sistemaDeArquivos){
        boolean continuar = true;

        while(continuar){
            sistemaDeArquivos.adicionar(cadastrarDotNet(sistemaDeArquivos));

            continuar = Reader.lerBoolean("DESEJA CONTINUAR COM O CADASTRO? [S]SIM [N]NÃO: ", "DIGITE SOMENTE [S]SIM [N]NÃO", "S", "N");
        }
    }

    public static void alimentarArrayC(SistemaDeArquivos sistemaDeArquivos){
        boolean continuar = true;

        while(continuar){
sistemaDeArquivos.adicionar(cadastrarC(sistemaDeArquivos));

            continuar = Reader.lerBoolean("DESEJA CONTINUAR COM O CADASTRO? [S]SIM [N]NÃO: ", "DIGITE SOMENTE [S]SIM [N]NÃO", "S", "N");
        }
    }

    public static void alimentarArquivo(SistemaDeArquivos sistemaDeArquivos){



        }



}
