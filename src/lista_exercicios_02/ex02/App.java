package lista_exercicios_02.ex02;

public class App {
    public static void main(String[] args) {
        CarroCorrida relampagoMarquinhos = new CarroCorrida(1, "Pedro Cardoso", "Flash", 180f);

        System.out.printf("\n-------------------- Informações --------------------\n\n");
        System.out.printf("Número do carro: %d\n", relampagoMarquinhos.getNumeroCarro());
        System.out.printf("Velocidade Máxima: %.2f km/h\n", relampagoMarquinhos.getVelocidadeMaxima());
        System.out.printf("Nome do piloto: %s\n", relampagoMarquinhos.getPiloto());
        System.out.printf("Equipe: %s\n", relampagoMarquinhos.getEquipe());

        System.out.printf("\nLigando o carro...\n");
        relampagoMarquinhos.ligar();

        System.out.printf("\nAcelerando o carro em 60 km/h...\n");
        relampagoMarquinhos.acelerar(60f);
        System.out.printf("Velocidade: %.2f km/h\n", relampagoMarquinhos.getVelocidadeAtual());

        System.out.printf("\nAcelerando o carro em 200 km/h...\n");
        relampagoMarquinhos.acelerar(200f);
        System.out.printf("Velocidade: %.2f km/h\n", relampagoMarquinhos.getVelocidadeAtual());

        System.out.printf("\nFreiando o carro em 50%%...\n");
        relampagoMarquinhos.frear(0.5f);
        System.out.printf("Velocidade: %.2f km/h\n", relampagoMarquinhos.getVelocidadeAtual());

        System.out.printf("\nParando o carro...\n");
        relampagoMarquinhos.parar();
        System.out.printf("Velocidade: %.2f km/h\n", relampagoMarquinhos.getVelocidadeAtual());

        System.out.printf("\nDesligando o carro...\n");
        relampagoMarquinhos.desligar();
        System.out.printf(relampagoMarquinhos.isLigado() ? "Carro ligado\n" : "Carro desligado\n");

        System.out.printf("\nFim do test drive...\n");
    }
}