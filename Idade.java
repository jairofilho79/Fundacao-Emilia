import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		Scanner pega = new Scanner(System.in);
int id[] = new int[3];
int maior =0,soma=0;
double media=0.0;

for (int i=1;i<4;i++) {
 System.out.println("Digite a idade "+i);
id[i-1] = pega.nextInt();
soma += id[i-1];
if(id[i-1]>maior){
	maior = id[i-1];
}
} 
media = soma/3;
System.out.println("A maior idade é: "+maior+"\nA soma das idades é: "+soma+"\nA média das idades é: "+media); 
}
}
