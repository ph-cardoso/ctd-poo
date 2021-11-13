package lista_exercicios_02.ex03;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorIngresso = 25.0;
        double adicionalVip = 30.0;
        double adicionalCamaroteSup = 45.0;

        System.out.printf("\n-------------------- Informações --------------------\n\n");

        int tipo = 0;
        // Input do tipo de ingresso
        do{
            System.out.println("Digite o tipo de ingresso: ");
            System.out.println("1) Normal");
            System.out.println("2) VIP");
            tipo = sc.nextInt();

            // Mensagem de erro
            if(tipo != 1 && tipo != 2){
                System.out.println("\nTipo de ingresso inválido!\n");
            }
        } while(tipo != 1 && tipo != 2);

        if(tipo == 1){
            Normal ingressoNormal = new Normal(valorIngresso);

            System.out.printf("\nTipo de ingresso: ");
            ingressoNormal.imprimeNormal();
            System.out.printf("\nValor do ingresso: ");
            ingressoNormal.imprimeValor();
        } else {
            int camarote = 0;
            // Input do camarote
            do{
                System.out.println("\nDigite o tipo de camarote: ");
                System.out.println("1) Camarote Superior");
                System.out.println("2) Camarote Inferior");
                camarote = sc.nextInt();

                // Mensagem de erro
                if(camarote != 1 && camarote != 2){
                    System.out.println("\nTipo de camarote inválido!");
                }
            } while(camarote != 1 && camarote != 2);

            if(camarote == 2){
                CamaroteInferior ingressoCamaroteInferior = new CamaroteInferior(valorIngresso, adicionalVip);

                System.out.printf("\nTipo de ingresso: VIP");
                System.out.printf("\nTipo de Camarote: ");
                ingressoCamaroteInferior.imprimeLocalizacao();
                System.out.printf("\nValor do ingresso: ");
                ingressoCamaroteInferior.imprimeValor();
            } else {
                CamaroteSuperior ingressoCamaroteSuperior = new CamaroteSuperior(valorIngresso, adicionalVip, adicionalCamaroteSup);

                System.out.printf("\nTipo de ingresso: VIP");
                System.out.printf("\nTipo de Camarote: ");
                ingressoCamaroteSuperior.imprimeLocalizacao();
                System.out.printf("\nValor do ingresso: ");
                ingressoCamaroteSuperior.imprimeValor();
            }
        }

        sc.close();
    }
}