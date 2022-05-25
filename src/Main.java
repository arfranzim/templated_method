import model.Gateway;
import model.PagamentoCredito;
import model.PagamentoDebito;
import model.PagamentoDinheiro;

public class Main {

    public static void main(String[] args) {

        Gateway gateway = new Gateway();
        int valor = 1000;

        PagamentoCredito pagamentoCredito = new PagamentoCredito(valor, gateway);
        pagamentoCredito.realizaCobranca();

        PagamentoDebito pagamentoDebito = new PagamentoDebito(valor, gateway);
        pagamentoDebito.realizaCobranca();

        PagamentoDinheiro pagamentoDinheiro = new PagamentoDinheiro(valor, gateway);
        pagamentoDinheiro.realizaCobranca();
    }
}