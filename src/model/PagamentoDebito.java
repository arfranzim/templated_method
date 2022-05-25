package model;

public class PagamentoDebito extends Pagamento{

    public PagamentoDebito(float valor, Gateway gateway) { super(valor, gateway); }

    @Override
    public float calculaDesconto() { return (float) (this.valor * 0.05); }

    public float calculaTaxa() { return 4; }
}
