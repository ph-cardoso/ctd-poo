package aula14;

public class app {
    public static void main(String[] args) {
        Porto pt = new Porto();
        Container c1 = new Container(1, "Container 1", "Brazil", true);
        Container c2 = new Container(2, "Container 2", "EUA", false);
        Container c3 = new Container(3, "Container 3", "Desconhecido", true);
        Container c4 = new Container(4, "Container 4", "Desconhecido", true);

        pt.addContainer(c2);
        pt.addContainer(c1);
        pt.addContainer(c3);
        pt.addContainer(c4);

        pt.showSortedList();

        System.out.printf("\nContainers Desconhecidos e Perigosos: %d\n\n", pt.countUnknowDangerousContainers());
    }
}
