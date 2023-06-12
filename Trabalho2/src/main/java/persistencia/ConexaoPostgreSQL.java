package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoPostgreSQL {
  private String host;
  private String dbname;
  private String user;
  private String password;
  private String port;

  public ConexaoPostgreSQL() {
    this.host = "localhost";
    this.dbname = "hospital";
    this.user = "postgres";
    this.password = "admin"; // a senha do meu postgres é diferente de postgres
    this.port = "5432";
  }

  public Connection getConexao() throws SQLException {
      String url = "jdbc:postgresql://"+this.host+":"+this.port+"/" + this.dbname;
      try {
        return DriverManager.getConnection(url, this.user, this.password);
      } catch (SQLException ex) {
        System.out.println("Deu ruim");
        return null;
      }
  }
}
