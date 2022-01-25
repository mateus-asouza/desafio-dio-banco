import Model.*;

import java.io.IOException;
import java.util.Scanner;

public class ApplicationBanco {

    public static void main(String[] args) throws IOException {

        Endereco endereco = new Endereco();
        endereco.setRua("rua fulano de tal");
        endereco.setComplemento("Quadra 16, lote 12");
        endereco.setNumero(475);

        Cliente cliente = new Cliente();
        cliente.setNome("Mateus");
        cliente.setCpf("11111111111");
        cliente.setEndereco(endereco);

        Conta contaCorrente = new ContaCorrente(cliente);
        Conta contaPouapanca = new ContaPoupanca(cliente);
        Cartao cartaoCredito = new CartaoCredito(contaCorrente,"credito");

        cartaoCredito.usarCartao(cartaoCredito,200);
        contaCorrente.depositar(400);

        contaCorrente.imprimirExtrato();
        contaPouapanca.imprimirExtrato();
        cartaoCredito.imprimirFatura();

        contaCorrente.transferir(100,contaPouapanca);
        cartaoCredito.pagarFatura(contaCorrente,200);

        contaCorrente.imprimirExtrato();
        contaPouapanca.imprimirExtrato();
        cartaoCredito.imprimirFatura();



    }

}





