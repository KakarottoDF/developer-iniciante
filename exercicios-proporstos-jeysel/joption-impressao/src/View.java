public class View {

    public static Endereco alimentarEndereco() {
        return new Endereco(
                Reader.lerString("Informe o endereço: "),
                Reader.lerString("Informe a cidade: "),
                Reader.lerString("Informe o estado: ")
        );
    }
    public static Pessoa alimentarArrayPessoa(){

        return new Pessoa(
          Reader.lerString("Informe o nome da pessoa: "),
          Reader.lerInt("Informe a matrícula: "),
          alimentarEndereco(),
          Reader.lerString("Informe o telefone: ")
        );
    }

    public static void cadastrarPessoa(GerenciarPessoas gerenciarPessoas) {
        boolean flag;
        do {
            gerenciarPessoas.adicionar(alimentarArrayPessoa());
            flag = Reader.lerBoolean("DESEJA ENCERRAR O PROGRAMA? [S]SIM [N]NÃO", "DIGITE SOMENTE [S]SIM [N]NÃO", "S", "N");
        }while (!flag);
    }
}
