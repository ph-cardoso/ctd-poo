package lista_exercicios.ex12;

import java.util.ArrayList;
import java.util.Scanner;

/*
Uma academia deseja fazer um censo entre seus clientes para descobrir o
mais alto, o mais baixo, o maior e o menor peso. Para isto você deve fazer
um programa que pergunte a cada um dos clientes da academia seu
código, sua altura e seu peso. O final da digitação de dados deve ser dada
quando o usuário digitar 0 (zero) no campo código. Ao encerrar o
programa também deve ser informados os códigos e valores do cliente
mais alto, do mais baixo, do mais gordo e do mais magro, além da média
das alturas e dos pesos dos clientes
*/

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input das informações
    int inputCounter = 0;
    String alturaInput = "";
    String pesoInput = "";
    int codigoInput = 0;
    double altura = 0.0;
    double peso = 0.0;
    ArrayList<Integer> codigos = new ArrayList<Integer>();
    ArrayList<Double> alturas = new ArrayList<Double>();
    ArrayList<Double> pesos = new ArrayList<Double>();

    while(true){
      // Input código
      do{
        System.out.printf("\nInsira o código do cliente %d: ", inputCounter + 1);
        codigoInput = sc.nextInt();

        // Mensagem de erro
        if(codigoInput < 0){
          System.out.printf("\nCódigo inválido...");
        }
      } while(codigoInput < 0);

      // Condição para quebra do ciclo
      if(codigoInput == 0){
        break;
      }

      // Input altura
      do{
        System.out.printf("\nInsira a altura do cliente %d: ", inputCounter + 1);
        sc.nextLine(); // Esse nextLine() está sendo usado para limpar o buffer do teclado ('\n' da última leitura)
        alturaInput = sc.nextLine();

        // Transformação do input (string) para double
        altura = Double.parseDouble(alturaInput);

        // Mensagem de erro
        if(altura <= 0.0){
          System.out.printf("\nAltura inválida...");
        }
      } while(altura <= 0.0);


      // Input peso
      do{
        System.out.printf("\nInsira o peso do cliente %d: ", inputCounter + 1);
        pesoInput = sc.nextLine();

        // Transformação do input (string) para double
        peso = Double.parseDouble(pesoInput);

        // Mensagem de erro
        if(peso <= 0.0){
          System.out.printf("\nPeso inválido...");
        }
      } while(peso <= 0.0);

      // Inserção dos inputs nos array lists
      codigos.add(codigoInput);
      alturas.add(altura);
      pesos.add(peso);

      inputCounter++;
    }

    if(inputCounter > 0){

      // Altura
      double maiorAltura = alturas.get(0);
      int codMaiorAltura = codigos.get(0);
      double menorAltura = alturas.get(0);
      int codMenorAltura = codigos.get(0);
      double somaAlturas = 0;

      for(int i = 0; i < alturas.size(); i++){
        // Determinação da maior altura
        if(maiorAltura < alturas.get(i)){
          maiorAltura = alturas.get(i);
          codMaiorAltura = codigos.get(i);
        }

        // Determinação da menor altura
        if(menorAltura > alturas.get(i)){
          menorAltura = alturas.get(i);
          codMenorAltura = codigos.get(i);
        }

        // Soma das alturas
        somaAlturas += alturas.get(i);
      }

      double mediaAlturas = somaAlturas / alturas.size();

      // Peso
      double maiorPeso = pesos.get(0);
      int codMaiorPeso = codigos.get(0);
      double menorPeso = pesos.get(0);
      int codMenorPeso = codigos.get(0);
      double somaPesos = 0;

      for(int i = 0; i < pesos.size(); i++){
        // Determinação do maior peso
        if(maiorPeso < pesos.get(i)){
          maiorPeso = pesos.get(i);
          codMaiorPeso = codigos.get(i);
        }

        // Determinação do menor peso
        if(menorPeso > pesos.get(i)){
          menorPeso = pesos.get(i);
          codMenorPeso = codigos.get(i);
        }

        // Soma dos pesos
        somaPesos += pesos.get(i);
      }

      double mediaPesos = somaPesos / pesos.size();

      // Impressão dos dados
      System.out.printf("\n------- Relatório -------\n");
      System.out.printf("\nMaior altura cliente (cod: %d): %.2f\n", codMaiorAltura, maiorAltura);
      System.out.printf("Maior peso cliente (cod: %d): %.2f\n", codMaiorPeso, maiorPeso);
      System.out.printf("Menor altura cliente (cod: %d): %.2f\n", codMenorAltura, menorAltura);
      System.out.printf("Menor peso cliente (cod: %d): %.2f\n", codMenorPeso, menorPeso);
      System.out.printf("Média dos pesos: %.2f\n", mediaPesos);
      System.out.printf("Média das alturas: %.2f\n", mediaAlturas);
    }

    sc.close();
  }
}