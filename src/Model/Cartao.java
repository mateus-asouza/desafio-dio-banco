package Model;

import jdk.jshell.spi.SPIResolutionException;

public abstract class Cartao implements ICartao{
    protected static int SEQUECIAL = 1;
    protected int numeroCartao;
    protected String tipoCartao;
    protected int contaTitular;
    protected double fatura;
    protected Conta conta;
    protected boolean status;

    public Cartao(Conta conta,String tipoCartao) {
        this.conta = conta;
        this.numeroCartao = SEQUECIAL++;
        this.tipoCartao =  tipoCartao;
        this.contaTitular = conta.numero;
        this.status = true;
    }

  /* public void Cartao(Conta conta, String tipoCartao){

    }*/


    public void cancelar (Cartao cartao){
            if(status){
                status = false;
                System.out.println("Cartão cancelado!");
            }else
                System.out.println("O cartão já esta cancelado!");
    }

    public void usarCartao (Cartao cartao, double valor){
        if (numeroCartao == getNumeroCartao()) {
            fatura += valor;
        }else
            System.out.println("Cartão inválido!");
    }

    public void pagarFatura (Conta conta, double valor){
            if (conta.numero == conta.getNumero()){
                fatura -= valor;
            }else
                System.out.println("Numero do cartão incorreto!");
    }

    public void estrato (){
        System.out.println("=============================== Fatura cartao ==========================");
        System.out.println(String.format("Conta: %d",this.contaTitular));
        System.out.println(String.format("Cliente: %s",conta.cliente.nome));
        System.out.println(String.format("Fatura atual: %.2f",this.fatura));
    }

    public void imprimirFatura(){

    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(String tipoCartao) {
        this.tipoCartao = tipoCartao;
    }

    public int getContaTitular() {
        return contaTitular;
    }

    public void setContaTitular(int contaTitular) {
        this.contaTitular = contaTitular;
    }

    public double getFatura() {
        return fatura;
    }

    public void setFatura(double fatura) {
        this.fatura = fatura;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
