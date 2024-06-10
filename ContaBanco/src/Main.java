public class Main {
    public static void main(String[] args) {
        Cliente otelo = new Cliente();
        otelo.setNome("Otelo");

        Conta cc = new ContaCorrente(otelo);
        Conta poupanca = new ContaPoupanca(otelo);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
