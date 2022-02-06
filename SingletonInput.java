package it.unipa.prg.es5;

import java.util.Scanner;
public class SingletonInput {
	private static SingletonInput instance;
	Scanner scanner;

	private SingletonInput() {
	 	scanner = new Scanner(System.in);
	}

	public static SingletonInput getInstance() {
		if (instance == null) {
			instance = new SingletonInput();
		}
		return instance;
	}

	public int leggiInt(String msg) {
		int r;
		System.out.print(msg);
		r = scanner.nextInt();
		return r;
	}

	public String leggiString(String msg) {
		String r;
		System.out.print(msg);
		r = scanner.next();
		return r;
	}

	public long leggiLong(String msg) {
		long r;
		System.out.print(msg);
		r = scanner.nextLong();
		return r;
	}

	public double leggiDouble(String msg) {
		double r;
		System.out.print(msg);
		r = scanner.nextDouble();
		return r;
	}

	public float leggiFloat(String msg) {
		float r;
		System.out.print(msg);
		r = scanner.nextFloat();
		return r;
	}
}