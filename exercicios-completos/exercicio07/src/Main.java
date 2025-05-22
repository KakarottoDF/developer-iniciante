public class Main {
    public static void main(String[] args) {
        ControleDeAtosAdministrativos controleDeAtosAdministrativos = new ControleDeAtosAdministrativos();

        View.cadastrarFacultativo(controleDeAtosAdministrativos);
        View.cadastrarTecnico(controleDeAtosAdministrativos);
        Printer.listarTodosAtosAdministrativos(controleDeAtosAdministrativos);


    }
}