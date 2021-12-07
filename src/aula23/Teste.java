package aula23;

public class Teste {
    public static void main(String[] args) {
        Instituto instance = Instituto.getInstance();
        Curso curso1 = new Curso("FrontEnd", "Programação FrontEnd", 16, 2, 1000);
        Curso curso2 = new Curso("BackEnd", "Programação BackEnd", 20, 2, 900);
        ProgramaComposite programa1 = new ProgramaComposite("FullStack", "Fullstack Pack", 0.2);
        programa1.addCurso(curso1);
        programa1.addCurso(curso2);

        instance.getCursos().add(curso1);
        instance.getCursos().add(curso2);
        instance.getProgramas().add(programa1);

        instance.gerarRelatorio();
    }
}
