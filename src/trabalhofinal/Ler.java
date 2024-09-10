package trabalhofinal;

import java.util.Locale;
import java.util.Scanner;

public class Ler {
	
	public static int lerInt(String msg) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		System.out.println(msg);
		return input.nextInt();
	}
	public static String lerString(String msg) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		System.out.println(msg);
		return input.nextLine();
		
	}
	public static double lerDouble(String msg) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		System.out.println(msg);
		return input.nextDouble();
	}
}
