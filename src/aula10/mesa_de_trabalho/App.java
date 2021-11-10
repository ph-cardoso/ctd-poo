package aula10.mesa_de_trabalho;

public class App {
    public static void main(String[] args) {
        // Instanciação dos objetos
        Objeto objeto = new Objeto(2, 5, 'N');
        Nave nave = new Nave(1, 6, 'L', 2.0);
        Asteroide asteroide = new Asteroide(3, 4, 'S', 20);

        // Informações Objeto
        System.out.printf("\nInformações do objeto:\n");
        System.out.printf("PosX: %d\n", objeto.getPosx());
        System.out.printf("PosY: %d\n", objeto.getPosy());
        objeto.irA(5, 2, 'N');
        System.out.printf("PosX: %d\n", objeto.getPosx());
        System.out.printf("PosY: %d\n", objeto.getPosy());

        // Informações Nave
        System.out.printf("\nInformações da nave:\n");
        System.out.printf("PosX: %d\n", nave.getPosx());
        System.out.printf("PosY: %d\n", nave.getPosy());
        nave.irA(5, 2, 'N');
        System.out.printf("PosX: %d\n", nave.getPosx());
        System.out.printf("PosY: %d\n", nave.getPosy());

        // Informações Asteroide
        System.out.printf("\nInformações do Asteroide:\n");
        System.out.printf("PosX: %d\n", asteroide.getPosx());
        System.out.printf("PosY: %d\n", asteroide.getPosy());
        asteroide.irA(5, 2, 'N');
        System.out.printf("PosX: %d\n", asteroide.getPosx());
        System.out.printf("PosY: %d\n", asteroide.getPosy());
    }
}