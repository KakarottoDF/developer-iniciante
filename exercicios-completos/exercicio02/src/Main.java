//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        GerenciadorDePessoas gerenciadorDePessoas = new GerenciadorDePessoas();

        View.cadastrar(gerenciadorDePessoas);

        Printer.imprimirProfessores(gerenciadorDePessoas);
        Printer.imprimirNomeComPalavraEspecifica(gerenciadorDePessoas);
        Printer.imprimirDoutores(gerenciadorDePessoas);


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}