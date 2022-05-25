package model;

public class PagamentoCredito extends Pagamento {

    public PagamentoCredito(float valor, Gateway gateway) { super(valor, gateway); }

    @Override
    public float calculaDesconto() {

        if (this.valor > 300) { return (float) (this.valor * 0.02); }

        return 0;
    }

    public float calculaTaxa() { return (float) (this.valor * 0.05); }
}
