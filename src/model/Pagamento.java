package model;

public abstract class Pagamento {
    protected float valor;
    protected Gateway gateway;

    public Pagamento(float valor, Gateway gateway) {
        this.valor = valor;
        this.gateway = gateway;
    }

    public abstract float calculaDesconto();

    public float calculaTaxa() { return 0; }

    public void realizaCobranca() {

        float valorFinal = this.valor + this.calculaTaxa() - this.calculaDesconto();

        imprimeCalculoDecomposto(valorFinal);

        this.gateway.cobrar(valorFinal);
    }

    private void imprimeCalculoDecomposto(float valorFinal) {
        System.out.println( this.valor + " + " + this.calculaTaxa() + " - " +  this.calculaDesconto() + " = " + valorFinal);
    }
}
