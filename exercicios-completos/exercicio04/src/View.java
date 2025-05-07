import java.util.Scanner;

public class View {

    public static Olimpico cadastrarOlimpico() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome do atleta olímpico: ");
        String nome = sc.nextLine();
        System.out.print("Sexo: [M]Masculino [F]Feminino: ");
        char sexo = sc.next().charAt(0);
        System.out.print("Informe a idade do atleta: ");
        int idade = sc.nextInt();
        System.out.print("Informe o número do atleta: ");
        int numero = sc.nextInt();
        System.out.print("Informe a quantidade de títulos mundiais do atleta: ");
        int titulos = sc.nextInt();

        return new Olimpico(nome, sexo, idade, numero, titulos);
    }

    public static Paraolimpico cadastrarParaolimpico() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome do atleta paraolímpico: ");
        String nome = sc.nextLine();
        System.out.print("Sexo: [M]Masculino [F]Feminino: ");
        char sexo = sc.next().charAt(0);
        System.out.print("Informe a idade do atleta: ");
        int idade = sc.nextInt();
        System.out.print("Informe o número do atleta: ");
        int numero = sc.nextInt();
        System.out.print("Informe o nome do responsável: ");
        sc.nextLine(); // Consumir a quebra de linha pendente
        String responsavel = sc.nextLine();

        return new Paraolimpico(nome, sexo, idade, numero, responsavel);
    }

    public static void cadastrar(Atleta atleta) {
        boolean continuar = true;
        while (continuar) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite 1 para cadastrar um atleta Olímpico");
            System.out.println("Digite 2 para cadastrar um atleta Paraolímpico: ");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    atleta.adicionar(cadastrarOlimpico());
                    break;
                case 2:
                    atleta.adicionar(cadastrarParaolimpico());
                    break;
                default:
                    System.out.println("Opção inválida!");
                    continue;
            }

            System.out.print("Deseja continuar? [S]Sim [N]Não: ");
            char resposta = sc.next().charAt(0);
            if (resposta == 'N' || resposta == 'n') {
                continuar = false;
            }
        }
    }
}
