import singleton.Configuracao;
import strategy.PagamentoCartaoCredito;
import strategy.PagamentoPayPal;
import strategy.CarrinhoCompras;
import facade.PagamentoFacade;

public class Main {
    public static void main(String[] args) {
        // Uso do Singleton
        Configuracao config = Configuracao.getInstancia();
        config.setConfiguracao("moeda", "BRL");
        System.out.println("Moeda: " + config.getConfiguracao("moeda"));

        // Uso do Strategy
        CarrinhoCompras carrinho = new CarrinhoCompras();
        carrinho.setEstrategiaPagamento(new PagamentoCartaoCredito("1234-5678-9012-3456"));
        carrinho.realizarCompra(100);
        carrinho.setEstrategiaPagamento(new PagamentoPayPal("usuario@exemplo.com"));
        carrinho.realizarCompra(200);

        // Uso do Facade
        PagamentoFacade pagamentoFacade = new PagamentoFacade();
        pagamentoFacade.realizarPagamentoCartaoCredito(300);
        pagamentoFacade.realizarPagamentoPayPal(400);
    }
}
