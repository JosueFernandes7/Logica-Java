package negocio;

public class Funcionario {
  private int codigo;
  private String nome;
  private String email;
  private String senha;
  private int cargo_id;
  

  public Funcionario() {
  }
  
  public Funcionario(int codigo, String nome, String email, String senha, int cargo_id) {
    this.codigo = codigo;
    this.nome = nome;
    this.email = email;
    this.senha = senha;
    this.cargo_id = cargo_id;
  }

  public int getCodigo() {
    return codigo;
  }
  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }
  public int getCargo_id() {
    return cargo_id;
  }
  public void setCargo_id(int cargo_id) {
    this.cargo_id = cargo_id;
  }
  @Override
  public String toString() {
    if(codigo == 0) return null;
    return "Funcionario [codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", cargo_id="
        + cargo_id + "]";
  }

  

}
