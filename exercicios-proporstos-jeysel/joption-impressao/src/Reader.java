import javax.swing.*;

public class Reader {

    public static String lerString(String msg){
        return JOptionPane.showInputDialog(null, msg).trim().toUpperCase();
    }

    public static int lerInt(String msg){
        String input = JOptionPane.showInputDialog(null, msg);
        return Integer.parseInt(input.trim());
    }
}
