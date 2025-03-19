public class Printer {
    public static void printarValores(Usuario usuario){

        System.out.println("VALORES QUE FORAM INFORMADOS:");
        for(int i = 0; i < usuario.valores.length; i++){
            System.out.print("[" + usuario.valores[i] + "] ");
        }

        System.out.println();
    }

    public static void printarMedia(Usuario usuario){
        System.out.println("A media dos valores foi " + ServiceUsuario.mediaValores(usuario));
    }

    public static void printarNumerosImpares(Usuario usuario){
        System.out.println("Foram digitados " + ServiceUsuario.valoresImpares(usuario) + " número ímpares.");
    }

}
