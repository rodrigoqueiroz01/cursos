package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

    public static void main(String[] args) throws SQLException {
        final var url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
        final var usuario = "mysql";
        final var senha = "mysql";

        Connection conexao = DriverManager.getConnection(url, usuario, senha);

        Statement stmt = conexao.createStatement();
        stmt.execute("create database if not exists curso_java_2");

        System.out.println("Banco criado com sucesso!");
        conexao.close();
    }

}
