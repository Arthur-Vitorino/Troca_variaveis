package main;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um valor para X: ");
		int x = scanner.nextInt();
		System.out.print("Digite um valor para Y: ");
		int y = scanner.nextInt();
		
		System.out.println("Antes");
		System.out.print("X = "+x);
		System.out.println(" Y = "+y);
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("Depois");
		System.out.print("X = "+x);
		System.out.println(" Y = "+y);
		
	}
	
}
