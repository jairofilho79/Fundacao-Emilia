/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta4;

import java.util.Scanner;

/**
 *
 * @author Jairo
 */
public class Conta4 {
        String titular;
        double saldo;
        int numeroDaConta;
        
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
        Conta4 c1 = new Conta4();
        
        System.out.println("Cliente, diga seu nome.");
        c1.titular = pega.nextLine();
        System.out.println(c1.titular+", Qual o número da sua conta?");
        c1.numeroDaConta = pega.nextInt();
        System.out.println(c1.titular+", Qual seu saldo inicial?");
        c1.saldo = pega.nextDouble();
        do{
            System.out.println("------------------------");
            System.out.println("Titular: "+c1.titular+"\nNúmero da Conta: "+c1.numeroDaConta+"\nSaldo: R$"+c1.saldo);
            System.out.println("------------------------");
            System.out.println(c1.titular+", o que deseja fazer:\n1 - SAQUE\n2 - DEPÓSITO\n3 - SAIR");
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
