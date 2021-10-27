package aula06.mesa_de_trabalho;

public class Cachorro {
  private boolean apto;
  private String raca;
  private int anoNascimento;
  private double peso;
  private boolean chip;
  private boolean machucado;
  private String firstName;

  public Cachorro(String raca, int anoNascimento, double peso, boolean chip, boolean machucado, String firstName) {
    this.raca = raca;
    this.anoNascimento = anoNascimento;
    this.peso = peso;
    this.chip = chip;
    this.machucado = machucado;
    this.firstName = firstName;
    this.apto = seApto(this.machucado, this.peso);
  }

  // %d => int, %f => float, double, %c => char, %s => String

  public void encaminharAdocao(){
    if(this.apto){
      System.out.printf("\n%s adotado com sucesso!!!\n", this.firstName);
    } else {
      System.out.printf("\n%s não está apto para adoção =(\n", this.firstName);
    }
  }

  public boolean seApto(boolean machucado, double peso){
    if(!machucado && peso >= 5.0){
      return true;
    }
    else {
      return false;
    }
  }

  public boolean isApto() {
    return apto;
  }

  public String getRaca() {
    return raca;
  }

  public void setRaca(String raca) {
    this.raca = raca;
  }

  public int getAnoNascimento() {
    return anoNascimento;
  }

  public void setAnoNascimento(int anoNascimento) {
    this.anoNascimento = anoNascimento;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public boolean isChip() {
    return chip;
  }

  public void setChip(boolean chip) {
    this.chip = chip;
  }

  public boolean isMachucado() {
    return machucado;
  }

  public void setMachucado(boolean machucado) {
    this.machucado = machucado;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
}