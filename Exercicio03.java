package exe03;
import static java.lang.Math.PI;
import java.util.Arrays;
import java.util.Scanner;
public class Exercicio03 {
    
    public static void main(String[] args) {
        Scanner pega = new Scanner(System.in);
        double y=0,a=0,b=0;
        int x=0,p=0,g=0,t=0,z=0,c=0;
        int[]oi = new int[10];
        double[] num = new double[20];
        double[] num2 = new double[20];
        double maior,soma,media;
        double n1=0,n2=0;
        String conf;
        String[] nome = new String[20];
        String[] sexo = new String[20];
        double[][] matrix = new double[3][3];
        String[][] names = new String[3][3];
        for (int i = 0; i < nome.length; i++) {
            nome[i] = "";
            sexo[i] = "";            
        }
        System.out.println("Bem-vindo a parte 01 da atividade 03");
        do{
        System.out.println("Qual programa você quer executar? Digite 0 para sair");
        x = pega.nextInt();
        switch(x){
            case 0:
                p=1;
                break;            
            case 1:
                do{
                System.out.println("Insira o número positivo");
                y = pega.nextDouble();
                }while(!(y>0));
                do{
                System.out.println("Insira o número positivo");
                a = pega.nextDouble();
                }while(!(a>0));
                do{
                System.out.println("Insira o número positivo maior que "+a);
                b = pega.nextDouble();
                }while(!(b>a));
                
                System.out.println("A tabuada de "+y+" no intervalo de "+b+" até "+a+" é:");
                for(double i=b;i>=a;i--){
                    System.out.println((int)y+"*"+(int)i+" é "+(int)(y*i));
                }                
                break;
            case 2:
                p=z=t=x=g=c=0;
                y=0;
                System.out.println("Insira o número positivo menor que 50.");
                p = pega.nextInt();
                
                while(!(p>0&&p<50)){
                System.out.println("Número inválido. Insira o número positivo menor que 50.");
                p = pega.nextInt();
                }
                //Nesse if é determinado como vai aparecer, no caso, em forma de fração. Só não aparece assim para todos por conta do overflow.
                if(p<16){
                    g = mmc(1,2,p);
                    for(int i=1;i<=p;i++){if(i==9){ System.out.print(" ");} System.out.print(i+" ");}
                    for(int i=1;i<=p;i++){
                        z = i*g/(i+1);//acha o numerador a partir do novo denominador
                        t+=z;//soma os numeradores.
                    }
                    x = t;
                    t = simplificar(t,g,1);
                    System.out.print(" "+t);
                    System.out.println("");
                    for(int i=0;i<p;i++) {
                        if(i>7)
                            System.out.print("-");
                        System.out.print("- ");}
                    System.out.print("=");
                    while(t !=0) {
                        t = t/10;
                        c++;
                    }
                    for (int i = 0; i <c; i++) {
                        System.out.print("-");                       
                    }
                    System.out.println("");
                    for(int i=2;i<=p+1;i++) System.out.print(i+" ");
                    g = simplificar(x,g,0);
                    System.out.println(" "+g);
                }
                else{
                    for(double i=1;i<=p;i++) {
                        System.out.print((int)i+" ");
                        if(i==9) System.out.print(" ");
                        y+=(double)(i/(i+1));
                    }
                    System.out.println("");
                    for(int i=0;i<p;i++) {if(i>7)System.out.print("-"); System.out.print("- ");}
                    System.out.println("= "+y);
                    for(int i=2;i<=p+1;i++) System.out.print(i+" ");                    
                }
                System.out.println("");
                p=0;//para não bugar o programa.
                break;                
            case 3:
                maior=soma=media=0;
                 for (int i = 0; i <10; i++) {
                    System.out.println("Insira o valor");
                    num[i] = pega.nextDouble();
                     while(!(num[i]>0)){        
                        System.out.println("Número inválido. Insira o valor");
                        num[i] = pega.nextDouble();
                    }
                    if(num[i]>maior)
                        maior = num[i];
                    soma+=num[i];
                }        
                media = soma/10;
        
                System.out.println("O maior valor é "+maior+"\nA soma dos valores é "+soma+"\nA media dos valores é "+media);
                break;                
            case 4:
                 c=0;
                 do{
                    double menor,cp=0,cn=0;
                    media=0;
                    x=0;
                    c=0;   
                    System.out.println("Insira a quantidade de números");
                    x = pega.nextInt();
                    while(!(x>0&&x<20)){        
                        System.out.println("Número inválido. Insira o valor");
                        x = pega.nextInt();
                    }
                    System.out.println("Insira o valor");
                    num[0] = pega.nextDouble();
                    maior = menor = soma = num[0];
                    if(num[0]<0)
                        cn++;
                    else if(num[0]>0)
                        cp++;
                    for (int i = 1; i <x; i++) {
                        System.out.println("Insira o valor");
                        num[i] = pega.nextDouble();
                        if(num[i]>maior)
                            maior = num[i];
                        if(num[i]<menor)
                            menor = num[i];        
                        soma+=num[i];
                        if(num[i]<0)
                            cn++;
                    else if(num[i]>0)
                            cp++;
                    }        
                    media = soma/x;
                    cp = cp/x*100;
                    cn = cn/x*100;
                    System.out.println("O maior valor é "+maior+"\nO menor valor é "+menor+"\nA soma dos valores é "+soma+"\nA media aritmética dos valores é "+media+"\nA porcentagem de valores negativos é "+cn+"%\nA porcentagem de valores positivos é "+cp+"%.");
                    System.out.println("\nDeseja continuar? [S/N]");
                    conf = pega.next();
                    b=0;
                    do{
                        switch(conf){
                            case "N":
                                System.out.println("\nFoi um prazer! Até a próxima!");
                                c=1;
                                b=1;

                                break;
                            case "S":
                                System.out.println("\nOk, então vamos continuar!\n");
                                b=1;
                                break;
                            default:
                                System.out.println("Caractere inválido, revalide sua resposta.");
                                conf = pega.next();
                                break;
                        }
                    }while(b!=1);
                }while(c!=1);
                break;
            case 5:
                    c=0;
                    do{
                        int fat=1,n=0;
                        System.out.println("Insira um valor positivo.");
                        n = pega.nextInt();
                        while(!(n>0)){
                            System.out.println("Valor inválido. Insira um valor positivo.");
                            n = pega.nextInt();
                        }

                        for (int i = 1; i <=n; i++) {
                            fat *=i;            
                        }
                        System.out.println("O fatorial de "+n+" é "+fat);

                    //Se deseja continuar
                    System.out.println("\nDeseja efetuar novo cálculo? [S/N]");
                        conf = pega.next();
                        b=0;
                        do{
                        switch(conf){
                            case "N":
                                System.out.println("\nFoi um prazer! Até a próxima!");
                                c=1;
                                b=1;
                                break;
                            case "S":
                                 System.out.println("\nOk, então vamos continuar!\n");
                                 b=1;
                                 break;
                            default:
                                System.out.println("Caractere inválido, revalide sua resposta.");
                                conf = pega.next();
                                break;
                        }
                        }while(b!=1);
                    }while(c!=1);
                break;                
            case 6:
                c=0;
                x=0;
                do{
                    System.out.println("Insira um valor");
                    n1 = pega.nextDouble();
                    System.out.println("Insira um outro valor");
                    n2 = pega.nextDouble();
                    System.out.println("Escolha a opção\n1 - MULTIPLICAÇÃO\n2 - ADIÇÃO\n3 - DIVISÃO\n4 - SUBTRAÇÃO\n5 - FIM DE PROCESSO");
                    x = pega.nextInt();

                    do{
                    switch(x){
                        case 1:
                            System.out.println("A multiplicação de "+n1+" com "+n2+" é "+(n1*n2));
                            break;
                        case 2:
                            System.out.println("A soma de "+n1+" com "+n2+" é "+(n1+n2));
                            break;
                        case 3:
                            if(n2==0){
                                do{
                                System.out.println("Divisão por 0. Operação inválida. Insira outro número");
                                n2 = pega.nextDouble();
                                }while(!(n2!=0));
                            }                    
                            System.out.println("A divisão de "+n1+" com "+n2+" é "+(n1/n2));
                            break;
                        case 4:
                            System.out.println("A subtração de "+n1+" com "+n2+" é "+(n1-n2));
                            break;
                        case 5:
                            System.out.println("\nFoi um prazer! Até a próxima! ;)");
                            c=1;
                            break;
                        default:
                            System.out.println("Caractere inválido, revalide sua resposta.");
                            x = pega.nextInt();
                            break;
                    }
                    }while(!((x>0)&&(x<6)));
                }while(c!=1);

                break;                
            case 7:
                c=0;
                x=0;
                do{

                    
                    System.out.println("Escolha a opção\n1 - TRIÂNGULO\n2 - QUADRADO\n3 - RETÂNGULO\n4 - CÍRCULO\n5 - FIM DE PROCESSO");
                    x = pega.nextInt();

                    do{
                    switch(x){
                        case 1:
                            System.out.println("Insira a base");
                            n1 = pega.nextDouble();
                            System.out.println("Insira a altura");
                            n2 = pega.nextDouble();
                            System.out.println("A área do triângulo é "+(n1*n2/2));
                            break;
                        case 2:
                            System.out.println("Insira o lado do quadrado");
                            n1 = pega.nextDouble();
                            System.out.println("A área do quadrado é "+(n1*n1));
                            break;
                        case 3:
                            System.out.println("Insira a base");
                            n1 = pega.nextDouble();
                            System.out.println("Insira a altura");
                            n2 = pega.nextDouble();
                            System.out.println("A área do retângulo é "+(n1*n2));
                            break;
                        case 4:
                            System.out.println("Insira o raio");
                            n1 = pega.nextDouble();
                            System.out.println("A área do círculo é "+(n1*n1*PI));
                            break;
                        case 5:
                            System.out.println("\nFoi um prazer! Até a próxima! ;)");
                            c=1;
                            break;
                        default:
                            System.out.println("Caractere inválido, revalide sua resposta.");
                            x = pega.nextInt();
                            break;
                    }
                    }while(!((x>0)&&(x<6)));
                }while(c!=1);
                break;                
            case 8:
                for (int i = 0; i <10; i++) {
                    System.out.print("Insira o valor: ");
                    num[i] = pega.nextDouble();                    
                }
                for (int i = 9; i>=0 ; i--) {
                    System.out.println(num[i]);                    
                }
                break;                
            case 9:
                maior=0;
                for (int i = 0; i <10; i++) {
                    System.out.print("Insira o valor: ");
                    num[i] = pega.nextDouble();
                    if(i==0||num[i]>maior)
                        maior=num[i];
                }
                System.out.println("O maior valor é "+maior);
                break;                
            case 10:
                n1 = 0;
                for (int i = 0; i <10; i++) {
                    System.out.print("Insira o valor: ");
                    num[i] = pega.nextDouble();                    
                }
                System.out.println("Insira a constante");
                n1 = pega.nextDouble();
                for (int i = 0; i <10; i++) {
                    num[i] *= n1;                    
                }
                System.out.println("Não foi pedido para exibir... então é isso, minha gente, até a próxima! :)");                
                break;                
            /*case 11:
                n1 = 0;
                for (int i = 0; i <20; i++) {
                    if(i<10){
                        System.out.print("Insira o valor: ");
                        num[i] = pega.nextDouble();
                        if(i==9){
                                
                            System.out.print("Os valores do vetor 01 são:");
                        }
                    }
                    else{
                        System.out.print(num[i-10]+" ");                        
                    }
                                        
                }
                System.out.println("\nInsira a constante");
                n1= pega.nextDouble();
                for (int i = 0; i <20; i++) {
                    if(i<10){
                        num2[i] = num[i]*n1;
                        if(i==9)
                            System.out.print("Os valores do vetor 02 são:");
                    }
                    else{
                        System.out.print(num2[i-10]+" ");
                    }                    
                }
                System.out.println("");
                break;                
            case 12:
                System.out.println("Qual o tamanho do vetor");
                x = pega.nextInt();
                while(!(x>0&&x<21)){
                    System.out.println("Tamanho insuportado. Insira o tamanho do vetor entre 1 e 20, por favor.");
                    x = pega.nextInt();
                }
                for (int i = 0; i <x; i++) {
                    System.out.print("Insira o valor: ");
                    num[i] = pega.nextDouble();                    
                }
                do{
                    y=0;
                    System.out.println("Diga o valor que deseja consultar");
                    a = pega.nextDouble();
                    for (int i = 0; i <x; i++) {
                        if(num[i]==a){
                            System.out.println("Valor encontrado na posição "+i+" do vetor ou "+(i+1)+" na posição usual.");
                            break;
                        }
                        if(i==x-1)
                            System.out.println("Valor não encontrado");
                    }
                     System.out.println("\nDeseja efetuar novo cálculo? [S/N]");
                        conf = pega.next();
                        b=0;
                        //Garantir que só seja aceito S ou N.
                        do{
                        switch(conf){
                            case "N":
                                System.out.println("\nFoi um prazer! Até a próxima!");
                                y=1;
                                b=1;
                                break;
                            case "S":
                                 System.out.println("\nOk, então vamos continuar!\n");
                                 b=1;
                                 break;
                            default:
                                System.out.println("Caractere inválido, revalide sua resposta.");
                                conf = pega.next();
                                break;
                        }
                        }while(b!=1);
                }while(!(y==1));
                break;
            case 13:
                for (int i = 0; i <5; i++) {
                    System.out.println("Insira o nome 0"+(i+1));
                    nome[i] = pega.nextLine();
                    nome[i] = pega.nextLine();                     
                    do{
                    System.out.println("Insira a idade 0"+(i+1));
                    num[i] = pega.nextDouble();
                    }while(num[i]<=0);

                }
                for (int i = 0; i < 5; i++) 
                    System.out.println(nome[i]+" tem "+num[i]+" anos");
                break;                
            case 14:
                z=0;
                for (int i = 0; i < 10; i++) {
                    System.out.println("Diga o nome 0"+(i+1));
                    nome[i] = pega.nextLine();
                    nome[i] = pega.nextLine();
                    System.out.println("Diga o sexo 0"+(i+1));
                    sexo[i] = pega.nextLine();                    
                    b=0;
                    //Garantir que só seja aceito F ou M.
                    do{
                        switch(sexo[i]){
                            case "F":
                                sexo[i] = "Feminino";
                                b=1;
                                break;
                            case "M":
                                sexo[i] = "Masculino";
                                 b=1;
                                 break;
                            default:
                                System.out.println("Caractere inválido, revalide sua resposta. Digite F ou M");
                                sexo[i] = pega.nextLine();
                                break;
                        }
                    }while(b!=1);
                    do{
                    if(i<9)    
                        System.out.println("Insira a idade 0"+(i+1));
                    else
                        System.out.println("Insira a idade "+(i+1));
                    num[i] = pega.nextDouble();
                    if(num[i]>20){
                        oi[z] = i;
                        z++;
                    }
                    }while(num[i]<=0);
                }
                System.out.println("Pessoas com mais de 20 anos:\n");
                    for (int i = 0; i <z; i++) {
                        System.out.println("--------------------");
                        System.out.println("Nome: "+nome[oi[i]]+"\nIdade: "+num[oi[i]]+"\nSexo: "+sexo[oi[i]]);                        
                    }
                    System.out.println("=========================");
                    System.out.println("Número de pessoas listadas: "+z);
                    System.out.println("Porcentagem de pessoas listadas: "+(z*10)+"%");
                break;
            case 15:
                b=0;
                
                for (int i = 0; i <30; i++) {
                    if(i==10 || i==20){
                        System.out.println("");
                        x=29;    
                    }
                    if(i<10){
                        System.out.print("Insira o número "+(1+i)+": ");
                        num[i] = pega.nextDouble();
                        for (int j = 0; j <i; j++) {
                            if(num[i]<num[j]){
                                b=num[i];
                                num[i]=num[j];
                                num[j]=b;
                            }                        
                        }
                    }
                    else if(i<20){
                        System.out.print(num[i-10]+" ");
                    }
                    else{
                        System.out.print(num[x-i]+" ");
                    }
                    System.out.println("");
                }
                break;                
            case 16:
                nome[0] = pega.nextLine();
                for (int i = 0; i <10; i++) {
                    System.out.println("Insira o nome "+(i+1));
                    nome[i] = pega.nextLine();
                    System.out.println("Insira o sexo "+(i+1)+" [M/F]");
                    sexo[i] = pega.nextLine();                    
                    b=0;
                    //Garantir que só seja aceito F ou M.
                    do{
                        switch(sexo[i]){
                            case "F":
                                sexo[i] = "Feminino";
                                b=1;
                                break;
                            case "M":
                                sexo[i] = "Masculino";
                                 b=1;
                                 break;
                            default:
                                System.out.println("Caractere inválido, revalide sua resposta. Digite F ou M");
                                sexo[i] = pega.nextLine();
                                break;
                        }
                    }while(b!=1);                    
                }
                //Em ordem alfabética
                Arrays.sort(nome);
                for (int i = 0; i < 10; i++) {
                    System.out.println("----------------------");
                    System.out.println("Nome: "+nome[i]);
                    System.out.println("Sexo: "+sexo[i]);                    
                }
                System.out.println("\n--------Parte 2--------");
                for (int i = 0; i <20; i++) {
                    System.out.println("Insira o nome "+(i+1));
                    nome[i] = pega.nextLine();
                    if(i>0)
                        nome[i] = pega.nextLine();
                    System.out.println("Insira o sexo "+(i+1)+" [M/F]");
                    sexo[i] = pega.nextLine();                    
                    b=0;
                    //Garantir que só seja aceito F ou M.
                    do{
                        switch(sexo[i]){
                            case "F":
                                sexo[i] = "Feminino";
                                b=1;
                                break;
                            case "M":
                                sexo[i] = "Masculino";
                                 b=1;
                                 break;
                            default:
                                System.out.println("Caractere inválido, revalide sua resposta. Digite F ou M");
                                sexo[i] = pega.nextLine();
                                break;
                        }
                    }while(b!=1);
                    do{
                    System.out.println("Insira a idade 0"+(i+1));
                    num[i] = pega.nextDouble();
                    }while(num[i]<=0);
                    for (int j = 0; j <i; j++) {
                        if(num[i]<num[j]){
                            b=num[i];
                            num[i]=num[j];
                            num[j]=b;
                            
                            conf = nome[i];
                            nome[i] = nome[j];
                            nome[j] = conf;
                            
                            conf = sexo[i];
                            sexo[i] = sexo[j];
                            sexo[j] = conf;
                        }                        
                    }
                }
                for (int i = 19; i>=0; i--) {
                     System.out.println("---------------------");
                     System.out.println("Nome: "+nome[i]);
                     System.out.println("Sexo: "+sexo[i]);
                     System.out.println("Idade: "+num[i]);
                }                
                break;                
            case 17:
                for (int i = 0; i <3; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.println("Insira o número");
                        matrix[i][j] = pega.nextDouble();                        
                    }                    
                }
                System.out.println("-----");
                for (int i = 0; i <3; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print((int)matrix[i][j]+" ");                    
                    }
                    System.out.println("");
                }
                break;                
            case 18:
                names[0][0] = pega.nextLine();
                for (int i = 0; i <2; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.println("Insira o nome");
                        names[i][j] = pega.nextLine();                        
                    }                    
                }
                System.out.println("-----");
                for (int i = 0; i <2; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(names[i][j]+" ");                    
                    }
                    System.out.println("");
                }
                break;                
            case 19:
                System.out.println("Projeto próprio");
                break;                
            case 20:
                System.out.println("Projeto próprio");
                break;*/            
            default: 
                System.out.println("Operação inválida, tente novamente.");
                break;
        }
    }while(p!=1);
  }//mmc é um método que calcula os denominadores de forma recursiva. Exemplo: caso p (número digitado) seja 4. Os denominadores serão 2,3,4,5. O algoritmo calcula o mmc de 2 e 3 que é 6; o mmc entre 6 e 4, que é 12; e 12 com 5 que é 60. Ele faz isso do mmc do anterior com o próximo, porém, o próximo tem que ser primo.
    public static int mmc(int k,int x, int n){
        //K é um contador para determinar a parada, isto é, quando este for igual a n
        //N é o valor digitado pelo usuário para determinar até onde quer a sequência
        //X é o primeiro operando do MMC
        if(k==n+1) return x;//fim do cálculo do mmc.
        int l = k+1;//segundo operando do MMC.
        if(x%l==0) return mmc(k+1,x,n);//O algoritmo entende que o mmc do primeiro operando é igual o do segundo. Ex: mmc(60,6).
        int[] primos = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47};//Todos os primos até 50. 
        int j;
        //Garante que o segundo operando é primo
        do{
        j=0;    
        for (int i = 0; i < primos.length; i++) {
            if(l%primos[i]==0&&l!=primos[i]){
                l/=primos[i];
                j=1;//garante que o laço só seja encerrado quando l for um primo. Quando l for primo, ele não entrará nesse laço e como j é setado a cada laço, o while será desbloqueado.
                break;
            }            
        }
        }while(j==1);
        x *=l;//multiplicado o mmc do primeiro operando com o do segundo, para ter o mmc do segundo operando.
        return mmc(k+1,x,n);// avança para o próximo mmc.        
    }
    //simplifica os número para que mantenham a mesma proporção, porém com menos dígitos. A lógica é simples. Enquanto houver primos quem dividam o numerador e o denominador, eles serão divididos. Porém, esse algoritmo é limitados a simplificar os compostos pelos 15 primeiros primos. Números acima de 2809 não serão completamente simplificados.
    public static int simplificar(int a, int b, int c){
        
        int j;
        int[] primos = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47};//Todos os primos até 50.
        do{
        j=0;    
        for (int i = 0; i < primos.length; i++) {
            if(a%primos[i]==0&&b%primos[i]==0){
                a/=primos[i];
                b/=primos[i];
                j=1;
                break;
            }            
        }
        }while(j==1);
        //como o método só retorna um número de cada vez, o operador deve escolher se quer simplificar o numerador ou o denominador.
        if(c==1)
            return a;
        else
            return b;
    }
}
