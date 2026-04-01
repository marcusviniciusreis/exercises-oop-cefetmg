package projects.ponto2d.test;

import projects.ponto2d.domain.Ponto2D;

public class Ponto2DTest {
    public static void main(String[] args) {
        Ponto2D ponto1 = new Ponto2D();
        Ponto2D ponto2 = new Ponto2D();

        ponto1.setX(2);
        ponto1.setY(2);
        ponto2.setX(5);
        ponto2.setY(3);

        System.out.println("O valor da distancia entre os pontos é: " + ponto1.calcularDistancia(ponto2));
    }
}
