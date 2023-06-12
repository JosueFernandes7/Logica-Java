package apresentacao;

import java.sql.*;

import negocio.Atendimento;
import persistencia.AtendimentoDAO;

public class Main {
  public static void main(String[] args) throws SQLException {
    System.out.println("Iniciando...");
    // deletar
    // atendimentoDAO.deletar(1);

    // adicionar

    // atendimento adicionar 
    // Atendimento atendimento = new Atendimento();
    // atendimento.setDiagnostico("TUMOR");
    // atendimento.setFuncionario_codigo(2);
    // atendimento.setPaciente_id(2);
    // atendimento.setData_consulta("2023-09-07 22:12:12");
    // atendimentoDAO.adicionar(atendimento);

    // atualizar
    // Atendimento atendimento = new Atendimento();
    // atendimento.setCodigo(1);
    // atendimento.setData_consulta("1900-01-01 23:00:00");
    // atendimento.setPaciente_id(1);
    // atendimento.setFuncionario_codigo(1);
    // atendimento.setDiagnostico("DOR DE BARRIGA");
    // atendimentoDAO.atualizar(atendimento);
    // System.out.println(atendimento.getCodigo());

    AtendimentoDAO atendimentoDAO = new AtendimentoDAO();
    Atendimento atendimento = atendimentoDAO.obter(2);
    System.out.println(atendimento.toString());
    new MinhaGUI();

  }
}
