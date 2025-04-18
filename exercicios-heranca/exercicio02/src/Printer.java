public class Printer {
    public static void imprimirFuncionarios(Universidade universidade){
        System.out.println("------- LISTA DE FUNCIONÁRIOS DA UNIVERSIDADE -------");
        System.out.println(universidade);
    }

    public static void imprimirProfessor(Universidade universidade){
        System.out.println("------- LISTA DE PROFESSORES -------");
        System.out.println(universidade.getProfessor());
    }
}
