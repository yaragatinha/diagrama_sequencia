package descentralizado;
import java.util.List;

public class Pedido {

    private Cliente cliente;
    private List<LinhadePedido> linhasdePedido;
    private Double valorBase;
    
    public Double calcularPreco(){

        for(LinhadePedido linhaDePedido: linhasdePedido){
            valorBase += linhaDePedido.calcularPreco();
        }

        return cliente.obterValorComDesconto(this);
    }

    public Double obterValorBase() {
        return valorBase;
    }
}