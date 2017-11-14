/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MeiosTransporte;

import static java.lang.Thread.sleep;
import java.util.Scanner;

/**
 *
 * @author Jairo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner pega = new Scanner(System.in);
        Veiculo   generico1   = new Veiculo();
        Bicicleta generico2   = new Bicicleta();
        Bicicleta user1       = new Bicicleta();
        Automovel generico3   = new Automovel();
        Carro     generico4   = new Carro();
        Carro     user2       = new Carro();
        Moto      generico5   = new Moto();
        Moto      user3       = new Moto();
        String str;
        int x,k,s,l = 0;
        
        
        System.out.println("Olá, caro usuário! Seja bem-vindo. A seguir você vai personalizar alguns meios de transporte, ok? Vamos começar!");
        System.out.println("");
        
        System.out.println("Você tem uma bicicleta.");
        System.out.println("Qual a sua marca?");
        str = pega.nextLine();
        user1.setMarca(str);
        System.out.println("Quanto ao modelo");
        str = pega.nextLine();
        user1.setModelo(str);
        System.out.println("Sua bicicleta tem bagageiro?[S/N]");
        str = pega.nextLine().toLowerCase();
        if("s".equals(str))
            user1.setBagageiro(true);
        System.out.println("Quanto ao número de marchas?");
        x = pega.nextInt();
        user1.setNumMarchas(x);
        System.out.println("");
        
        System.out.println("Agora você tem um carro.");
        System.out.println("Qual a sua marca?");
        str = pega.nextLine();
        str = pega.nextLine();
        user2.setMarca(str);
        System.out.println("Quanto ao modelo");
        str = pega.nextLine();
        user2.setModelo(str);
        System.out.println("Quanto ao número de portas?");
        x = pega.nextInt();
        user2.setQtdPortas(x);
        System.out.println("Quanto à potência do motor?");
        x = pega.nextInt();
        user2.setPotenciaDoMotor(x);
        System.out.println("");        
        
        System.out.println("Agora você tem uma moto.");
        System.out.println("Qual a sua marca?");
        str = pega.nextLine();
        str = pega.nextLine();
        user3.setMarca(str);
        System.out.println("Quanto ao modelo");
        str = pega.nextLine();
        user3.setModelo(str);
        System.out.println("Sua moto tem partida elétrica?[S/N]");
        str = pega.nextLine().toLowerCase();
        if("s".equals(str))
            user3.setPartidaEletrica(true);
        System.out.println("Quanto à potência do motor?");
        x = pega.nextInt();
        user3.setPotenciaDoMotor(x);
        System.out.println("");        
        
        System.out.println("------------------------------------");
        System.out.println("Veja agora uma comparação dos seus veículos com veículos genéricos");
        System.out.println("");
        System.out.println("");
        generico1.imprimirInformacoes();
        System.out.println("");
        generico2.imprimirInformacoes();
        System.out.println("");
        generico3.imprimirInformacoes();
        System.out.println("");
        generico4.imprimirInformacoes();
        System.out.println("");
        generico5.imprimirInformacoes();
        System.out.println("");
        
        System.out.println("\n--------------------------");
        System.out.println("");
        System.out.println("Seus veículos");
        System.out.println("");
        user1.imprimirInformacoes();
        System.out.println("");
        user2.imprimirInformacoes();
        System.out.println("");
        user3.imprimirInformacoes();
        System.out.println("");
        System.out.println("");
        System.out.println("-----------------------------");
        do{
            l=k=x=0;
            System.out.println("Caro usuário, você deseja utilizar algum dos seus veículos?\n1 - BICICLETA\n2 - CARRO\n3 - MOTO\n4 - DORMIR (sair do programa)");
            s = pega.nextInt();
            switch(s){
                case 1:
                    System.out.println("Ok, bike, então.");
                    do{
                        System.out.println("Colocando capacete");
                        sleep(3000);
                        System.out.println("Montando na bicicleta");
                        sleep(2000);
                        System.out.println("Deseja ir a qual velocidade?");
                        x = pega.nextInt();
                        user1.acelerar(x);
                        do{
                            l=0;
                            System.out.println("Ok. Se quiser ir mais rápido, digite 1, freiar: 2, se já chegou ao seu destino, digite 3. Para trocar de veículo, você precisa parar em algum lugar.");
                            k = pega.nextInt();
                            switch(k){
                                case 1:
                                    System.out.println("Quanto quer acelerar?");
                                    x = pega.nextInt();
                                    user1.acelerar(x);
                                    break;
                                case 2:
                                    System.out.println("Quanto quer frear?");
                                    x = pega.nextInt();
                                    user1.frear(x);
                                    break;
                                case 3:
                                    l=3;
                                    user1.setVelocidade(0);
                                    System.out.println("Tirando capacete");
                                    sleep(3000);
                                    System.out.println("Saindo da bicicleta");
                                    sleep(2000);
                                    System.out.println("Deseja continuar no passeio, digite 1, ir pra casa, 2.");
                                    x = pega.nextInt();
                                    switch(x){
                                        case 1:
                                            System.out.println("Ok, então vamos aproveitar mais essa bela paisagem :)");
                                            k=2;
                                            break;
                                        case 2:
                                            System.out.println("Voltaremos ao lar.");
                                            sleep(5000);
                                            k=3;
                                            break;
                                    }
                                    break;
                            }
                            }while(l!=3);
                        }while(k!=3);
                    break;
                case 2:
                    System.out.println("Ok, vamos de carrão.");
                    do{
                        System.out.println("Colocando cinto de segurança");
                        sleep(3000);
                        System.out.println("Tirando o carro");
                        sleep(10000);
                        System.out.println("Deseja ir a qual velocidade?");
                        x = pega.nextInt();
                        user1.acelerar(x);
                        do{
                            l=0;
                            System.out.println("Ok. Se quiser ir mais rápido, digite 1, freiar: 2, se já chegou ao seu destino, digite 3. Para trocar de veículo, você precisa parar em algum lugar.");
                            x = pega.nextInt();
                            switch(x){
                                case 1:
                                    System.out.println("Quanto quer acelerar?");
                                    x = pega.nextInt();
                                    user1.acelerar(x);
                                    break;
                                case 2:
                                    System.out.println("Quanto quer frear?");
                                    x = pega.nextInt();
                                    user1.frear(x);
                                    break;
                                case 3:
                                    l=3;
                                    user1.setVelocidade(0);
                                    System.out.println("Estacionando o carro.");
                                    sleep(8000);
                                    System.out.println("Tirando o cinto de segurança.");
                                    sleep(2000);
                                    System.out.println("Deseja continuar no passeio, digite 1, ir pra casa, 2.");
                                    x = pega.nextInt();
                                    switch(x){
                                        case 1:
                                            System.out.println("Ok, então vamos aproveitar mais essa bela paisagem :)");
                                            k=2;
                                            break;
                                        case 2:
                                            System.out.println("Voltaremos ao lar.");
                                            k=3;
                                            sleep(5000);                              
                                    }
                                    break;
                            }
                            }while(l!=3);
                        }while(k!=3);
                    break;
                case 3:
                    System.out.println("Pegar gatinha, né? Motoca, papai!.");
                    do{
                        System.out.println("Colocando o capacete");
                        sleep(3000);
                        System.out.println("Tirando a moto");
                        sleep(5000);
                        System.out.println("Deseja ir a qual velocidade?");
                        x = pega.nextInt();
                        user1.acelerar(x);
                        do{
                            l=0;
                        System.out.println("Ok. Se quiser ir mais rápido, digite 1, freiar: 2, se já chegou ao seu destino, digite 3. Para trocar de veículo, você precisa parar em algum lugar.");
                        x = pega.nextInt();
                        switch(x){
                            case 1:
                                System.out.println("Quanto quer acelerar?");
                                x = pega.nextInt();
                                user1.acelerar(x);
                                break;
                            case 2:
                                System.out.println("Quanto quer frear?");
                                x = pega.nextInt();
                                user1.frear(x);
                                break;
                            case 3:
                                l=3;
                                user1.setVelocidade(0);
                                System.out.println("Estacionando a moto.");
                                sleep(5000);
                                System.out.println("Tirando o capacete.");
                                sleep(2000);
                                System.out.println("Deseja continuar no passeio, digite 1, ir pra casa, 2.");
                                x = pega.nextInt();
                                switch(x){
                                    case 1:
                                        System.out.println("Ok, então vamos aproveitar mais essa bela paisagem :)");
                                        k=2;
                                        break;
                                    case 2:
                                        System.out.println("Voltaremos ao lar.");
                                        k=3;
                                        sleep(5000);                              
                                }
                                break;
                        }
                        }while(l!=3);
                    }while(k!=3);
                    break;
                case 4:
                    System.out.println("\nTenha um bom sono, muito obrigado por tudo. Até a Próxima. Tchau!");
                    break;
            }
        }while(s!=4);    
    }
    
}
