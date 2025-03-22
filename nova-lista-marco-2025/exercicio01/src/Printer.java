public class Printer {

    public void printerEmpresas(Anatel anatel){
        if (anatel.franquias == null || anatel.franquias.length == 0) {
            System.out.println("Nenhuma franquia cadastrada.");
        }

        System.out.println("Lista de franquias cadastradas:\n");
        for (Franquia franquia : anatel.franquias) {
            System.out.println(franquia.toString());
            System.out.println("-------------------------");
        }
    }

    public void printarFranquiaMaisBarata(Anatel anatel){
        System.out.println("A franquia mais barata é: " + anatel.franquiaMaisBarata());
    }

    public void printEmpresaOferecida(Anatel anatel){
        int qtdVivo = anatel.contarFranquiasPorEmpresa("VIVO");
        System.out.println("A quantidade de empresas oferecidas pela VIVO são " + qtdVivo);
    }

    public void printEmpresasPorGB(Anatel anatel){
        int qtdGb = anatel.contarFranquiasporGB(2);
        System.out.println("A quantidade de franquias que vão fornecer mais de 2GB é igual a " + qtdGb);
    }

    public void printMediaDasFranquias(Anatel anatel){
        double media = anatel.mediaFranquias();
        System.out.println("O preço médio das franquias é igual a R$ " + media);
    }

}
