package org.example.model;

import javax.swing.JOptionPane;

public class Reader {
    public static String lerString(String msg) {
        return JOptionPane.showInputDialog(null, msg).trim();
    }

    public static int lerInt(String msg) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, msg).trim());
    }

    public static void mostrarMensagem(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
}