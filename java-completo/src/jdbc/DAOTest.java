package jdbc;

import java.util.Scanner;

public class DAOTest {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var dao = new DAO();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";

        System.out.print("Insira um nome: ");
        String nome = sc.nextLine();

        dao.incluir(sql, nome);
        System.out.println(nome + " inserido com sucesso!");

        sc.close();
        dao.close();
    }

}
