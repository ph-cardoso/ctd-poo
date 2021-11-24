package aula15;

public class App {
    public static void main(String[] args) {
        Capitao c1 = new Capitao("João", "Jão", 123);
        Capitao c2 = new Capitao("Pedro", "Ph", 456);
        Capitao c3 = new Capitao("Carlos", "carlim", 890);

        Iate i1 = new Iate(c1, 2000, 400, 2021, 25.2, 4);
        Iate i2 = new Iate(c3, 3000, 400, 2019, 25.2, 8);

        Veleiro v1 = new Veleiro(c2, 3000, 400, 2022, 25.2, 5);

        System.out.printf("\nO veleiro %s grande...\n", v1.seGrande() ? "é" : "não é");
        System.out.printf("O aluguel do veleiro é:  %.2f\n", v1.calculaAluguel());

        System.out.printf("O aluguel do iate 01 é:  %.2f\n", i1.calculaAluguel());
        System.out.printf("O aluguel do iate 02 é:  %.2f\n", i2.calculaAluguel());

        if(i1.compareTo(i2) < 0) {
            System.out.printf("O iate 02 é mais luxuoso\n\n");
        } else if(i1.compareTo(i2) > 0) {
            System.out.printf("O iate 01 é mais luxuoso\n\n");
        } else {
            System.out.printf("Os iates tem a mesma quantidade de cabines\n\n");
        }
    }
}