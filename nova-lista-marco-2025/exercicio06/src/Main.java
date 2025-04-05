public class Main {
    public static void main(String[] args) {
        UnidadeAdministrativa unidadeAdministrativa = new UnidadeAdministrativa();
        Acao acao = new Acao();

        boolean sair;

        View.cadastrar(unidadeAdministrativa);
        Printer.print(unidadeAdministrativa);
        Printer.printPriorityActions(unidadeAdministrativa);
        Printer.printThirdQuarterActions(unidadeAdministrativa);
        Printer.printQtdAcoes(unidadeAdministrativa);
    }
}