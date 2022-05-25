package model;

public class PagamentoDinheiro extends Pagamento{

    public PagamentoDinheiro(float valor, Gateway gateway) { super(valor, gateway); }

    @Override
    public float calculaDesconto() { return (float) (this.valor * 0.1); }
}
