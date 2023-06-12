package apresentacao;

import java.sql.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws SQLException {
    System.out.println("Iniciando...");

    // String dbname = "hospital";
    // String user = "postgres";
    // String password = "admin";
    // String url = "jdbc:postgresql://localhost:5432/" + dbname;

    // Connection connection = DriverManager.getConnection(url, user, password);
    
    // ConexaoPostgreSQL conexao = new ConexaoPostgreSQL();
    // Connection connection = conexao.getConexao();
    
    Scanner in = new Scanner(System.in);
    in.close();
    // System.out.print("Digite um id: ");
    // int idBusca = in.nextInt();

    // String sqlBusca = "SELECT * FROM funcionario WHERE codigo = ?;";
    // PreparedStatement preparedStatement = connection.prepareStatement(sqlBusca);
    // preparedStatement.setInt(1, idBusca);
    // ResultSet rs = preparedStatement.executeQuery();
    // Funcionario funcionario = new Funcionario();
    // if(rs.next()) {
    //   funcionario.setCodigo(rs.getInt("codigo"));
    //   funcionario.setNome(rs.getString("nome"));
    //   funcionario.setEmail(rs.getString("email"));
    //   funcionario.setSenha(rs.getString("senha"));
    //   funcionario.setCargo_id(rs.getInt("cargo_id"));
    // }

      // System.out.println(funcionario.obter(4).toString());
  }
}
