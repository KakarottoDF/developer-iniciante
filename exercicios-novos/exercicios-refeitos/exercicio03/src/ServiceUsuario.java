public class ServiceUsuario{

    public static Usuario popularArray(Usuario usuario){
        for(int i = 0; i < usuario.valores.length; i++){
            usuario.valores[i] = Leitor.lerInt("Digite o " + (i + 1) + "º valor: ", "Valor inválido. O número tem que ser positivo.", 0);
        }
        return usuario;
    }

    public static double mediaValores(Usuario usuario){
        double media = 0.0;
        double somarValores = 0;
        for(int i = 0; i < usuario.valores.length; i++){
            somarValores += usuario.valores[i];
        }
        return media = somarValores / usuario.valores.length;
    }

    public static int valoresImpares(Usuario usuario){
        int impares = 0;
        for(int i = 0; i < usuario.valores.length; i++){
            if(usuario.valores[i] % 2 != 0){
                impares ++;
            }
        }
        return impares;
    }

}
