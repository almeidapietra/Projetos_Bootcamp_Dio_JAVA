package strategy;

public class PagamentoCartaoCredito implements EstrategiaPagamento {
    private String numeroCartao;

    public PagamentoCartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void pagar(int quantia) {
        System.out.println("Pagando " + quantia + " usando cartão de crédito " + numeroCartao);
    }
}
