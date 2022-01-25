package Model;

public abstract class Conta implements IConta {

    protected static final int CODIGO_AGENCIA = 1;
    protected static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.CODIGO_AGENCIA;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void sacar(int valor) {
        saldo -= valor;
    }

    public void depositar(int valor) {
        saldo += valor;
    }

    public void transferir(int valor, Conta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
    }

    public void estrato(Conta conta) {

    }


    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }


    public static int getSEQUENCIAL() {
        return SEQUENCIAL;
    }

    protected static void setSEQUENCIAL(int SEQUENCIAL) {
        Conta.SEQUENCIAL = SEQUENCIAL;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public abstract void imprimirExtrato();
}
