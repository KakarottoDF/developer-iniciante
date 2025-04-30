import java.util.ArrayList;

public class Printer {

    public static void mostrarSistemasOrdenados(Sistema sistema) {
        ArrayList<Sistema> todosSistemas = new ArrayList<>();  // Corrigido: ArrayListt -> ArrayList
        todosSistemas.addAll(sistema.getAdministrativos());
        todosSistemas.addAll(sistema.getCorporativos());

        // Ordenação manual (como já mostrado anteriormente)
        for (int i = 0; i < todosSistemas.size(); i++) {
            for (int j = i + 1; j < todosSistemas.size(); j++) {
                int funcionarios1 = calcularFuncionarios(todosSistemas.get(i));
                int funcionarios2 = calcularFuncionarios(todosSistemas.get(j));

                // Se o número de funcionários do j for menor que o do i, trocamos
                if (funcionarios1 > funcionarios2) {
                    Sistema temp = todosSistemas.get(i);
                    todosSistemas.set(i, todosSistemas.get(j));
                    todosSistemas.set(j, temp);
                }
            }
        }

        // Exibe os sistemas ordenados
        for (Sistema sys : todosSistemas) {
            System.out.println(sys);
        }
    }

    private static int calcularFuncionarios(Sistema sistema) {
        // Verifica o tipo de sistema (Administrativo ou Corporativo) e calcula os funcionários
        if (sistema instanceof Administrativo) {
            return ((Administrativo) sistema).calcularFuncionarios();
        } else if (sistema instanceof Corporativo) {
            return ((Corporativo) sistema).calcularFuncionarios();
        }
        return 0;  // Caso o sistema não seja de nenhum tipo conhecido
    }

    public static void sistemaMaisFuncionarios(Sistema sistema) {
        Sistema maior = null;
        int maxFuncionarios = 0;

        // Verifica os sistemas administrativos
        for (Sistema sys : sistema.getAdministrativos()) {
            int funcionarios = calcularFuncionarios(sys);
            if (funcionarios > maxFuncionarios) {
                maxFuncionarios = funcionarios;
                maior = sys;
            }
        }

        // Verifica os sistemas corporativos
        for (Sistema sys : sistema.getCorporativos()) {
            int funcionarios = calcularFuncionarios(sys);
            if (funcionarios > maxFuncionarios) {
                maxFuncionarios = funcionarios;
                maior = sys;
            }
        }

        // Exibe o sistema com o maior número de funcionários
        System.out.println("Sistema com mais funcionários: " + maior);
    }

    public static void sistemaResponsavelEduardo(Sistema sistema) {
        boolean encontrado = false;

        // Verifica nos sistemas administrativos
        for (Sistema sys : sistema.getAdministrativos()) {
            if (sys.getNomeResponsavel().contains("Eduardo")) {
                System.out.println("Sistema com responsável Eduardo: " + sys);
                encontrado = true;
            }
        }

        // Verifica nos sistemas corporativos
        for (Sistema sys : sistema.getCorporativos()) {
            if (sys.getNomeResponsavel().contains("Eduardo")) {
                System.out.println("Sistema com responsável Eduardo: " + sys);
                encontrado = true;
            }
        }

        // Caso não encontre nenhum sistema com o responsável Eduardo
        if (!encontrado) {
            System.out.println("Nenhum sistema encontrado com responsável Eduardo.");
        }
    }
}
