package Model;

public interface IConta {

    void sacar (int valor);

    void depositar (int valor);

    void transferir (int valor, Conta contaDestino);

    void estrato (Conta conta);



}
