public class Singleton {
    private static volatile Singleton instanciaUnica;
    private SistemaDeArquivos sistema;

    private Singleton() {
        sistema = new SistemaDeArquivos(); // Inicializa aqui
    }

    public static Singleton getInstancia() {
        if (instanciaUnica == null) {
            synchronized (Singleton.class) {
                if (instanciaUnica == null) {
                    instanciaUnica = new Singleton();
                }
            }
        }
        return instanciaUnica;
    }

    public SistemaDeArquivos getSistema() {
        return sistema;
    }

    public void resetarSistema() {
        sistema = new SistemaDeArquivos();
    }
}
