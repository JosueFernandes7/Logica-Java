package apresentacao;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinhaGUI extends JFrame {
  JButton atendimento = new JButton("Atendimento"); // Criar um botão
  JButton paciente = new JButton("Paciente"); // Criar um botão
  JButton funcionario = new JButton("Funcionario"); // Criar um botão

  public MinhaGUI() {
    super("Tela com Botões");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    add(atendimento); // Adicionar o botão à janela
    add(paciente); // Adicionar o botão à janela
    add(funcionario); // Adicionar o botão à janela

    // Adicionando um ouvinte de eventos ao botão de atendimento
    atendimento.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        // Ação a ser executada quando o botão 1 for clicado
        buttonClicked(atendimento);
      }

    });

    paciente.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        buttonClicked(paciente);
      }
    });

    setSize(800, 400); // Definir tamanho da janela
    setVisible(true); // Exibir a janela
  }

  public void buttonClicked(JButton button) {
    button.setEnabled(false); // Desabilita o botão clicado

    // Remove os botões não clicados
    if (button == atendimento) {
      remove(paciente);
      remove(funcionario);
    } else if (button == paciente) {
      remove(atendimento);
      remove(funcionario);
    } else if (button == funcionario) {
      remove(atendimento);
      remove(paciente);
    }

    revalidate(); // Atualiza o layout da janela
    repaint(); // Redesenha a janela
  }
}
