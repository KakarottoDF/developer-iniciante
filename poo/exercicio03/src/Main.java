public class Main {
    public static void main(String[] args) {
        GerenciadorLaboratorio gerenciadorLaboratorio = new GerenciadorLaboratorio();

        View.cadastrar(gerenciadorLaboratorio);
        Printer.imprimirLaboratorios(gerenciadorLaboratorio);
        Printer.imprimirLaboratoriosSomenteAnalistas(gerenciadorLaboratorio);
        Printer.imprimirQuantidadeItensTecnologia(gerenciadorLaboratorio);
        Printer.imprimirCustoTotalDosLaboratorios(gerenciadorLaboratorio);
    }
}