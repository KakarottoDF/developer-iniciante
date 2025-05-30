public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        System.out.println(singleton);

        System.out.println(Singleton.getInstance());

        Singleton c = Singleton.getInstance();
        Singleton c2 = Singleton.getInstance();

        if(c == c2){
            System.out.println("Singleton funcionou");
        }else{
            System.out.println("Singleton falhou");
        }
    }
}