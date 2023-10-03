package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {

    public static void main(String[] args) throws SQLException {
        var sc = new Scanner(System.in);
        System.out.print("Informe o código da pessoa: ");
        int codigo = sc.nextInt();

        String select = "SELECT * FROM pessoas WHERE codigo = ?";
        String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

        Connection conexao = FabricaConexao.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(select);
        stmt.setInt(1, codigo);
        ResultSet resultado = stmt.executeQuery();

        if (resultado.next()) {
            var pessoa = new Pessoa(resultado.getInt(1), resultado.getString(2));
            System.out.println("O nome atual é " + pessoa.getNome());
            sc.nextLine();

            System.out.print("Informe o novo nome: ");
            String novoNome = sc.nextLine();

            stmt.close();
            stmt = conexao.prepareStatement(update);
            stmt.setString(1, novoNome);
            stmt.setInt(2, codigo);
            stmt.execute();

            System.out.println("Pessoa alterada com sucesso!");
        } else {
            throw new RuntimeException("Pessoa não encontrada!");
        }

        sc.close();
        conexao.close();
    }

}
