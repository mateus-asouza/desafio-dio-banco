package Model;

public class CartaoCredito extends Cartao {

    public CartaoCredito (Conta conta, String tipo) {
        super(conta,tipo);
    }

    @Override
    public void imprimirFatura(){
        System.out.println("=== Estrato Fatura ===");
        super.estrato();
    }

    @Override
    public void Cartao(Conta conta, String tipoCartao) {

    }

    @Override
    public void pagarFatura(Cartao cartao, double valor) {

    }
}
