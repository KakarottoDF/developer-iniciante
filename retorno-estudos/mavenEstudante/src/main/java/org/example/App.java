package org.example;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        String url = "jdbc:mysql://localhost:3306/aula1";
        String user = "root";
        String password = "s@ph1r10n";


        try (Connection conn = DriverManager.getConnection(url, user, password)){
            if(conn != null){
                System.out.println("Conexão estabelecida com sucesso!");
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM ESTUDANTE");
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    String nome = rs.getString("NOME");
                    System.out.println(nome);
                }
            }
        }catch (SQLException e){
            System.err.println("Erro ao conectar no banco: " + e.getMessage());
        }
    }
}
