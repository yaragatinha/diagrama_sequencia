package centralizado;

public class LinhadePedido {

    private Integer quantidade;
    private Produto produto;

    public Integer obterQuantidade() {
      return quantidade;
    }

    public LinhadePedido(Integer quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public Produto obteProduto(){
        return produto;
    }

    public Produto obterProduto() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obterProduto'");
    }
}
