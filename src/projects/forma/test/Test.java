package projects.forma.test;

import projects.forma.domain.Espaco2D;
import projects.forma.domain.Forma;
import projects.forma.domain.Ponto2D;


public class Test {
    public static void main(String[] args) {
        Espaco2D espaco = new Espaco2D();

        Ponto2D[] p1 = {new Ponto2D(2, 3), new Ponto2D(4, 1), new Ponto2D(6, 3)};
        Forma f1 = Forma.geraFormas(p1);
        espaco.adicionarForma(f1);

        Ponto2D[] p2 = {new Ponto2D(0, 0), new Ponto2D(2, 0), new Ponto2D(2, 2), new Ponto2D(0, 2)};
        Forma f2 = Forma.geraFormas(p2);
        espaco.adicionarForma(f2);

        Ponto2D[] p3 = {new Ponto2D(0, 0), new Ponto2D(0, 3)};
        Forma f3 = Forma.geraFormas(p3);
        espaco.adicionarForma(f3);


        System.out.println("Tipos de Triângulos:");
        System.out.println(espaco.mostrarTipoTriangulo());

        System.out.println("Área total: " + espaco.calcularAreaTotal());
        System.out.println("Perímetro total: " + espaco.calcular2p());

    }
}
