public class Printer {
    public static void imprimirFuncionarios(Escola escola){
        System.out.println("------- LISTA DE FUNCIONÁRIOS DA ESCOLA -------");
        System.out.println(escola);
    }

    public static void imprimirProfessor(Escola escola){
        System.out.println("------- LISTA DE PROFESSORES -------");
        System.out.println(escola.getProfessor());
    }
}
