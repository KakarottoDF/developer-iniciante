public class Printer {
    public static void imprimirFuncionarios(Universidade universidade){
        System.out.println("Lista do Funcionário da Universidade");
        System.out.println(universidade);
    }

    public static void imprimirProfessor(Universidade universidade){
        System.out.println("Lista de Professores");
        System.out.println(universidade.getProfessor());
    }
}
