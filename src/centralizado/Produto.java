package centralizado;

public class Produto {

    public Produto(Double preco) {
        this.preco = preco;
    }
    private Double preco;
    public Double obterDetalhesPreco(){
        return preco;
    }
}
