import javax.swing.JOptionPane;

public class Reader {

    public static String lerString() {
        return JOptionPane.showInputDialog(null, "").trim().toUpperCase();
    }

    public static String lerString(String msg) {
        return JOptionPane.showInputDialog(null, msg).trim().toUpperCase();
    }

    public static String lerString(String msg, String msgError, String entrada, String saida) {
        String leitor;

        do {
            leitor = JOptionPane.showInputDialog(null, msg).trim().toUpperCase();
            if (!leitor.equals(entrada) && !leitor.equals(saida)) {
                JOptionPane.showMessageDialog(null, msgError);
            }
        } while (!leitor.equals(entrada) && !leitor.equals(saida));

        return leitor;
    }

    public static boolean lerBoolean() {
        String input = JOptionPane.showInputDialog(null, "").trim().toLowerCase();
        return Boolean.parseBoolean(input);
    }

    public static boolean lerBoolean(String msg) {
        String input = JOptionPane.showInputDialog(null, msg).trim().toLowerCase();
        return Boolean.parseBoolean(input);
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

    public static int lerInt() {
        String input = JOptionPane.showInputDialog(null, "");
        return Integer.parseInt(input.trim());
    }

    public static int lerInt(String msg) {
        String input = JOptionPane.showInputDialog(null, msg);
        return Integer.parseInt(input.trim());
    }

    public static int lerInt(String msg, String msgError, int min, int max) {
        int leitor = 0;
        boolean valido = false;

        do {
            try {
                String input = JOptionPane.showInputDialog(null, msg);
                leitor = Integer.parseInt(input.trim());
                if (leitor < min || leitor > max) {
                    JOptionPane.showMessageDialog(null, msgError);
                } else {
                    valido = true;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, msgError);
            }
        } while (!valido);

        return leitor;
    }

    public static double lerDouble() {
        String input = JOptionPane.showInputDialog(null, "");
        return Double.parseDouble(input.trim());
    }

    public static double lerDouble(String msg) {
        String input = JOptionPane.showInputDialog(null, msg);
        return Double.parseDouble(input.trim());
    }

}
