public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton(){
        //Construtor criado para não deixar criar a instância da classe, pois é privada
    }

    public static Singleton getInstance(){
        synchronized (Singleton.class) {
            if (uniqueInstance == null) {
                uniqueInstance = new Singleton();
            }
        }
        return uniqueInstance;
    }
}
