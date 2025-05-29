import javax.swing.*;

public class View {

    public static Endereco cadastrarEndereco(){
        return new Endereco(
                Reader.lerString("Digite o endereço: "),
                Reader.lerString("Digite a cidade: "),
                Reader.lerString("Digite o estado: "),
                Reader.lerString("Digite o CEP: ")
        );
    }

    public static Morador cadastrarMoradores(){
        String resposta = Reader.lerString(
                "Qual é a região deste morador?\n[1] " + Regiao.CNB + "\n[2] " + Regiao.QNA,
                "Digite somente:\n[1] " + Regiao.CNB + "\n[2] " + Regiao.QNA,
                1, 2
        );

        Regiao regiao = resposta.equals("1") ? Regiao.CNB : Regiao.QNA;

        return new Morador(
                Reader.lerString("Digite o nome do morador: "),
                cadastrarEndereco(),
                Reader.lerString("Digite o telefone do morador: "),
                regiao
        );
    }

    public static Revista cadastrarRevista(){
        return new Revista(
                Reader.lerString("Informe o nome da revista"),
                Reader.lerDouble("Digite o valor dessa revista R$ "),
                Reader.lerInt("Informe a quantidade de revistas: ")
        );
    }

    public static Banca cadastrarBanca(){
        return new Banca(
                Reader.lerString("Digite o nome da banca: "),
                cadastrarEndereco(),
                cadastrarRevista()
        );
    }

    public static void alimentarArrayMorador(GerenciadorBanca gerenciadorBanca){
        boolean continuar = true;

        while(continuar) {
            gerenciadorBanca.adicionar(cadastrarMoradores());
            continuar = Reader.lerBoolean("DESEJA CONTINUAR COM O CADASTRO? [S]SIM [N]NÃO: ", "DIGITE SOMENTE [S]SIM [N]NÃO", "S", "N");
        }
    }

    public static void alimentarArrayBanca(GerenciadorBanca gerenciadorBanca){
        boolean continuar = true;

        while(continuar) {
            gerenciadorBanca.adicionar(cadastrarBanca());
            continuar = Reader.lerBoolean("DESEJA CONTINUAR COM O CADASTRO? [S]SIM [N]NÃO: ", "DIGITE SOMENTE [S]SIM [N]NÃO", "S", "N");
        }
    }
}
