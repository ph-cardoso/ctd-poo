package aula06.aula;

import java.time.LocalDate;

public class Aula {
  public static void main(String[] args) {
    // Date data = new Date(2021, 8, 21);
    Impressora impressora = new Impressora("HP", "wifi",
    LocalDate.of(2021, 2, 12));

    // System.out.println(impressora.getDataFabricacao());
    impressora.setFolhasDisponiveis(100);
    impressora.imprimir("Olá, Mundo!!!");
    System.out.println(impressora.getFolhasDisponiveis());
  }
}