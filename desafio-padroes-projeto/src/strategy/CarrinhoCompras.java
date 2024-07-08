package strategy;

public class CarrinhoCompras {
    private EstrategiaPagamento estrategiaPagamento;

    public void setEstrategiaPagamento(EstrategiaPagamento estrategiaPagamento) {
        this.estrategiaPagamento = estrategiaPagamento;
    }

    public void realizarCompra(int quantia) {
        estrategiaPagamento.pagar(quantia);
    }
}

