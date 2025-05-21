public class View{
    public static DotNet alimentarArrayDotNet(SistemaDeArquivos sistemaDeArquivos){
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

    public static LinguagemC alimentarArrayC(SistemaDeArquivos sistemaDeArquivos){
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

        return new LinguagemC(
                nome,
                Reader.lerInt("INSIRA A QUANTIDADE DE LINHAS DESTE CÓDIGO: "),
                Reader.lerInt("INFORME A QUANTIDADE DE BIBLIOTECAS: "),
                Reader.lerInt("INFORME A QUANTIDADE DE FUNÇÕES: ")
        );
    }

    public static void cadastrarDotNet(SistemaDeArquivos sistemaDeArquivos){
        boolean continuar = true;

        while(continuar){
            sistemaDeArquivos.adicionar(alimentarArrayDotNet(sistemaDeArquivos));

            continuar = Reader.lerBoolean("DESEJA CONTINUAR COM O CADASTRO? [S]SIM [N]NÃO: ", "DIGITE SOMENTE [S]SIM [N]NÃO", "S", "N");
        }
    }

    public static void cadastrarLinguagemC(SistemaDeArquivos sistemaDeArquivos){
        boolean continuar = true;

        while(continuar) {

            sistemaDeArquivos.adicionar(alimentarArrayC(sistemaDeArquivos));

            continuar = Reader.lerBoolean("DESEJA CONTINUAR COM O CADASTRO? [S]SIM [N]NÃO: ", "DIGITE SOMENTE [S]SIM [N]NÃO", "S", "N");
        }
    }
}
