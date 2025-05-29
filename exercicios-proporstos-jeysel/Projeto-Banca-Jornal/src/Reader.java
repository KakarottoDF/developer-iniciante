import javax.swing.*;

public class Reader {

    public static String lerString(String msg){
        return JOptionPane.showInputDialog(null, msg).trim().toUpperCase();
    }

    public static String lerString(String msg, String msgError, int entrada, int saida){
        int message;

        do{
            message = Integer.parseInt(JOptionPane.showInputDialog(null, msg).trim());
            if(!(message == entrada) && !(message == saida)){
                JOptionPane.showMessageDialog(null, msgError, "SISTEMA DE GESTÃO DE BANCA DE JORNAL", JOptionPane.INFORMATION_MESSAGE);
            }
        }while(!(message == entrada) && !(message == saida));

        return String.valueOf(message);
    }

    public static double lerDouble(String msg){
        String message = JOptionPane.showInputDialog(null, msg);
        return Double.parseDouble(message.trim());
    }

    public static int lerInt(String msg){
        String message = JOptionPane.showInputDialog(null, msg);
        return Integer.parseInt(message.trim());
    }

    public static boolean lerBoolean(String msg){
        String message = JOptionPane.showInputDialog(null, msg);
        return Boolean.parseBoolean(message.trim());
    }

    public static boolean lerBoolean(String msg, String msgError, String entrada, String saida){
        String message;
        boolean retorno = true;

        do{
            message = JOptionPane.showInputDialog(null, msg).toUpperCase();
            if(!message.equals(entrada) && !message.equals(saida)){
                JOptionPane.showMessageDialog(null, msgError, "SISTEMA DE GESTÃO DE BANCA DE JORNAL", JOptionPane.INFORMATION_MESSAGE);
            }else{
                retorno = message.equals(entrada);
            }
        }while(!message.equals(entrada) && !message.equals(saida));

        return retorno;
    }


}
