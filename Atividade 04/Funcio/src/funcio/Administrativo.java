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
public class Administrativo extends Funcionario {
    private double horasExtras=0;

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras += horasExtras;
    }
    
       
    public void imprimirSalario(){
        salario +=horasExtras*0.01*salario/176;
        System.out.println("O salário do administrativo "+nome+" é R$"+salario);
        horasExtras = 0;
    }
}
