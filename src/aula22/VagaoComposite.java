package aula22;

import java.util.ArrayList;

public class VagaoComposite implements Figura {
    private ArrayList<Figura> childFiguras;

    public VagaoComposite() {
        this.childFiguras = new ArrayList<>();
    }

    public void addFigura(Figura figura) {
        this.childFiguras.add(figura);
    }

    public void removeFigura(Figura figura) {
        this.childFiguras.remove(figura);
    }

    public double getArea() {
        double area = 0;
        for (Figura figura : childFiguras) {
            area += figura.getArea();
        }
        return area;
    }
}
