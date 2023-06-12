package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import negocio.Funcionario;

public class FuncionarioDAO {
  public boolean deletar(int codigo) throws SQLException {
    String sql = "DELETE FROM funcionario WHERE codigo = ?;";
    Connection connection = new ConexaoPostgreSQL().getConexao();
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    preparedStatement.setInt(1, codigo);
    int resultado = preparedStatement.executeUpdate();
    preparedStatement.close();
    connection.close();
    return resultado == 1;
  }
  public Funcionario obter(int codigo) throws SQLException {
    String sql = "SELECT * FROM funcionario WHERE codigo = ?;";
    Connection connection = new ConexaoPostgreSQL().getConexao();
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    preparedStatement.setInt(1, codigo);
    ResultSet rs = preparedStatement.executeQuery();
    Funcionario funcionario = new Funcionario();
    if (rs.next()) {
      funcionario.setCodigo(rs.getInt("codigo"));
      funcionario.setNome(rs.getString("nome"));
      funcionario.setEmail(rs.getString("email"));
      funcionario.setSenha(rs.getString("senha"));
      funcionario.setCargo_id(rs.getInt("cargo_id"));
    }
    preparedStatement.close();
    connection.close();
    return funcionario;
  }

  public boolean adicionar(Funcionario funcionario) throws SQLException {
    String sql = "INSERT INTO funcionario (nome,email,senha,cargo_id) VALUES (?,?,?,?);";
    Connection connection = new ConexaoPostgreSQL().getConexao();
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    preparedStatement.setString(1, funcionario.getNome());
    preparedStatement.setString(2, funcionario.getEmail());
    preparedStatement.setString(3, funcionario.getSenha());
    preparedStatement.setInt(4, funcionario.getCargo_id());

    int resultado = preparedStatement.executeUpdate();
    preparedStatement.close();
    connection.close();
    return resultado == 1;

  }

  public boolean atualizar(Funcionario funcionario) throws SQLException {
    String sql = "UPDATE funcionario SET nome = ?, email = ?, senha = ?, cargo_id = ? where codigo = ?;";
    Connection connection = new ConexaoPostgreSQL().getConexao();
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    preparedStatement.setString(1, funcionario.getNome());
    preparedStatement.setString(2, funcionario.getEmail());
    preparedStatement.setString(3, funcionario.getSenha());
    preparedStatement.setInt(4, funcionario.getCargo_id());
    preparedStatement.setInt(5, funcionario.getCodigo());

    int resultado = preparedStatement.executeUpdate();
    preparedStatement.close();
    connection.close();
    return resultado == 1;
  }
}
