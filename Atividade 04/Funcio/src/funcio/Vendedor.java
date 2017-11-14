/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcio;

/**
 *
 * @author Jairo
 */
public class Vendedor extends Funcionario {
    private double vendas = 0;

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas += vendas;
    }
    
    public void imprimirSalario(){
        salario += vendas*0.05;
        System.out.println("O salário do vendedor "+nome+" é R$"+salario);
        vendas = 0;
    }
}
