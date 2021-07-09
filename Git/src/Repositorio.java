import java.util.Scanner;

public class Repositorio {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un numero");
		int n1 = sc.nextInt();
		System.out.println("Introduce un numero");
		int n2 = sc.nextInt();
		
		System.out.println("La suma es de: " + (n1 + n2));
	}

}
