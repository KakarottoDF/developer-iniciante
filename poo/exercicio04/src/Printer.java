public class Printer {
    public static void imprimirPlacas(Arduino arduino){
        if(arduino.getPlaca() == null || arduino.getPlaca().isEmpty()){
            System.out.println("Não existem placas cadastradas");
        }else{
            System.out.println(arduino.getPlaca());
        }
    }
}
