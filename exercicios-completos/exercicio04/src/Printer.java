import java.util.ArrayList;

public class Printer {

    public static void imprimirRelatorioFinal(Atleta atleta) {
        ArrayList<Atleta> todos = AtletaService.getTodosAtletas(atleta);
        ArrayList<Atleta> ordenados = AtletaService.ordenarPorCusto(todos);

        System.out.println("\n--- TODOS OS ATLETAS ORDENADOS POR CUSTO ---");
        for (Atleta a : ordenados) {
            System.out.println(a);
            System.out.println("Custo: R$ " + a.calcularCusto());
            System.out.println("-----------------------------");
        }

        Atleta menor = AtletaService.getMenorCusto(ordenados);
        if (menor != null) {
            System.out.println("\n--- ATLETA COM MENOR CUSTO ---");
            System.out.println(menor);
            System.out.println("Custo: R$ " + menor.calcularCusto());
        }

        double total = AtletaService.calcularCustoTotal(ordenados);
        System.out.println("\nTOTAL DE CUSTO PARA O COMITÊ OLÍMPICO BRASILEIRO: R$ " + total);

        ArrayList<Atleta> mulheres = AtletaService.filtrarMulheres(ordenados);
        System.out.println("\n--- ATLETAS MULHERES ---");
        for (Atleta m : mulheres) {
            System.out.println(m);
            System.out.println("Custo: R$ " + m.calcularCusto());
            System.out.println("-----------------------------");
        }
    }
}
