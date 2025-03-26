import java.util.Scanner;

public class Reader{
    public static String lerString(){
        return new Scanner(System.in).nextLine().toUpperCase();
    }

    public static String lerString(String msg){
        System.out.println(msg);
        return lerString();
    }

    public static String lerString(String msg, String msgError, String entrada, String saida){
        String leitor;

        do{
            leitor = lerString(msg);
            if(!leitor.equals(entrada) || !leitor.equals(saida)){
                System.out.println(msgError);
            }
        }while(!leitor.equals(entrada) && !leitor.equals(saida));
        return leitor;
    }

    public static boolean lerBoolean(){
        return new Scanner(System.in).nextBoolean();
    }

    public static boolean lerBoolean(String msg){
        System.out.println(msg);
        return lerBoolean();
    }

    public static boolean lerBoolean(String msg, String msgError, String entrada, String saida){
        String leitor;
        boolean resultado = true;

        do{
            leitor = lerString(msg);
            if(!leitor.equals(entrada) && !leitor.equals(saida)){
                System.out.println(msgError);
            }else{
                if(leitor.equals(entrada)){
                    resultado = true;
                }else{
                    if(leitor.equals(saida)){
                        resultado = false;
                    }
                }
            }
        }while(!leitor.equals(entrada) && !leitor.equals(saida));
        return resultado;
    }

    public static int lerInt(){
        return new Scanner(System.in).nextInt();
    }

    public static int lerInt(String msg){
        System.out.println(msg);
        return lerInt();
    }

    public static int lerInt(String msg, String msgError, int min, int max){
        int leitor;

        do{
            leitor = lerInt(msg);
            if(leitor < min || leitor > max) {
                System.out.println(msgError);
            }
        }while(leitor < min || leitor > max);
        return leitor;
    }

    public static double lerDouble(){
        return new Scanner(System.in).nextDouble();
    }

    public static double lerDouble(String msg){
        System.out.println(msg);
        return lerDouble();
    }

    public GerenciarPlacas preencherPlacas(GerenciarPlacas gerenciarPlacas){
        int quantidadeDePlacas = 10;
        int contadorPlacas = 0;
        boolean flag;

        gerenciarPlacas.placas = new Placas[quantidadeDePlacas];
        do {
            Placas novaPlaca = new Placas();
            do {
                novaPlaca.codigoFabricante = lerString("Informe o número do fabricante: ");
            }while(novaPlaca.isCodigoFaricante() || gerenciarPlacas.placasRepetidas(novaPlaca));
            novaPlaca.qtdPinosDigitais = lerInt("Informe a quantidade de pinos digitais da placa: ");
            novaPlaca.sinaisMLP = lerBoolean("Essa placa tem sinal MLP? [S]Sim [N]Não", "Digite somente: [S]Sim [N]Não", "S", "N");
            novaPlaca.qtdEntradasAnalogicas = lerInt("Informe a quantidade de entradas analógicas da placa: ");
            novaPlaca.precoBase = lerDouble("Qual é o preço base dessa placa? R$ ");

            if (contadorPlacas == gerenciarPlacas.placas.length) {
                Placas[] novoArray = new Placas[gerenciarPlacas.placas.length * 2];

                for (int i = 0; i < gerenciarPlacas.placas.length; i++) {
                    novoArray[i] = gerenciarPlacas.placas[i];
                }

                gerenciarPlacas.placas = novoArray;
            }

            gerenciarPlacas.placas[contadorPlacas] = novaPlaca;
            contadorPlacas++;

            flag = lerBoolean("Deseja cadastrar outra placa? [S]Sim [N]Não ", "Digite somente [S]Sim [N]Não", "S", "N");
        }while(flag);
        return gerenciarPlacas;
    }

}
