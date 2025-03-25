import java.util.Scanner;

public class Reader{
    public static String lerString(){
        return new Scanner(System.in).nextLine().toUpperCase();
    }

    public static String lerString(String msg){
        System.out.println(msg);
        return lerString();
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

    public static double lerDouble(){
        return new Scanner(System.in).nextDouble();
    }

    public static double lerDouble(String msg){
        System.out.println(msg);
        return lerDouble();
    }

    public Placas[] permitirCadastroIndeterminado() {
        Placas[] listaDasPlacas = new Placas[1];
        int contador = 0;

        while(true) {
            if (contador == listaDasPlacas.length) {
                Placas[] placasTemporarias = new Placas[listaDasPlacas.length * 2];

                for (int i = 0; i < listaDasPlacas.length; i++) {
                    placasTemporarias[i] = listaDasPlacas[i];
                }

                listaDasPlacas = placasTemporarias;
            }

            return listaDasPlacas;
        }
    }

    public Placas[] preencherPlacas() {
        Placas[] placasList = permitirCadastroIndeterminado();

        boolean resposta;

        while (true) {
            Placas placa = new Placas();

            placa.codigoFabricante = lerString("Digite o código do fabricante da placa:");
            placa.qtdPinosDigitais = lerInt("Digite a quantidade de pinos digitais:");
            placa.sinaisMLP = lerBoolean("A placa possui sinais MLP? [S]Sim [N]Não:", "Digite [S]Sim [N]Não", "S", "N");
            placa.qtdEntradasAnalogicas = lerInt("Digite a quantidade de entradas analógicas:");
            placa.precoBase = lerDouble("Digite o preço base da placa:");

            resposta = lerBoolean("Deseja cadastrar outra placa? [S]Sim [N]Não: ", "Digite [S]Sim [N]Não", "S", "N");

            if (resposta == false) {
                break;
            }
        }
        return placasList;
    }

}
