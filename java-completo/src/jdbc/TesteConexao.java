package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

    public static void main(String[] args) throws SQLException {
        final var url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
        final var usuario = "mysql";
        final var senha = "mysql";

        Connection conexao = DriverManager.getConnection(url, usuario, senha);

        System.out.println("Conexão efetuada com sucesso!");
        conexao.close();
    }

}
