import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ContaBancaria contaDoGuido = new ContaCorrente(1234, 5678, 1000);
        contaDoGuido.deposita(2000);

        System.out.println("Saldo antes da transferencia: " + contaDoGuido.getSaldo());
        ContaBancaria outraConta = new ContaCorrente(5678, 1234, 1000);
        contaDoGuido.transfere(200, outraConta);

        sys
    }
}
