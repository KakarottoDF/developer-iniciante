public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader();
        GerenciarAtleta gerenciarAtleta = new GerenciarAtleta();

        reader.preencherAtletas(gerenciarAtleta);
        Printer.imprimirAtletas(gerenciarAtleta);
    }
}