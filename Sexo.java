import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Sexo {
	public static void main(String[] args){
            Scanner pega = new Scanner(System.in);
            String sex =  new String();
            String str =  new String();

            System.out.print("Determine o sexo: ");
            sex = pega.next();

            if(null == sex) {
                System.out.println("Caractere Inv�lido.");
            }
            else switch (toUpperCase(sex)) {
                case "H":
                    System.out.println("A pessoa � Homem.");
                    break;
                case "F":
                    System.out.println("A pessoa � Mulher.");
                    break;
                default:
                    System.out.println("Caractere Inv�lido.");
                    break;
            }		
        }

}
