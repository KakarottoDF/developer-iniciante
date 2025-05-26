import javax.swing.*;

public class Reader {

    public static String lerString(String msg){
        return JOptionPane.showInputDialog(null, msg).trim().toUpperCase();
    }

    public static int lerInt(String msg){
        String input = JOptionPane.showInputDialog(null, msg).trim();
        return Integer.parseInt(input);
    }

    public static boolean lerBoolean(String msg, String msgError, String entrada, String saida) {
        String leitor;
        boolean resultado = true;

        do {
            leitor = JOptionPane.showInputDialog(null, msg).trim().toUpperCase();
            if (!leitor.equals(entrada) && !leitor.equals(saida)) {
                JOptionPane.showMessageDialog(null, msgError);
            } else {
                resultado = leitor.equals(entrada);
            }
        } while (!leitor.equals(entrada) && !leitor.equals(saida));

        return resultado;
    }
}
