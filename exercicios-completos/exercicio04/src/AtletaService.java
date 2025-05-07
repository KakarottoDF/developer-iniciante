import java.util.ArrayList;

public class AtletaService {

    public static ArrayList<Atleta> getTodosAtletas(Atleta atleta) {
        ArrayList<Atleta> todos = new ArrayList<>();
        todos.addAll(atleta.getOlimpicos());
        todos.addAll(atleta.getParaolimpicos());
        return todos;
    }

    public static ArrayList<Atleta> ordenarPorCusto(ArrayList<Atleta> atletas) {
        for (int i = 0; i < atletas.size() - 1; i++) {
            for (int j = i + 1; j < atletas.size(); j++) {
                if (atletas.get(i).calcularCusto() > atletas.get(j).calcularCusto()) {
                    Atleta temp = atletas.get(i);
                    atletas.set(i, atletas.get(j));
                    atletas.set(j, temp);
                }
            }
        }
        return atletas;
    }

    public static double calcularCustoTotal(ArrayList<Atleta> atletas) {
        double total = 0;
        for (Atleta a : atletas) {
            total += a.calcularCusto();
        }
        return total;
    }

    public static Atleta getMenorCusto(ArrayList<Atleta> atletas) {
        if (atletas.isEmpty()) return null;
        Atleta menor = atletas.get(0);
        for (Atleta a : atletas) {
            if (a.calcularCusto() < menor.calcularCusto()) {
                menor = a;
            }
        }
        return menor;
    }

    public static ArrayList<Atleta> filtrarMulheres(ArrayList<Atleta> atletas) {
        ArrayList<Atleta> mulheres = new ArrayList<>();
        for (Atleta a : atletas) {
            if (a.getSexo() == 'F') {
                mulheres.add(a);
            }
        }
        return mulheres;
    }
}
