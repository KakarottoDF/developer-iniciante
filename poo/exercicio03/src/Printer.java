import java.util.ArrayList;

public class Printer {
    public static void imprimirLaboratorios(GerenciadorLaboratorio gerenciadorLaboratorio){
        System.out.println(gerenciadorLaboratorio);
    }

    public static void imprimirLaboratoriosSomenteAnalistas(GerenciadorLaboratorio gerenciadorLaboratorio) {
        System.out.println("----- LISTA DE ANALISTAS DOS LABORATÓRIOS -----");
        for (Laboratorio laboratorio : gerenciadorLaboratorio.getLaboratorios()) {
            for (ResponsavelTecnico responsavelTecnico : laboratorio.getResponsaveisTecnicos()) {
                if (responsavelTecnico.getCargo() == 2) {
                    System.out.println(laboratorio);
                }
            }
        }
    }

    public static void imprimirQuantidadeItensTecnologia(GerenciadorLaboratorio gerenciadorLaboratorio){
        System.out.println("A quantidade de itens de TECNOLOGIA é de " + gerenciadorLaboratorio.contarTipo(1));
    }

    public static void imprimirCustoTotalDosLaboratorios(GerenciadorLaboratorio gerenciadorLaboratorio){
        System.out.println("O custo total dos laboratórios é de R$ " + gerenciadorLaboratorio.custoTotalLaboratorios());
    }

    public static void imprimirLocalidadeEQuantitivoDeItens(GerenciadorLaboratorio gerenciadorLaboratorio) {
        System.out.println("----- LISTA DE LOCALIDADE E QUANTITATIVO DE ITENS DOS LABORATÓRIOS -----");

        ArrayList<String> locaisJaImpressos = new ArrayList<>();

        for (Laboratorio laboratorio : gerenciadorLaboratorio.getLaboratorios()) {
            String local = laboratorio.getLocal();

            // Verifica se já imprimimos este local
            if (!locaisJaImpressos.contains(local)) {
                int totalItens = 0;

                // Soma os itens de todos os laboratórios com este local
                for (Laboratorio lab : gerenciadorLaboratorio.getLaboratorios()) {
                    if (lab.getLocal().equals(local)) {
                        totalItens += lab.contarItensByLaboratorio(local);
                    }
                }

                System.out.println("Local: " + local);
                System.out.println("Quantidade de itens: " + totalItens);
                System.out.println("------------------------");

                locaisJaImpressos.add(local); // Marca como já impresso
            }
        }
    }

    /*public static void imprimirLocalidadeEQuantitivoDeItens(GerenciadorLaboratorio gerenciadorLaboratorio) {
        System.out.println("----- LISTA DE LOCALIDADE DOS LABORATÓRIOS -----");

        for (Laboratorio laboratorio : gerenciadorLaboratorio.getLaboratorios()) {
            String local = laboratorio.getLocal();

            if (local != null) {
                System.out.println("Local: " + local);
                System.out.println("A quantidade de itens neste laboratório é de " + laboratorio.contarItensByLaboratorio(laboratorio.getLocal()));
            }
        }
    }*/
}
