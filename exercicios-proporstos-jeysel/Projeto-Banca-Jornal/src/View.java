import javax.swing.*;

public class View {

    public Endereco cadastrarEndereco(){
        return new Endereco(
                Reader.lerString("Digite o endereço: "),
                Reader.lerString("Digite a cidade: "),
                Reader.lerString("Digite o estado: "),
                Reader.lerString("Digite o CEP: ")
        );
    }

    public Morador cadastrarMoradores(){
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
}
