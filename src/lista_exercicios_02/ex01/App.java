package lista_exercicios_02.ex01;

public class App {
    public static void main(String[] args) {
        Pessoa einstein = new Pessoa("Albert Einstein", 13, 3, 1879);
        Pessoa newton = new Pessoa("Isaac Newton", 4, 1, 1643);

        System.out.printf("\n-------------------- Informações --------------------\n\n");
        System.out.printf("Nome: %s\n", einstein.informaNome());
        System.out.printf("Idade caso estivesse vivo: %d\n", einstein.informaIdade());
        System.out.printf("\nNome: %s\n", newton.informaNome());
        System.out.printf("Idade caso estivesse vivo: %d\n", newton.informaIdade());
    }
}
