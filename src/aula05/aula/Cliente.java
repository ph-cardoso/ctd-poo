package aula05.aula;

public class Cliente {
  private int numeroCliente;
  private String nome;
  private double divida;

  public Cliente(int numero, String nome){
      this.numeroCliente = numero;
      this.nome = nome;
      this.divida = 0;
  }

  public String getNome(){
      return this.nome;
  }

  public void setNome(String nome){
      this.nome = nome;
  }

  public int getNumeroCliente(){
      return this.numeroCliente;
  }

  public void setNumeroCliente(int numeroCliente){
      this.numeroCliente = numeroCliente;
  }

  public double getDivida(){
      return this.divida;
  }

  public void setDivida(double divida){
      this.divida = divida;
  }

  public void aumentarDivida(double valor){
      this.divida = this.divida + valor;
      System.out.println("O valor da divida agora é: " + this.divida);
  }

  public void pagarDivida(double valor){
      if (valor <= this.divida){
          this.divida = this.divida - valor;
      }else{
          System.out.println("Valor maior que a divida!!");
      }

  }
}
