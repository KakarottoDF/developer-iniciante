import java.util.ArrayList;

public class Printer {

    public static void mostrarSistemasOrdenados(Sistema sistema) {
        ArrayList<Sistema> todosSistemas = new ArrayList<>();
        todosSistemas.addAll(sistema.getAdministrativos());
        todosSistemas.addAll(sistema.getCorporativos());

        for (int i = 0; i < todosSistemas.size(); i++) {
            for (int j = i + 1; j < todosSistemas.size(); j++) {
                int funcionarios1 = calcularFuncionarios(todosSistemas.get(i));
                int funcionarios2 = calcularFuncionarios(todosSistemas.get(j));

                if (funcionarios1 > funcionarios2) {
                    Sistema temp = todosSistemas.get(i);
                    todosSistemas.set(i, todosSistemas.get(j));
                    todosSistemas.set(j, temp);
                }
            }
        }

        for (Sistema sys : todosSistemas) {
            System.out.println(sys);
        }
    }

    private static int calcularFuncionarios(Sistema sistema) {

        if (sistema instanceof Administrativo) {
            return ((Administrativo) sistema).calcularFuncionarios();
        } else if (sistema instanceof Corporativo) {
            return ((Corporativo) sistema).calcularFuncionarios();
        }
        return 0;
    }

    public static void sistemaMaisFuncionarios(Sistema sistema) {
        Sistema maior = null;
        int maxFuncionarios = 0;

        for (Sistema sys : sistema.getAdministrativos()) {
            int funcionarios = calcularFuncionarios(sys);
            if (funcionarios > maxFuncionarios) {
                maxFuncionarios = funcionarios;
                maior = sys;
            }
        }

        for (Sistema sys : sistema.getCorporativos()) {
            int funcionarios = calcularFuncionarios(sys);
            if (funcionarios > maxFuncionarios) {
                maxFuncionarios = funcionarios;
                maior = sys;
            }
        }

        System.out.println("Sistema com mais funcionários: " + maior);
    }

    public static void sistemaResponsavelEduardo(Sistema sistema) {
        boolean encontrado = false;

        for (Sistema sys : sistema.getAdministrativos()) {
            if (sys.getNomeResponsavel().contains("Eduardo")) {
                System.out.println("Sistema com responsável Eduardo: " + sys);
                encontrado = true;
            }
        }

        for (Sistema sys : sistema.getCorporativos()) {
            if (sys.getNomeResponsavel().contains("Eduardo")) {
                System.out.println("Sistema com responsável Eduardo: " + sys);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhum sistema encontrado com responsável Eduardo.");
        }
    }
}
