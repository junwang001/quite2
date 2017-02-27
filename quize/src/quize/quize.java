package quize;

import java.util.Scanner;

public class quize {

	public static void main(String[] args) {
		float a;
		Scanner  sc=new Scanner(System.in);
		System.out.println("initial tuition");
		float b = sc.nextFloat();
		System.out.println("please enter percentage rate");
		float rate = sc.nextFloat();
		a=b*(1+rate);
		System.out.println("rate is"+rate+"/n"+"tuition cost is"+a);

	}

}
