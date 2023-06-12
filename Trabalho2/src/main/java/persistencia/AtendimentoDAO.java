package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import negocio.Atendimento;

public class AtendimentoDAO {
  public boolean deletar(int codigo) throws SQLException {
    String sql = "DELETE FROM atendimento WHERE codigo = ?;";
    Connection connection = new ConexaoPostgreSQL().getConexao();
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    preparedStatement.setInt(1, codigo);
    int resultado = preparedStatement.executeUpdate();
    preparedStatement.close();
    connection.close();
    return resultado == 1;
  }

  public boolean adicionar(Atendimento atendimento) throws SQLException {
    String sql = "INSERT INTO atendimento (data_consulta,paciente_id,funcionario_codigo,diagnostico) VALUES (?,?,?,?);";
    Connection connection = new ConexaoPostgreSQL().getConexao();
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    preparedStatement.setTimestamp(1, atendimento.getData_consulta());
    ;
    preparedStatement.setInt(2, atendimento.getPaciente_id());
    preparedStatement.setInt(3, atendimento.getFuncionario_codigo());
    preparedStatement.setString(4, atendimento.getDiagnostico());

    int resultado = preparedStatement.executeUpdate();
    connection.close();
    preparedStatement.close();

    return resultado == 1;
  }

  public boolean atualizar(Atendimento atendimento) throws SQLException {
    String sql = "UPDATE atendimento SET data_consulta = ?, paciente_id = ?, funcionario_codigo = ?, diagnostico = ? where codigo = ?;";
    Connection connection = new ConexaoPostgreSQL().getConexao();
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    preparedStatement.setTimestamp(1, atendimento.getData_consulta());
    preparedStatement.setInt(2, atendimento.getPaciente_id());
    preparedStatement.setInt(3, atendimento.getFuncionario_codigo());
    preparedStatement.setString(4, atendimento.getDiagnostico());
    preparedStatement.setInt(5, atendimento.getCodigo());

    int resultado = preparedStatement.executeUpdate();
    preparedStatement.close();
    connection.close();
    return resultado == 1;
  }

  public Atendimento obter(int codigo) throws SQLException {
    String sql = "SELECT * FROM atendimento WHERE codigo = ?;";
    Connection connection = new ConexaoPostgreSQL().getConexao();
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    preparedStatement.setInt(1, codigo);
    ResultSet rs = preparedStatement.executeQuery();
    Atendimento atendimento = new Atendimento();
    if (rs.next()) {
      atendimento.setCodigo(rs.getInt("codigo"));
      atendimento.setData_consulta(rs.getString("data_consulta"));
      atendimento.setPaciente_id((rs.getInt("paciente_id")));
      atendimento.setFuncionario_codigo(rs.getInt("funcionario_codigo"));
      atendimento.setDiagnostico(rs.getString("diagnostico"));
    }
    preparedStatement.close();
    connection.close();
    return atendimento;
  }
}
