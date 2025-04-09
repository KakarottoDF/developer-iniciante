public class Printer{
    public static void imprimirFranquias(Anatel anatel){
        System.out.println(anatel.getFranquias());
    }

    public static void imprimirFranquiaMaisBarata(Anatel anatel){
        System.out.println("A franquia mais barata é: " + anatel.franquiaMaisBarata());
    }

    public static void imprimirQtdFranquias(Anatel anatel){
        System.out.println("A quantidade de franquias oferecidas pela VIVO é de " + anatel.contarQuantidadeDeFranquias(Main.NOME_FRANQUIA));
    }

    public static void imprimirQtdGigas(Anatel anatel){
        System.out.println("A quantidade de franquias que vão fornecer mais de 2GB é de " + anatel.contarQuantidadeDeFranquias(Main.QTD_GIGA));
    }

    public static void imprimirMedia(Anatel anatel){
        System.out.println("A média de preço das franquias é de R$ " + anatel.media());
    }
}
