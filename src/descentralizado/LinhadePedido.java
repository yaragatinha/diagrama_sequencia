package descentralizado;

public class LinhadePedido {

    private Integer quantidade;
    private Produto produto;

    public double calcularPreco(){
        Double preco = produto.obterDetalhesPreco();
        return preco*quantidade;
    }       
    
}
