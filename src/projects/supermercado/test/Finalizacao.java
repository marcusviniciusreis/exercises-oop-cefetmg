package projects.supermercado.test;

import projects.supermercado.domain.Carrinho;
import projects.supermercado.domain.Estoque;
import projects.supermercado.domain.Produto;

import java.util.Scanner;

public class Finalizacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Produto[] produtos = new Produto[7];
        produtos[0] = new Produto("Detergente",11111,1.00);
        produtos[1] = new Produto("Sabao em po",22222,6.50);
        produtos[2] = new Produto("Shampoo",33333,12.00);
        produtos[3] = new Produto("Creme dental",44444,3.50);
        produtos[4] = new Produto("Sabonete Nivea",55555,1.80);
        produtos[5] = new Produto("Biscoito maizena",66666,2.00);
        produtos[6] = new Produto("Leite desnatado",77777,3.00);

        Estoque[] estoque = new Estoque[7];
        for (int i = 0; i < estoque.length; i++) {
            estoque[i] = new Estoque(0);
            estoque[i].setProdutos(produtos[i]);
        }

        Carrinho carrinho = new Carrinho();

        int continuar = 1;

        System.out.println("Vamos iniciar as compras...");
        System.out.println("Criando seu carrinho de compras!");
        while (continuar != 0) {
            System.out.println("Digite o codigo do produto que deseja: ");
            int codigo = input.nextInt();

            boolean encontrado = false;

            for (int i = 0; i < estoque.length; i++) {
                if (estoque[i].consultarCodigo(codigo) == 1) {

                    System.out.println("Produto encontrado: "+estoque[i].getProduto().getDescricao());
                    System.out.println("Qual a quantidade desejada?");
                    int quantidade = input.nextInt();

                    Estoque itemCarrinho = new Estoque(quantidade, estoque[i].getProduto());
                    carrinho.adicionarItem(itemCarrinho);

                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Produto nao encontrado!");
            }

            System.out.println("Deseja continuar? (0-finalizar 1-sim)");
            continuar = input.nextInt();
        }

        System.out.println("\n===== CARRINHO =====");
        carrinho.imprimirCarrinho();

        System.out.println("\nTotal da compra: R$ " + carrinho.calcularTotal());
    }

}
