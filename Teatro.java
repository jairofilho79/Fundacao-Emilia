/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teatro;

import java.util.Scanner;

/**
 *
 * @author Jairo
 */
public class Teatro {

    public static void main(String[] args) {
        Scanner pega = new Scanner(System.in);
        int a = 0,b = 0,ax,bx,x;
        double c=1;
        boolean resp = false;
        String conf;        
        ax=bx=x=0;
        
        System.out.println("Olá! O espetáculo Marcelo e suas Mainframes espera por você!");
        System.out.println("Insira o número de fileiras");
        a = pega.nextInt();
        while(a<1){
           System.out.println("Número absurdo. Diga o número de fileiras");
            a = pega.nextInt(); 
        }
        System.out.println("Insira o número de poltronas por fileira");
        b = pega.nextInt();
        while(b<1){
           System.out.println("Número absurdo. Diga o número de poltronas por fileira");
           b = pega.nextInt(); 
        }//Strings que dependem do usuário.
        String[][][] sessao = new String[3][a][b];
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <a; j++) {
                for (int k = 0; k <b; k++) {
                    sessao[i][j][k] = "Poltrona Livre";                
                }                
            }            
        }
        double c1=Math.floor(4*a*b*3)/5;
        do{
            ax=bx=0;
            resp=false;
            System.out.println("Qual a sessão que você deseja participar? 1- MANHÃ 2- TARDE 3- NOITE");
            x = pega.nextInt();        
            int b1=0;
            do{
            switch(x){
                case 1:
                    b1=1;
                    System.out.println("Manhã\n");
                    break;
                case 2:
                    b1=1;
                    System.out.println("Tarde\n");
                    break;
                case 3:
                    b1=1;
                    System.out.println("Noite\n");
                    break;
                default:
                    System.out.println("Valor inválido");
                    x = pega.nextInt();
                    break;
            }
            }while(b1!=1);
            x-=1;        
            for (int i = 0; i<a; i++) {
                for (int j = 0; j<b; j++) {
                    System.out.print((i+1)+""+(j+1)+"-"+sessao[x][i][j]+"   ");                
                }
                System.out.println("");            
            }
            do{
            System.out.println("Insira o valor da fileira (valor a esquerda)");
            ax = pega.nextInt()-1;
            }while(!(ax<=a&&ax>=0));
            do{
            System.out.println("Insira o valor da poltrona (valor a direita)");
            bx = pega.nextInt()-1;
            }while(!(bx<=b&&bx>=0));
            int r=0;
            if(!"Poltrona Livre".equals(sessao[x][ax][bx])){
                do{                     
                    System.out.print("Poltrona já ocupada. Por favor, ");
                    do{
                    System.out.println("insira o valor da fileira (valor a esquerda)");
                    ax = pega.nextInt()-1;
                    }while(!(ax<=a&&ax>=0));
                    do{
                    System.out.println("Insira o valor da poltrona (valor a direita)");
                    bx = pega.nextInt()-1;
                    }while(!(bx<=b&&bx>=0));
                    if(r==1){
                        System.out.println("Qual a sessão que você deseja participar? 1- MANHÃ 2- TARDE 3- NOITE");
                        x = pega.nextInt();
                    }
                    r++;
                }while(!"Poltrona Livre".equals(sessao[x][ax][bx]));
                System.out.print("Diga seu nome: ");
                sessao[x][ax][bx] = pega.nextLine();
                sessao[x][ax][bx] = pega.nextLine();
            }
            else{
                System.out.print("Diga seu nome: ");
                sessao[x][ax][bx] = pega.nextLine();
                sessao[x][ax][bx] = pega.nextLine();
            }
                System.out.println("Você deseja cadastrar uma nova pessoa?[s/n]");
                conf= pega.next();
                int b2=0;
                    do{
                        switch(conf){
                            case "n":
                            case "N":
                                System.out.println("\nFoi um prazer! Até a próxima!");
                                b2=1;
                                break;
                            case "s":    
                            case "S":
                                resp=true;
                                System.out.println("\nOk, então vamos continuar!\n");
                                b2=1;
                                break;                    
                            default:
                                System.out.println("Caractere inválido, revalide sua resposta.");
                                conf = pega.next();
                                break;
                        }
                    }while(b2!=1);
        c+=1;            
        }while(resp==true&&c<c1);
        System.out.println("-------MAPA FINAL-------");
        for (int i = 0; i <3; i++) {
            if(i==0)
                System.out.println("-----Manhã-----");
            if(i==1)
                System.out.println("-----Tarde-----");
            if(i==2)
                System.out.println("-----Noite-----");
            for (int j = 0; j < a; j++) {
                for (int k = 0; k < b; k++) {
                    System.out.print(sessao[i][j][k]+"   ");                    
                }
                System.out.println("");
            }            
        }System.out.println("Capacidade total utilizada: "+(c-1)+" ("+(double)((c-1)/(double)(3*a*b)*100)+"%)");
    }
    
}
