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
}
