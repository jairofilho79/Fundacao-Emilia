import java.util.Scanner;
public class Somar {
	public static void main(String[] args) {
        Scanner pega = new Scanner(System.in);
		double n1 = 0;
		double n2 = 0;
		double soma = 0;
                boolean it = false;
		do {
                    System.out.println("Digite um INTEIRO");
                    n1 = pega.nextDouble();
                    it = Inteiro(n1);
                } while(it==false);
                             
                System.out.println("Digite um Double");
                n2 = pega.nextDouble();
                
                soma = n1+n2;
                System.out.println("A soma é: "+soma);
        }
        public static boolean Inteiro(double num) {
		int aux = (int)num;
		return (((double)aux) == num);
}

}
