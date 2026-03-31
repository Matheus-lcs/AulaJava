public class Conta {
    protected double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public String descricao() {
        return "Conta";
    }
}
