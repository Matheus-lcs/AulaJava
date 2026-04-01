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

    // Operacoes

    public boolean depositar(double valor) {
        if (valor <= 0) {
            return false;
        }

        this.saldo += valor;
        return true;
    }

    public boolean sacar(double valor) {
        if (valor <= 0 || valor > this.saldo)
            return false;

        this.saldo -= valor;
        return true;
    }

    public String descricao() {
        return "Conta";
    }
}
