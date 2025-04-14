import java.util.ArrayList;

public class Triatlo{
    private ArrayList<Atleta> atleta;

    public Triatlo() {
        this.atleta = new ArrayList<>();
    }

    public ArrayList<Atleta> getAtleta() {
        return atleta;
    }

    public void adicionar(Atleta atleta){
        getAtleta().add(atleta);
    }

    public boolean informacaoRepetida(int num){
        for(Atleta atleta : getAtleta()){
            if(atleta.getNumeroDeInscricao() == num){
                return true;
            }
        }
        return false;
    }

    public boolean informacaoRepetida(String nome){
        for(Atleta atleta : getAtleta()){
            if(atleta.getNome().equalsIgnoreCase(nome)){
                return true;
            }
        }
        return false;
    }

    public static boolean informacaoInvalida(String nome) {
        if(nome.length() < 4){
            System.out.println("Você digitou menos de 4 caracteres no nome.");
        }else{
            if(nome.length() > 50){
                System.out.println("Você digitou um nome muito grande.");
            }
        }
        return nome == null || nome.trim().isEmpty() || nome.length() < 4 || nome.length() > 50;
    }

    public static boolean informacaoInvalida(int num) {
        return num <= 0;
    }

    @Override
    public String toString() {
        return "\nIRONMAN 70.3" +
                "\n---------- LISTA DE ATLETAS ----------" + getAtleta();
    }
}
