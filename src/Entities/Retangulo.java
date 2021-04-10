package Entities;

import utils.FiguraGeometrica;

public class Retangulo implements FiguraGeometrica {
    private int altura;
    private int largura;

    public Retangulo(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
    }
    @Override
    public int calcularPerimetro() {
        return (2 * this.altura) + (2 * this.largura);
    }

    @Override
    public int calcularArea() {
        return this.altura * this.largura;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "altura=" + altura +
                ", largura=" + largura +
                '}';
    }
}
