package strategy;

public class PagamentoPayPal implements EstrategiaPagamento {
    private String email;

    public PagamentoPayPal(String email) {
        this.email = email;
    }

    @Override
    public void pagar(int quantia) {
        System.out.println("Pagando " + quantia + " usando PayPal " + email);
    }
}
