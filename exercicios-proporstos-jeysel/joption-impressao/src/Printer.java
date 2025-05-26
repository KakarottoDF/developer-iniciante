import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Printer {
    public static void imprimirPessoas(GerenciarPessoas gerenciarPessoas){
        File file = new File("arquivos.txt");
        try(FileWriter fw = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(fw)){
            br.write(gerenciarPessoas.toString());
            br.flush();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
