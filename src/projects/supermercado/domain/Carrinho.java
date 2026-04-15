package projects.supermercado.domain;

import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Estoque> itens = new ArrayList<>();

    public void adicionarItem(Estoque item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;

        for (Estoque item : itens) {
            total += item.getQuantidade() * item.getProduto().getValor();
        }

        return total;
    }

    public void imprimirCarrinho() {
        for (Estoque item : itens) {
            System.out.println("--------------");
            System.out.println("Produto: " + item.getProduto().getDescricao());
            System.out.println("Quantidade: " + item.getQuantidade());
        }
    }
}
