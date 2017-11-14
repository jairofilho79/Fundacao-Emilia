/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcio;

import java.util.Scanner;

/**
 *
 * @author Jairo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pega  = new Scanner(System.in);
        Administrativo a1 = new Administrativo();
        Vendedor       v1 = new Vendedor();
        int i;
        long k;
        double j;
        String str;
        
        do{
        System.out.println("Que tipo de funcionário você é?\n1 - Administrativo\n2 - Vendedor");
        i = pega.nextInt();
        }while(!(i>0&&i<3));
        
        System.out.println("Qual seu nome?");
        str = pega.nextLine();
        str = pega.nextLine();
        if(i==1)
            a1.setNome(str);
        else
            v1.setNome(str);
        
        System.out.println("Qual seu RG?"+i);
        k = pega.nextLong();
        if(i==1)
            a1.setRg(k);
        else
            v1.setRg(k);        
        
        System.out.println("Qual seu salário?");
        j = pega.nextDouble();
        if(i==1)
            a1.setSalario(j);
        else
            v1.setSalario(j);
        
        if(i==1){
            System.out.println("Quantas horas extras foram feitas?");
            j = pega.nextDouble();
            a1.setHorasExtras(j);
            do{
                System.out.println("Houve mais horas extras? [S/N]");
                str = pega.next().toLowerCase();
                if("s".equals(str)){
                    System.out.println("Quantas horas?");
                    j = pega.nextDouble();
                    a1.setHorasExtras(j);
                }                  
            }while(!("n".equals(str)));
            
            a1.imprimirSalario();
        }
        else{
            System.out.println("Quantos reais foram feitos em vendas?");
            j = pega.nextDouble();
            v1.setVendas(j);
            do{
                System.out.println("Houve mais vendas? [S/N]");
                str = pega.next().toLowerCase();
                if("s".equals(str)){
                    System.out.println("Quantos reais?");
                    j = pega.nextDouble();
                    v1.setVendas(j);
                }
            }while(!("n".equals(str)));
            
            v1.imprimirSalario();
        }
    
    }
}
