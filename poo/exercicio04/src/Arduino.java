import java.util.ArrayList;

public class Arduino{

    private ArrayList<Diecimila> diecimila;

    public Arduino(){
        this.diecimila = new ArrayList<>();
    }

    public ArrayList<Diecimila> getDiecimila() {
        return this.diecimila;
    }

    public void adicionar(Diecimila diecimila){
        getDiecimila().add(diecimila);
    }

    @Override
    public String toString() {
        return "Arduino{" +
                "diecimila=" + getDiecimila() +
                '}';
    }
}
