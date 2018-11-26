package entities;

public class Triangulo {
	public double a;
	public double b;
	public double c;

	/**
	 * Calcula área do triângulo.
	 * 
	 * @return area
	 */
	public double calculaArea() {
		double p = (this.a + this.b + this.c) / 2.0;
		return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
	}
}
