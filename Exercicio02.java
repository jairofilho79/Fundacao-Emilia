package exe1;

import static java.lang.Math.PI;
import static java.lang.Math.cos;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.tan;
import java.util.Scanner;

public class Exercicio02 {
        
    public static void main(String[] args) {
        Scanner pega = new Scanner(System.in);
        double b=0,h=0,a=0,ar,d=0,p=0,v=0,media=0,r,c,f,t,vo,da,dg,ang;
        Double[] val = new Double[5];
        int x=0;
        do{
        System.out.println("Qual programa você quer executar? Digite 0 para sair");
        x = pega.nextInt();
        switch(x){
            case 0:
                p=1;
                break;
            
            case 1: 
                     
                System.out.println("Diga a base");
                b = pega.nextDouble();
        
                System.out.println("Diga a altura");
                h = pega.nextDouble();
        
                a = b*h;
        
                System.out.println("A área do retângulo é "+a);
                break;
            case 2:
        
                System.out.println("Diga a aresta");
                ar = pega.nextDouble();
        
                a = ar*ar;
        
                System.out.println("A área do quadrado é "+a);
                break;
                
            case 3:
                System.out.println("Diga a diagonal");
                d = pega.nextDouble();                
        
                a = pow(d/(pow(2,0.5)),2);
        
                System.out.println("A área do quadrado é "+a);
                break;
                
            case 4:
                System.out.println("Diga o diâmetro");
                d = pega.nextDouble();
        
                v = pow(d/2,3)*4*PI/3;
        
                System.out.println("O volume da esfera é "+v);
                break;
            case 5:
                for(int i=0;i<4;i++){
                System.out.println("Digite o valor");
                val[i] = pega.nextDouble();
                media += val[i];
        }
                media /=4;
        
                System.out.println("Media dos números "+val[0]+" "+val[1]+" "+val[2]+" "+val[3]+" é "+media);
                break;
                
            case 6:
                System.out.println("Insira a Resistência.");
                r = pega.nextDouble();
        
                System.out.println("Insira a corrente.");
                c = pega.nextDouble();
        
                v = r*c;
        
                System.out.println("A tensão é "+v);
                break;
                
            case 7:
                System.out.println("Digite a temperatura em Celcius");
                c = pega.nextDouble();
        
                f = 1.8*c +32;
        
                System.out.println("A temperatura em Fahrenheit é "+f);
                break;
                
            case 8:
                System.out.println("Diga a velocidade inicial");
                vo = pega.nextDouble();
        
                System.out.println("Diga a aceleração");
                a = pega.nextDouble();
        
                System.out.println("Diga o tempo");
                t = pega.nextDouble();
        
                v = (vo+a*t)*3.6;
        
                System.out.println("A velocidade é de "+v+"Km/h");
                break;
                
            case 9:
                System.out.println("Diga o raio");
                r = pega.nextDouble();
                da = 2*r;
        
                do{
                    System.out.println("Diga a aresta do cubo Inscrito");
                    a = pega.nextDouble();
                    dg = a*pow(2,0.5);
                }while(dg>da);        
        
                v = pow(r,3)*4*PI/3 - pow(a,3);
        
                    System.out.println("O volume livre é "+v);
                break;
                
            case 10:
                do{
                    System.out.println("Diga o ângulo em graus.");
                    ang = pega.nextDouble();
                }while(!(ang>=0&&ang<=360));
                System.out.println("Sobre o ângulo "+ang);
                ang *=PI/180;
                System.out.println("O seno é "+sin(ang));
                System.out.println("O cosseno é "+ cos(ang));
                System.out.println("A tangente é "+ tan(ang));
                System.out.println("A secante é "+ 1/cos(ang));
                break;
                
            case 11:                
                double maior=0,menor=0;
                int i=0;
               do {
                    a = i+1;
                    System.out.println("Insira o "+a+"º número");
                    val[i] = pega.nextDouble();
                    if(i==0){
                        maior=val[0];
                        menor=val[0];
                    }
                    if(val[i]>maior){
                        maior = val[i];
                    }
                    else if(val[i]<menor){
                        menor = val[i];
                    }   
                    i++;
                }while(i<5);
                System.out.println("O maior é "+maior+"\nO menor é "+menor);
                break;
                
            case 12:
                System.out.println("Diga a base");
                b = pega.nextDouble();
        
                System.out.println("Diga a altura");
                h = pega.nextDouble();
        
                a = b*h;
                if(a>100){
                    System.out.println("A área do retângulo é "+a+". Terreno grande!");
                }
                else
                    System.out.println("A área do retângulo é "+a+". Terreno pequeno.");
                break;
            case 13:
                System.out.println("Diga o peso");
                p = pega.nextDouble();
                
                System.out.println("Diga a altura");
                h = pega.nextDouble();
                
                b = p/(h*h);//b é relação peso/altura²
                if(b<20){
                    System.out.println("Abaixo do peso");
                }
                else if(b<=25){
                    System.out.println("Peso ideal");
                }
                else
                    System.out.println("Acima do peso");
                break;
                
            case 14:
                System.out.println("Informe o valor do lado A:");
                a = pega.nextInt();
                System.out.println("Informe o valor do lado B:");
                b = pega.nextInt();
                System.out.println("Informe o valor do lado C:");
                c = pega.nextInt();

                if (a + b < c || a + c < b || b + c < a) {
                    System.out.println("As dimensões não pertence a um triângulo!");
                } else if (a == b && a == c) {
                    System.out.println("Triângulo Equilátero!");
                } else if ((a == b && a != c) || (a == c && a != b) || (b == c && a != c)) {
                    System.out.println("Triângulo  Isósceles!");
                }else{
                    System.out.println("Triângulo escaleno!");
                }
                break;
            case 15:
                System.out.println("Diga a velocidade inicial");
                vo = pega.nextDouble();
        
                System.out.println("Diga a aceleração");
                a = pega.nextDouble();
        
                System.out.println("Diga o tempo");
                t = pega.nextDouble();
        
                v = (vo+a*t)*3.6;
        
                System.out.println("A velocidade é de "+v+"Km/h");
                
                     if(v<=40)
                        System.out.println("Veículo muito lento.");
                else if(v<=60)
                        System.out.println("Velocidade permitida");
                else if(v<=80)
                        System.out.println("Velocidade de cruzeiro");
                else if(v<=120)
                        System.out.println("Veículo rápido");
                else
                        System.out.println("Veículo muito rápido");
                break;
                
            case 16:
                for (i = 0; i < 2; i++) {
                    do{
                    System.out.println("Diga a nota entre 0 e 10");
                    val[i] = pega.nextDouble();
                    }while(!(val[i]>=0 && val[i]<=10));
                }
                media = (val[0]+2*val[1])/3;
                if(media<5)
                    System.out.println("Aluno reprovado. Média "+media);
                else
                    System.out.println("Aluno aprovado. Média "+media);                
                break;
                
            case 17:
                
                do{
                    System.out.println("Digite um número positivo.");
                    a = pega.nextDouble();
                }while(!(a>0));
                System.out.println("Número aceito :)");
                break;
                
            case 18:
                System.out.println("Digite o primeiro valor");
                a = pega.nextDouble();
                
                do{
                   System.out.println("Digite um valor maior que "+a);
                   b = pega.nextDouble(); 
                }while(!(b>a));
                
                System.out.println("\nBeleza, vlw!");
                break;
                
            case 19:
                boolean se=false;
                do{
                    System.out.println("Digite um valor natural");
                    a = pega.nextDouble();
                    b = (int)a;
                    if(a==b && a>0)
                        se = true;
                }while(se==false);
                x = (int)a;
                for (int j = 1; j <11; j++) {
                    System.out.println(x+"*"+j+" = "+x*j);                    
                }
                break;
                
            case 20:
                /*System.out.println("Diga até que número da sequência você deseja");
                h = pega.nextDouble();
                
                
                
                if(h==1){
                    System.out.print("0");
                    break;
                }
                if(h==2){
                    System.out.print("0 1");
                    break;
                }*/
                a = p = 0;
                b = 1;
                h=30;
                System.out.print("0 1 ");
                for (int j = 0; j <h; j++) {
                       i = (int)(a+b);
                       System.out.print(i+" ");
                       a = b;
                       b = i;
                }
                System.out.println(" ");
                break;
            
            default: 
                System.out.println("Operação inválida, tente novamente.");
                break;
        }
    }while(p!=1);
  }
}
