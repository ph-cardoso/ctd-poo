package aula03.mesa_de_trabalho;

import java.util.Scanner;

public class Desafio2 {
  public static void main(String[] args) {
    // Inicialização do Scanner
    Scanner sc = new Scanner(System.in);

    // Input do nome do jogador 1
    System.out.printf("Digite o nome do Jogador 1: ");
    String nome_p1 = sc.nextLine().toUpperCase();

    // Input do nome do jogador 2
    System.out.printf("Digite o nome do Jogador 2: ");
    String nome_p2 = sc.nextLine().toUpperCase();

    System.out.printf("%s x %s\n", nome_p1, nome_p2);

    // Variáveis do tipo String que irão armazenar as jogadas da rodada
    String jogada_p1 = "";
    String jogada_p2 = "";

    // Variáveis do tipo inteiro que irão armazenar a pontuação dos jogadores
    int pontos_p1 = 0, pontos_p2 = 0;

    // Loop do jogo
    while(true){
      // Input da jogada do jogador 1
      System.out.printf("\nJogada do %s: ", nome_p1);
      jogada_p1 = sc.nextLine().toUpperCase();
      if(jogada_p1.equals("*")){
        break;
      }

      // Input da jogada do jogador 2
      System.out.printf("Jogada do %s: ", nome_p2);
      jogada_p2 = sc.nextLine().toUpperCase();

      switch(wichWin(jogada_p1, jogada_p2)){
        // Empate
        case 0:
          System.out.printf("\n\nEMPATE\n");
          System.out.printf("%s: %d\n", nome_p1, pontos_p1);
          System.out.printf("%s: %d\n", nome_p2, pontos_p2);
          break;
        // Vitória Jogador 1
        case 1:
          System.out.printf("\n\nVITÓRIA DO(A) %s\n", nome_p1);
          pontos_p1++;
          System.out.printf("%s: %d\n", nome_p1, pontos_p1);
          System.out.printf("%s: %d\n", nome_p2, pontos_p2);
          break;
        // Vitória Jogador 2
        case 2:
          System.out.printf("\n\nVITÓRIA DO(A) %s\n", nome_p2);
          pontos_p2++;
          System.out.printf("%s: %d\n", nome_p1, pontos_p1);
          System.out.printf("%s: %d\n", nome_p2, pontos_p2);
          break;
        // Erro na comparação
        default:
          System.out.printf("\n\nErro na análise de ganhador...\n");
      }
    }
  }

  // Função que analisa as jogadas e determina ganhador
  public static int wichWin (String j1, String j2){
    if(j1.equals(j2)){
      return 0;
    } else if(j1.equals("PEDRA") && j2.equals("TESOURA")){
      return 1;
    } else if(j1.equals("PEDRA") && j2.equals("PAPEL")){
      return 2;
    } else if(j1.equals("PAPEL") && j2.equals("TESOURA")){
      return 2;
    } else if(j1.equals("PAPEL") && j2.equals("PEDRA")){
      return 1;
    } else if(j1.equals("TESOURA") && j2.equals("PAPEL")){
      return 1;
    } else if(j1.equals("TESOURA") && j2.equals("PEDRA")){
      return 2;
    } else {
      return -1;
    }
  }
}