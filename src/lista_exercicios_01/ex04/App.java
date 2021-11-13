package lista_exercicios_01.ex04;

import java.util.Scanner;

/*
Faça um programa que faça 5 perguntas para uma pessoa sobre um
crime. As perguntas são:
a) "Telefonou para a vítima?"
b) "Esteve no local do crime?"
c) "Mora perto da vítima?"
d) "Devia para a vítima?"
e) "Já trabalhou com a vítima?"
O programa deve no final emitir uma classificação sobre a participação da
pessoa no crime. Se a pessoa responder positivamente a 2 questões ela
deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5
como "Assassino". Caso contrário, ele será classificado como "Inocente".
*/

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Array de Strings que armazena as perguntas
    String[] perguntas = {
      "Telefonou para a vítima?",
      "Esteve no local do crime?",
      "Mora perto da vítima?",
      "Devia para a vítima?",
      "Já trabalhou com a vítima?"
    };

    // Contador de respostas positivas
    int contRespostasPositivas = 0;

    // Pega o input de resposta das perguntas
    System.out.printf("\n------- Questionário -------\n");
    System.out.printf("\nResponda as questões com \"S\" ou \"N\"\n\n");

    String resposta = "";
    int resultado;

    for(int i = 0; i < perguntas.length; i++){
      // Loop para tratar respostas inválidas => Msg de erro + perguntar novamente
      do{
        // Input de resposta transformado com toUpperCase()
        System.out.printf("%s ", perguntas[i]);
        resposta = sc.nextLine().toUpperCase();

        // Invocação da funcão answerHandler para analisar a respsota
        resultado = answerHandler(resposta);

        // Análise do resultado
        switch(resultado){
          case 1:
            contRespostasPositivas++;
            break;
          case 2:
            break;
          case 0:
            System.out.printf("Resposta inválida... Responda com \"S\" ou \"N\"\n");
        }
      } while(resultado == 0);
    }

    // Atribuição da classificação de acordo com as condições
    String classificacao = classifica(contRespostasPositivas);

    // Impressão dos dados
    System.out.printf("\n------- Relatório -------\n");
    System.out.printf("\nResultado da análise: %s\n", classificacao);

    sc.close();
  }

  public static int answerHandler(String resposta){
    if(!resposta.equals("S") && !resposta.equals("N")){
      return 0;
    } else if(resposta.equals("S")) {
      return 1;
    } else {
      return 2;
    }
  }

  public static String classifica(int contRespostasPositivas){
    if(contRespostasPositivas == 2){
      return "Suspeito";
    } else if(contRespostasPositivas > 2 && contRespostasPositivas < 5) {
      return "Cúmplice";
    } else if(contRespostasPositivas == 5) {
      return "Assassino";
    } else {
      return "Inocente";
    }
  }
}