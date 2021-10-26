package aula05.mesa_de_trabalho;

public class UsuarioJogo {
  private String nome;
  private String nickname;
  private int pontuacao;
  private int nivel;

  public UsuarioJogo(String nome, String nickname) {
    this.nome = nome;
    this.nickname = nickname;
    this.pontuacao = 0;
    this.nivel = 0;
  }

  public void aumentarPontuacao(){
    this.pontuacao++;
  }

  public void subirNivel(){
    this.nivel++;
  }

  public void bonus(int valor){
    this.pontuacao += valor; // this.pontuacao = this.pontuacao + valor;
  }

  // Métodos GET => Resgatar o valor do atributo

  // Métodos SET => Setam o valor do atributo

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public int getPontuacao() {
    return pontuacao;
  }

  public void setPontuacao(int pontuacao) {
    this.pontuacao = pontuacao;
  }

  public int getNivel() {
    return nivel;
  }

  public void setNivel(int nivel) {
    this.nivel = nivel;
  }
}