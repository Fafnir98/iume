package iume;

import java.util.Random;
import java.util.Scanner;

public class Copa {
	public static byte primera() {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		byte equipo = 0;
		byte dado = (byte) (rd.nextInt(100) + 1);
		if (dado < 16) {
			equipo += 0;
		}
		else if (dado < 40) {
			equipo += 1;
		}
		else if (dado < 60) {
		equipo += 2;
		}
		else if (dado < 80) {
			equipo += 3;
		}
		else if (dado < 91) {
			equipo += 4;
		}
		else if (dado < 95) {
			byte bonus = (byte) (rd.nextInt(4) + 1);
			equipo += (byte) (4 + bonus);
		}
		else {
			byte bonus = (byte) (rd.nextInt(4) + 1);
			equipo += (byte) (5 + bonus);
		}
		return equipo;
	}
	public static byte segunda() {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		byte equipo = 0;
		byte dado = (byte) (rd.nextInt(100) + 1);
		if (dado < 30) {
			equipo += 0;
		}
		else if (dado < 65) {
			equipo += 1;
		}
		else if (dado < 95) {
		equipo += 2;
		}
		else if (dado < 100) {
			equipo += 3;
		}
		else {
			equipo += 4;
		}
		return equipo;
	}
	public static byte tercera() {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		byte equipo = 0;
		byte dado = (byte) (rd.nextInt(100) + 1);
		if (dado < 36) {
			equipo += 0;
		}
		else if (dado < 90) {
			equipo += 1;
		}
		else if (dado < 100) {
			equipo += 2;
		}
		else {
			equipo += 3;
		}
		return equipo;
	}
	public static byte cuarta() {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		byte equipo = 0;
		byte dado = (byte) (rd.nextInt(100) + 1);
		if (dado < 46) {
			equipo += 0;
		}
		else if (dado < 95) {
			equipo += 1;
		}
		else if (dado < 100) {
			equipo += 2;
		}
		else {
			equipo += 3;
		}
		return equipo;
	}

}
