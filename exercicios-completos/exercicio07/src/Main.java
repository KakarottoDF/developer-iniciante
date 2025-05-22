public class Main {
    public static void main(String[] args) {
        ControleDeAtosAdministrativos controleDeAtosAdministrativos = new ControleDeAtosAdministrativos();

        View.cadastrarAtoAdministrativo(controleDeAtosAdministrativos);
        Printer.listarTodosAtosAdministrativos(controleDeAtosAdministrativos);


    }
}