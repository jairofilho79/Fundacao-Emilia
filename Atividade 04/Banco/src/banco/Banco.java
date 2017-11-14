/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author Jairo
 */
public class Banco {
    public static void main(String[] args) {
        Scanner pega = new Scanner(System.in);
        String titular;
        double saldo;
        int numeroDaConta,k=0;
        double valor;
        
        System.out.println("Cliente, diga seu nome.");
        titular = pega.nextLine();
        System.out.println(titular+", Qual o número da sua conta?");
        numeroDaConta = pega.nextInt();
        System.out.println(titular+", Qual seu saldo inicial?");
        saldo = pega.nextDouble();
        do{
            System.out.println("------------------------");
            System.out.println("Titular: "+titular+"\nNúmero da Conta: "+numeroDaConta+"\nSaldo: R$"+saldo);
            System.out.println("------------------------");
            System.out.println(titular+", o que deseja fazer:\n1 - SAQUE\n2 - DEPÓSITO\n3 - SAIR");
            k = pega.nextInt();
            switch(k){
                case 1:
                    System.out.println("Qual valor deseja sacar?");
                    valor = pega.nextDouble();
                    saldo = saque(saldo, valor);
                    break;
                case 2:
                    System.out.println("Qual valor deseja depositar?");
                    valor = pega.nextDouble();
                    saldo = deposito(saldo, valor);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Operação Inválida");
                    break;
            }
        }while(k!=3);
    }
    public static double saque(double saldo, double valor){
        if(valor<=0){
            System.out.println("Valor nulo ou negativo, operação não realizada.");
        }    
        else{
            if(valor>saldo){
                System.out.println("Saldo insuficiente. Operação não realizada com sucesso.");
            }
            else{
                saldo -= valor;
                System.out.println("Operação realizada com sucesso.");
            }
        }
        return saldo;
    }
    public static double deposito(double saldo, double valor){
            if(valor<=0){
                System.out.println("Valor nulo ou negativo, operação não realizada.");
            }else{    
                saldo += valor;
                System.out.println("Operação realizada com sucesso.");
            }    
        return saldo;
    }
    
}
