package aula05.mesa_de_trabalho;

public class App {
  public static void main(String[] args) {
    UsuarioJogo gandalf = new UsuarioJogo("Pedro Cardoso", "Gandalf");
    UsuarioJogo hobbit = new UsuarioJogo("Mario Braga", "Hobbit");

    // %f => float, %d => inteiro, %s => String,
    // %c => char, %2f => double

    System.out.println("\nInformações sobre o GANDALF");
    System.out.printf("Nome: %s\n", gandalf.getNome());
    System.out.printf("Nickname: %s\n", gandalf.getNickname());
    for(int i = 0; i < 5; i++){
      gandalf.subirNivel();
    }
    System.out.printf("Nível: %d\n", gandalf.getNivel());
    gandalf.bonus(1000);
    System.out.printf("Pontuacao: %d\n", gandalf.getPontuacao());

    System.out.println("\nInformações sobre o HOBBIT");
    System.out.printf("Nome: %s\n", hobbit.getNome());
    System.out.printf("Nickname: %s\n", hobbit.getNickname());
    for(int i = 0; i < 10; i++){
      hobbit.subirNivel();
    }
    System.out.printf("Nível: %d\n", hobbit.getNivel());
    hobbit.bonus(1500);
    System.out.printf("Pontuacao: %d\n", hobbit.getPontuacao());
  }
}
