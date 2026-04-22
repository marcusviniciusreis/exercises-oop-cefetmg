package projects.forma.domain;

public abstract class Forma {
    protected Ponto2D[] pontos;

    public Forma(Ponto2D[] pontos) {
        this.pontos = pontos;
    }

    public static Forma geraFormas(Ponto2D[] pontos){
        if(pontos.length == 2){
            return  new Circulo(pontos, pontos[0].calcularDistancia(pontos[1]));
        }else if (pontos.length == 3){
            return  new Triangulo(pontos);
        }else if (pontos.length == 4){
            double lado1 = pontos[0].calcularDistancia(pontos[1]);
            double lado2 = pontos[1].calcularDistancia(pontos[2]);
            double lado3 = pontos[2].calcularDistancia(pontos[3]);
            double lado4 = pontos[3].calcularDistancia(pontos[0]);
            if ((lado1==lado2) && (lado2==lado3) && (lado3==lado4) && (lado4==lado1)){
                return new Quadrado(pontos, pontos[0].calcularDistancia(pontos[1]));
            }else {
                System.out.println("Sua forma nao é um quadrado!");
                return null;
            }
        }else {
            return null;
        }
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();

}
