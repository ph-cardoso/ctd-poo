package aula19;

public class Main {
    public static void main(String[] args) {
        ProdutoFactory factory = ProdutoFactory.getInstance();
        Produto caixa = factory.criarProduto("CAIXA10X10");
        Produto bolaFutebol = factory.criarProduto("FUTEBOL");
        Produto bolaTenis = factory.criarProduto("BOLATENIS");

        Armazem armazem = new Armazem();

        armazem.getProdutos().add(caixa);
        armazem.getProdutos().add(bolaFutebol);
        armazem.getProdutos().add(bolaTenis);

        System.out.printf("\nEspaco Total: %.2f cm", armazem.calcularEspacoNecessario());
        System.out.printf("\nEspaco Bola Futebol: %.2f cm", armazem.getProdutos().get(1).calcularEspaco());
        System.out.printf("\nEspaco Caixa: %.2f cm", caixa.calcularEspaco());
        System.out.printf("\nEspaco Bola Tenis: %.2f cm\n\n", bolaTenis.calcularEspaco());
    }
}