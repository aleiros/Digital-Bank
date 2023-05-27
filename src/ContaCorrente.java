import javax.print.attribute.standard.Destination;

public class ContaCorrente extends ContaBancaria {

    private double limite;
    private final double limiteFixo = 1000;
    private double saldo;

    public ContaCorrente(int agencia, int numero, double limite) {
        super(agencia, numero);
        this.limite = limite;
    }

    @Override
    public void deposita(double valor) {
        double diferencaLimite = this.limiteFixo - this.limite;
        if (diferencaLimite == 0) {
            super.deposita(valor);
        } else {
            double diferencaValor = valor - diferencaLimite;
            if (diferencaValor > 0) {
                this.limite += diferencaLimite;
                super.deposita(diferencaValor);
            } else {
                this.limite = diferencaLimite;
            }
        }
    }

    @Override
    public void saca(double valor) {
        double diferencaValor = valor - this.saldo;
        if (diferencaValor <= 0) {
            this.saldo -= valor;
        } else {
            this.saldo = 0;
            this.limite -= diferencaValor;
        }
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public void transfere(double valor, ContaBancaria contaDestino) {
        this.saca(valor);
        contaDestino.deposita(valor);
    }
    
    public double getSaldo() {
        return this.saldo;
    }

}
