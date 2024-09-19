// IMPORTS
import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		// INSTANTIATE
		Scanner sc = new Scanner(System.in);

		// DECLARATE
		int s;
		int e;

		// COLLECT DATA
		System.out.print("START : ");
		s = sc.nextInt();
		System.out.print("END : ");
		e = sc.nextInt();

		// OUTPUT
		for (int i = s; i <= e; i++) {
			if (i %2 == 0){
				System.out.println(i);
			}	
		}
	}
}
