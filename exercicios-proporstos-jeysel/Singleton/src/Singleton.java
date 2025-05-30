public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton(){
        //Construtor criado para não deixar criar a instância da classe, pois é privada
    }

    public static synchronized Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
