package Model;

public interface ICartao {

    void Cartao(Conta conta, String tipoCartao);

    void cancelar (Cartao cartao);

    void pagarFatura (Cartao cartao, double valor);

    void estrato ();

}
