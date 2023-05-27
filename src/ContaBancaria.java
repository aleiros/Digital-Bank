public abstract class ContaBancaria {

    private int agencia;
    private int numero;
    private double saldo;

    public ContaBancaria(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public abstract void saca(double valor);

    public abstract void transfere(double valor, ContaBancaria contaDestino);

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getlimite() {
        return null;
    }

}
