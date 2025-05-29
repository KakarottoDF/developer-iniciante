import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Printer {

    public static void imprimirListaGeral(GerenciadorBanca gerenciadorBanca){
        File arquivo = new File("listaGeral.txt");
        try(
                FileWriter fw = new FileWriter(arquivo, false);
                BufferedWriter br = new BufferedWriter(fw)
        ) {
            br.write(gerenciadorBanca.toString());
            br.flush();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public static void imprimirMoradores(GerenciadorBanca gerenciadorBanca){
        File arquivo = new File("moradores.txt");
        try(
                FileWriter fw = new FileWriter(arquivo, true);
                BufferedWriter br = new BufferedWriter(fw)
                ) {
            br.write(gerenciadorBanca.getListaMoradores().toString());
            br.flush();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
