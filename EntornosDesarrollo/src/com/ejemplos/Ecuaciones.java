package com.ejemplos;

public class Ecuaciones {
	public static void main(String[] args) {
		System.out.println("Las soluciones de ax2+bx+c = 0:");
		double a = 1;
		double b = 1;
		double c = -4;
		double b2 = b*b;
		double tmp_4ac = 4*a*c;
		double b2_4ac = b2 - tmp_4ac;
		double laRaiz = Math.pow(b2_4ac, 1/2);
		double x1 = -b + laRaiz/2*a;
		double x2 = -b - laRaiz/2*a;
		System.out.print("   a = " + a + "; b = " + b + "; c = " + c);
		System.out.println("   x = " + x1);
		System.out.print("   a = " + a + "; b = " + b + "; c = " + c);
		System.out.println("   x = " + x2);
		double v1 = (a*x1*x1)+(b*x1)+c;
		double v2 = (a*x2*x2)+(b*x2)+c;
		System.out.println("ax2+bx+c = " + v1 + "!");
		System.out.println("ax2+bx+c = " + v2 + "!");
	}
}
