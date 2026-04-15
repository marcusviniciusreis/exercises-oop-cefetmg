package projects.supermercado.domain;

public class Estoque {
    private int quantidade;
    private Produto produto;

    public int consultarCodigo(int codigo){
        if (produto.getCodigo() == codigo){
            return 1;
        }else {
            return 0;
        }
    }

    public Estoque(int quantidade) {
        this.quantidade = 0;
    }

    public Estoque(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProdutos(Produto produto) {
        this.produto = produto;
    }
}
