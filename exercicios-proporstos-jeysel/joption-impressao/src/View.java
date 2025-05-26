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
          Reader.lerInt("Informe o telefone: ")
        );
    }

    public static void cadastrarPessoa(GerenciarPessoas gerenciarPessoas){
        gerenciarPessoas.adicionar(alimentarArrayPessoa());
    }
}
