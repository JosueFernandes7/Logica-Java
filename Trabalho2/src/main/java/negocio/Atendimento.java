package negocio;

import java.sql.Timestamp;

public class Atendimento {
  private int codigo;
  private Timestamp data_consulta;
  private int paciente_id;
  private int funcionario_codigo;
  private String diagnostico;
  
  @Override
  public String toString() {
    return "Atendimento [codigo=" + codigo + ", data_consulta=" + data_consulta + ", paciente_id=" + paciente_id
        + ", funcionario_codigo=" + funcionario_codigo + ", diagnostico=" + diagnostico + "]";
  }
  public int getCodigo() {
    return codigo;
  }
  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public int getPaciente_id() {
    return paciente_id;
  }
  public void setPaciente_id(int paciente_id) {
    this.paciente_id = paciente_id;
  }
  public int getFuncionario_codigo() {
    return funcionario_codigo;
  }
  public void setFuncionario_codigo(int funcionario_codigo) {
    this.funcionario_codigo = funcionario_codigo;
  }
  public String getDiagnostico() {
    return diagnostico;
  }
  public void setDiagnostico(String diagnostico) {
    this.diagnostico = diagnostico;
  }
  public Timestamp getData_consulta() {
    return data_consulta;
  }
  public void setData_consulta(String data_consulta) {
    this.data_consulta = Timestamp.valueOf(data_consulta);
  }

  
  
}
