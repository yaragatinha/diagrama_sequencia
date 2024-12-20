package centralizado;

public class Cliente {

    public Cliente(Double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }
    private Double percentualDesconto;
    public Double obterinformacaoDeDesconto(){
        return percentualDesconto;
    } 

}
