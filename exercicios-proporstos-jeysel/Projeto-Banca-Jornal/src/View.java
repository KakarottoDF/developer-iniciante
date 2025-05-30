import javax.swing.*;

public class View {
    private static final String REVISTA = "ISTO É";

    public static Endereco cadastrarEndereco(){
        return new Endereco(
                Reader.lerString("Digite o endereço: "),
                Reader.lerString("Digite a cidade: "),
                Reader.lerString("Digite o estado: "),
                Reader.lerString("Digite o CEP: ")
        );
    }

    public static Morador cadastrarMoradores(GerenciadorBanca gerenciadorBanca){
        String nome;
        String telefone;
        String resposta;

        do{
            nome = Reader.lerString("Digite o nome do morador: ");
            if(gerenciadorBanca.moradorExiste(nome)){
                JOptionPane.showMessageDialog(null, "ESTE MORADOR JÁ ESTÁ CADASTRADO. CADASTRE OUTRO", "SISTEMA GERENCIAMENTO DE BANCAS", JOptionPane.INFORMATION_MESSAGE);
            }
        }while(gerenciadorBanca.revistaExiste(nome));

        telefone = Reader.lerString("Digite o telefone do morador: ");
        resposta = Reader.lerString(
                "Qual é a região deste morador?\n[1] " + Regiao.CNB + "\n[2] " + Regiao.QNA,
                "Digite somente:\n[1] " + Regiao.CNB + "\n[2] " + Regiao.QNA,
                1, 2
        );

        Regiao regiao = resposta.equals("1") ? Regiao.CNB : Regiao.QNA;

        return new Morador(nome, cadastrarEndereco(), telefone, regiao);
    }

    public static Revista cadastrarRevista(GerenciadorBanca gerenciadorBanca){
        String nome;
        do{
            nome = Reader.lerString("Informe o nome da revista");
            if(gerenciadorBanca.revistaExiste(nome)){
                JOptionPane.showMessageDialog(null, "ESTA REVISTA JÁ ESTÁ CADASTRADA. CADASTRE OUTRA", "SISTEMA GERENCIAMENTO DE BANCAS", JOptionPane.INFORMATION_MESSAGE);
            }
        }while(gerenciadorBanca.revistaExiste(nome));

        return new Revista(
                nome,
                Reader.lerDouble("Digite o valor dessa revista R$ "),
                Reader.lerInt("Informe a quantidade de revistas: ")
        );
    }

    public static Banca cadastrarBanca(GerenciadorBanca gerenciadorBanca) {
        String nomeBanca = Reader.lerString("Digite o nome da banca: ");
        Endereco endereco = cadastrarEndereco();
        Banca banca = new Banca(nomeBanca, endereco);

        boolean adicionarMaisRevistas = true;
        while (adicionarMaisRevistas) {
            Revista revista = cadastrarRevista(gerenciadorBanca);

            // Adiciona observadores
            for (Morador morador : gerenciadorBanca.getListaMoradores()) {
                revista.addObserver(morador);
            }

            // Adiciona à banca
            banca.adicionarRevista(revista);

            // Notifica se for ISTO É
            if (revista.getNome().equalsIgnoreCase("ISTO É")) {
                revista.mudaEstado();
            }

            adicionarMaisRevistas = Reader.lerBoolean(
                    "Deseja adicionar outra revista para esta banca? [S]SIM [N]NÃO: ",
                    "DIGITE SOMENTE [S]SIM [N]NÃO", "S", "N"
            );
        }

        return banca;
    }


    public static void alimentarArrayMorador(GerenciadorBanca gerenciadorBanca){
        boolean continuar = true;

        while(continuar) {
            gerenciadorBanca.adicionar(cadastrarMoradores(gerenciadorBanca));
            continuar = Reader.lerBoolean("DESEJA CONTINUAR COM O CADASTRO? [S]SIM [N]NÃO: ", "DIGITE SOMENTE [S]SIM [N]NÃO", "S", "N");
        }
    }

    public static void alimentarArrayBanca(GerenciadorBanca gerenciadorBanca) {
        boolean continuar = true;

        while (continuar) {
            Banca banca = cadastrarBanca(gerenciadorBanca);
            gerenciadorBanca.adicionar(banca);

            continuar = Reader.lerBoolean(
                    "Deseja cadastrar outra banca? [S]SIM [N]NÃO: ",
                    "DIGITE SOMENTE [S]SIM [N]NÃO", "S", "N"
            );
        }
    }


}
