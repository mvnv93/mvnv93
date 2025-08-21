package br.com.alura.screenmatch.principal;

import br.com.alura.exercicios.Carro;
import br.com.alura.exercicios.CartaoDeCredito;
import br.com.alura.exercicios.Compra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe o limite do cartão: ");
        double limite = leitura.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int opcao = 1;
        while(opcao != 0){

            System.out.println("Digite a descrição da compra");
            String descricao = leitura.next();
            System.out.println("Digite o valor da compra");
            double valor = leitura.nextDouble();

            Compra compra = new Compra(valor, descricao);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if(compraRealizada){
                System.out.println("Compras realizadas!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                opcao = leitura.nextInt();
            }else {
                System.out.println("Saldo insuficiente");
                opcao = 0;
            }
        }

        System.out.println("*******************");
        System.out.println("COMPRAS REALIZADAS: \n");

        Collections.sort(cartao.getCompras());;
        for (Compra c : cartao.getCompras()){
            System.out.println(c.getDescricao() + " - " + c.getValor());
        }

        System.out.println("*******************");
        System.out.println("\n Saldo do cartão: "+cartao.getSaldo());
    }
}
