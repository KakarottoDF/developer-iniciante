package org.example.model;

import javax.swing.JOptionPane;

public class Reader {

    public static String lerString(String msg) {
        return JOptionPane.showInputDialog(null, msg).trim().toUpperCase();
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

    public static void mostrarMensagem(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
}