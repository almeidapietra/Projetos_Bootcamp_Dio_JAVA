package facade;

import strategy.PagamentoCartaoCredito;
import strategy.PagamentoPayPal;
import strategy.CarrinhoCompras;

public class PagamentoFacade {
    private CarrinhoCompras carrinho;

    public PagamentoFacade() {
        carrinho = new CarrinhoCompras();
    }

    public void realizarPagamentoCartaoCredito(int quantia) {
        carrinho.setEstrategiaPagamento(new PagamentoCartaoCredito("1234-5678-9012-3456"));
        carrinho.realizarCompra(quantia);
    }

    public void realizarPagamentoPayPal(int quantia) {
        carrinho.setEstrategiaPagamento(new PagamentoPayPal("usuario@exemplo.com"));
        carrinho.realizarCompra(quantia);
    }
}
