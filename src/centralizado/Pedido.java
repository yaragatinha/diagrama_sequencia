package centralizado;
import java.util.List;

public class Pedido {

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    private Cliente cliente;
    private List<LinhadePedido> linhadePedido;
    
    public Double calcularPreco (){
        Double precoFinal = 0.0;
        for (LinhadePedido linhadePedido: linhadePedido){
            Integer quantidade = linhadePedido.obterQuantidade();
            Produto produto = linhadePedido.obterProduto();
            Double preco = produto.obterDetalhesPreco();

            Double precoBase = calcularPrecoBase(quantidade, preco); 
            Double precoComDesconto = calcularDescontos(precoBase);

            precoFinal += precoComDesconto;
        }
        return precoFinal;
    } 

    public Double calcularPrecoBase(Integer preco, Double quantidade){
        return preco * quantidade;
    }

    public Double calcularDescontos(Double precoBase){
            Double informacaoDesconto = cliente.obterinformacaoDeDesconto();
    
            return precoBase - (precoBase * (percentualDesconto /100));

    }

}
