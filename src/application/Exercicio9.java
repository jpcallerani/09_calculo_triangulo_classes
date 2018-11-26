package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Exercicio9 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		// -----------------------------------------------------
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		// -----------------------------------------------------
		System.out.println("Digite as medidas do tri�ngulo X:");
		x.a = in.nextDouble();
		x.b = in.nextDouble();
		x.c = in.nextDouble();
		System.out.println("Digite as medidas do tri�ngulo Y:");
		y.a = in.nextDouble();
		y.b = in.nextDouble();
		y.c = in.nextDouble();
		// -----------------------------------------------------
		double areaX = x.calculaArea();
		double areaY = y.calculaArea();
		// -----------------------------------------------------
		System.out.printf("�rea do tri�ngulo X: %.4f%n", areaX);
		System.out.printf("�rea do tri�ngulo Y: %.4f%n", areaY);
		// -----------------------------------------------------
		if (areaX > areaY) {
			System.out.println("Tri�ngulo X � maior!!");
		} else {
			System.out.println("Tri�ngulo Y � maior!!");
		}
	}

}
