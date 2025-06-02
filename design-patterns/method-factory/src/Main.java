import factory.Logistic;
import factory.RoadLogistic;
import factory.SealLogistic;

public class Main {
    private static Logistic logistic;
    public static void main(String[] args) {
        try{
            configure(args);
            runBusinessLogic();
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }

    static void configure(String[] args) throws Exception {
        if(args.length < 1){
            throw new Exception("Tipo de logística é obrigatório");
        }

        switch (args[0]){
            case ("Rodoviaria"):
                logistic = new RoadLogistic();
                break;
            case ("Maritima"):
                logistic = new SealLogistic();
                break;
            default:
                throw new Exception("Tipo de logística inválido");
        }
    }

    static void runBusinessLogic(){
        logistic.planDeliver();
    }
}