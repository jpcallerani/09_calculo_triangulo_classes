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
		System.out.println("Digite as medidas do triângulo X:");
		x.a = in.nextDouble();
		x.b = in.nextDouble();
		x.c = in.nextDouble();
		System.out.println("Digite as medidas do triângulo Y:");
		y.a = in.nextDouble();
		y.b = in.nextDouble();
		y.c = in.nextDouble();
		// -----------------------------------------------------
		double areaX = x.calculaArea();
		double areaY = y.calculaArea();
		// -----------------------------------------------------
		System.out.printf("Área do triângulo X: %.4f%n", areaX);
		System.out.printf("Área do triângulo Y: %.4f%n", areaY);
		// -----------------------------------------------------
		if (areaX > areaY) {
			System.out.println("Triângulo X é maior!!");
		} else {
			System.out.println("Triângulo Y é maior!!");
		}
	}

}
