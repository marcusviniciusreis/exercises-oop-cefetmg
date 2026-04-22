package projects.forma.domain;

public class Quadrado extends Forma {
    private double lado;

    public Quadrado(Ponto2D[] pontos) {
        super(pontos);
    }

    public Quadrado(Ponto2D[] pontos, double lado) {
        super(pontos);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado,2);
    }

    @Override
    public double calcularPerimetro() {
        return lado*4;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
