package com.ejemplo.calculadora;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public double suma(double a, double b) {
		return a+b;
	}
	
	public double restar(double a, double b) {
		return a - b;
		}
	public double multiplicar(double a, double b) {
		return a * b;
	}
	public double dividir(double a, double b) {
		if (b == 0) {
			throw new IllegalArgumentException("No se puede dividir entre cero");
		}
			return a / b;
		}
}
