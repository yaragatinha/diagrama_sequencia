package descentralizado;

public class Cliente {

    private Double percentualDesconto;

    public Double obterValorComDesconto(Pedido pedido){
        Double precoBase = pedido.obterValorBase();
        return precoBase - (precoBase*(percentualDesconto/100));
    }
}