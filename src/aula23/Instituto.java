package aula23;

import java.util.ArrayList;

public class Instituto {
    private static Instituto instace;

    private ArrayList<Curso> cursos = new ArrayList<>();
    private ArrayList<ProgramaComposite> programas = new ArrayList<>();

    private Instituto(){};

    public static Instituto getInstance() {
        if(instace == null){
            instace = new Instituto();
        }
        return instace;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public ArrayList<ProgramaComposite> getProgramas() {
        return programas;
    }

    public void gerarRelatorio(){
        for(Curso curso : cursos){
            System.out.println("Curso: " + curso.getNome());
            System.out.println("Carga Horária Mensal: " + curso.getHorasMensais());
            System.out.println("Duração: " + curso.getDuracao() + " meses");
            System.out.println("Preço por Hora: " + curso.getValorHora());
            System.out.println("Preço Total: " + curso.calcularPreco());
            System.out.println();
        }

        for(ProgramaComposite programa : programas){
            System.out.println("Programa Intensivo: " + programa.getNome());
            System.out.println("Desconto Bônus: " + programa.getDesconto() + "%");
            System.out.println("Preço Total: " + programa.calcularPreco());
            System.out.println();
        }
    }
}