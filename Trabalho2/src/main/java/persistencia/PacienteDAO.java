package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import negocio.Paciente;

public class PacienteDAO {

  public boolean deletar(int id) throws SQLException {
    String sql = "DELETE FROM paciente WHERE id = ?;";
    Connection connection = new ConexaoPostgreSQL().getConexao();
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    preparedStatement.setInt(1, id);
    int resultado = preparedStatement.executeUpdate();
    preparedStatement.close();
    connection.close();
    return resultado == 1;
  }

  public Paciente obter(int id) throws SQLException {
    String sql = "SELECT * FROM paciente WHERE id = ?;";
    Connection connection = new ConexaoPostgreSQL().getConexao();
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    preparedStatement.setInt(1, id);
    ResultSet rs = preparedStatement.executeQuery();
    Paciente paciente = new Paciente();
    if (rs.next()) {
      paciente.setId(rs.getInt("id"));
      paciente.setNome(rs.getString("nome"));
      paciente.setEndereco(rs.getString("endereco"));
    }
    preparedStatement.close();
    connection.close();
    return paciente;
  }

  public boolean adicionar(Paciente paciente) throws SQLException {
    String sql = "INSERT INTO paciente (nome,endereco) VALUES (?,?);";
    Connection connection = new ConexaoPostgreSQL().getConexao();
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    preparedStatement.setString(1, paciente.getNome());
    preparedStatement.setString(2, paciente.getEndereco());

    int resultado = preparedStatement.executeUpdate();
    preparedStatement.close();
    connection.close();
    return resultado == 1;

  }

  public boolean atualizar(Paciente paciente) throws SQLException {
    String sql = "UPDATE paciente SET nome = ?, endereco = ? where id = ?;";
    Connection connection = new ConexaoPostgreSQL().getConexao();
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    preparedStatement.setString(1, paciente.getNome());
    preparedStatement.setString(2, paciente.getEndereco());
    preparedStatement.setInt(3, paciente.getId());

    int resultado = preparedStatement.executeUpdate();
    preparedStatement.close();
    connection.close();
    return resultado == 1;
  }
}
