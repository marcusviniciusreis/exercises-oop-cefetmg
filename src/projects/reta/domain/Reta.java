package projects.reta.domain;

import projects.ponto2d.domain.Ponto2D;

public class Reta {
    private Ponto2D[] pontos;

    public Reta(double m, double b) {
        pontos = new Ponto2D[7];

        for (int i = 0; i < 7; i++) {
            int x = i + 1;
            double y = m * x + b;
            pontos[i] = new Ponto2D(x, y);
        }
    }

    public void mostrarPontos() {
        for (Ponto2D ponto : pontos) {
            System.out.println(ponto);
        }
    }
}

