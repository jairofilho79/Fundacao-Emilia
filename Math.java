import static java.lang.Math.cos;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
import static java.lang.Math.tan;
import java.util.Scanner;

public class Math {
	public static void main(String[] args){
		Scanner pega = new Scanner(System.in);
		int ang = 60,n=0;
		
                System.out.println("O Seno de 60º é: "+sin(60)+"\n O Cosseno de 60º é: "+cos(60)+"\nA tangente de 60º é: "+tan(60));

                System.out.println("Digite um número inteiro: ");
                n = pega.nextInt();

                System.out.println("A raiz quadrada de "+n+" é "+sqrt(n)+"\nE seu quadrado é "+pow(n,2));
	}

}
