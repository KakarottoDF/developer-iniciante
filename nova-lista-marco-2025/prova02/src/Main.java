public class Main {
    public static void main(String[] args) {

        Pasta pasta = new Pasta();
        boolean continuar;

        do {
            Printer.menu();
            int escolha = Reader.lerInt("Escolha uma opção: ");

            switch (escolha) {
                case 1:
                    Pasta novaPasta = View.cadastrarPasta();
                    pasta = novaPasta;
                    break;
                case 2:
                    Printer.print(pasta);
                    break;
                case 3:
                    Printer.printDocumentos(pasta);
                    break;
                case 4:
                    Printer.printDocumentosPorAno(pasta, 2021);
                    break;
                case 5:
                    int tamanhoTotal = Pasta.calcularTamanhoTotal(pasta);
                    System.out.println("Tamanho total de armazenamento: " + tamanhoTotal + " bytes");
                    break;
                case 6:
                    String extensao = Reader.lerString("Digite a extensão dos documentos (ex: pdf, png): ");
                    Printer.printDocumentosPorExtensao(pasta, extensao);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            continuar = Reader.lerBoolean("Deseja Encerrar o Programa? [1]Sim [2]Não", "Digite somente 1 ou 2", 1, 2);
        } while (continuar);
    }
}