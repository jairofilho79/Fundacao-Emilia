/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

import java.util.Scanner;

/**
 *
 * @author Jairo
 */
public class Conta {
        private String titular;
        private double saldo;
        private int numeroDaConta;
        
        //Acontece que não é mais permitido acessar os atirbutos diretamente no programa principal. Logo, para acessá-los ou modificá-los são necessários os Getters e Setters. 
        
        
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

        
    public void saque(double valor){
        if(valor<=0){
            System.out.println("Valor nulo ou negativo, operação não realizada.");
        }    
        else{
            if(valor>this.saldo){
                System.out.println("Saldo insuficiente. Operação não realizada com sucesso.");
            }
            else{
                this.saldo -= valor;
                System.out.println("Operação realizada com sucesso.");
            }
        
        }    
    }
    public void deposito(double valor){
        if(valor<=0){
            System.out.println("Valor nulo ou negativo, operação não realizada.");
        }else{
            this.saldo += valor;
            System.out.println("Operação realizada com sucesso.");
        }    
    }
       
    public static void main(String[] args) {
        Scanner pega = new Scanner(System.in);
        int k;
        double d;
        String str;
        double valor;
        Conta c1 = new Conta();
        
        System.out.println("Cliente, diga seu nome.");
        str= pega.nextLine();
        c1.setTitular(str);
        System.out.println(c1.getTitular()+", Qual o número da sua conta?");
        k = pega.nextInt();
        c1.setNumeroDaConta(k); 
        System.out.println(c1.getTitular()+", Qual seu saldo inicial?");
        d = pega.nextDouble();
        c1.setSaldo(d);
        do{
            System.out.println("------------------------");
            System.out.println("Titular: "+c1.getTitular()+"\nNúmero da Conta: "+c1.getNumeroDaConta()+"\nSaldo: R$"+c1.getSaldo());
            System.out.println("------------------------");
            System.out.println(c1.getTitular()+", o que deseja fazer:\n1 - SAQUE\n2 - DEPÓSITO\n3 - SAIR");
            k = pega.nextInt();
            switch(k){
                case 1:
                    System.out.println("Qual valor deseja sacar?");
                    valor = pega.nextDouble();
                    c1.saque(valor);
                    break;
                case 2:
                    System.out.println("Qual valor deseja depositar?");
                    valor = pega.nextDouble();
                    c1.deposito(valor);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Operação Inválida");
                    break;
            }
        }while(k!=3);
    }
}