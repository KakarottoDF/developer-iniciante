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

    @Override
    public String toString() {
        return "Triatlo{" +
                "atleta=" + getAtleta() +
                '}';
    }
}
