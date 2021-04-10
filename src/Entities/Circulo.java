package Entities;

import utils.FiguraGeometrica;

public class Circulo extends FiguraGeometrica {
    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    @Override
    public int calcularPerimetro() {
        return (int) (3.14 * this.raio);
    }

    @Override
    public int calcularArea() {
        return (int) (2 * 3.14 * this.raio);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }
}
