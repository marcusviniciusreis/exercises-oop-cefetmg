package projects.forma.domain;

public class Triangulo extends Forma {

    public Triangulo(Ponto2D[] pontos) {
        super(pontos);
    }

    @Override
    public double calcularArea() {
        double lado1 = pontos[0].calcularDistancia(pontos[1]);
        double lado2 = pontos[1].calcularDistancia(pontos[2]);
        double lado3 = pontos[2].calcularDistancia(pontos[0]);

        double semiperimetro;
        semiperimetro = (lado1 + lado2 + lado3)/2;

        return Math.sqrt(semiperimetro*(semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
    }

    @Override
    public double calcularPerimetro() {
        double lado1 = pontos[0].calcularDistancia(pontos[1]);
        double lado2 = pontos[1].calcularDistancia(pontos[2]);
        double lado3 = pontos[2].calcularDistancia(pontos[0]);

        return lado1+lado2+lado3;
    }

    public String tipoTriangulo(){
        double lado1 = pontos[0].calcularDistancia(pontos[1]);
        double lado2 = pontos[1].calcularDistancia(pontos[2]);
        double lado3 = pontos[2].calcularDistancia(pontos[0]);

        if (lado1 == lado2 && lado2 == lado3) {
            return " Triangulo Equilatero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Triangulo Isosceles";
        } else {
            return "Triangulo Escaleno";
        }
    }

}
