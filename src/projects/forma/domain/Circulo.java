package projects.forma.domain;

public class Circulo extends Forma {
    private double raio;

    public Circulo(Ponto2D[] pontos){
        super(pontos);
    }

    public Circulo(Ponto2D[] pontos, double raio) {
        super(pontos);
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI*Math.pow(raio,2);
    }

    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*raio;
    }

    public double getRaio() {
        return raio;
    }

}
