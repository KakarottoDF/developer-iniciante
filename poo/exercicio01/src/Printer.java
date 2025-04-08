public class Printer{
    public static void imprimirFranquias(Anatel anatel){
        System.out.println(anatel.getFranquia());
    }

    public static void imprimirFranquiaMaisBarata(Anatel anatel){
        System.out.println("A franquia mais barata é: " + Franquia.franquiaMaisBarata(anatel));
    }

    public static void imprimirQtdFranquias(Anatel anatel){
        System.out.println("A quantidade de franquias oferecidas pela VIVO é de " + Franquia.qtdFranquias(anatel, new Franquia().getNOME_FRANQUIA()));
    }

    public static void imprimirQtdGigas(Anatel anatel){
        System.out.println("A quantidade de franquias que vão fornecer mais de 2GB é de " + Franquia.qtdFranquias(anatel, new Franquia().getQTD_GIGA()));
    }

    public static void imprimirMedia(Anatel anatel){
        System.out.println("A média de preço das franquias é de R$ " + Franquia.media(anatel));
    }
}
