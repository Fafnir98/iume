package iume;

import java.util.Random;
import java.util.Scanner;

public class NivelMedio {
	public static byte local() {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		byte equipo1 = 0;
		byte dado1 = (byte) (rd.nextInt(100) + 1);
		if (dado1 < 20) {
			equipo1 += 0;
		}
		else if (dado1 < 46) {
			equipo1 += 1;
		}
			else if (dado1 < 70) {
			equipo1 += 2;
		}
		else if (dado1 < 86) {
			equipo1 += 3;
		}
		else if (dado1 < 94) {
			equipo1 += 4;
		}
		else if (dado1 < 98) {
			byte bonus = (byte) (rd.nextInt(4) + 1);
			equipo1 += (byte) (4 + bonus);
		}
		else {
			byte bonus = (byte) (rd.nextInt(4) + 1);
			equipo1 += (byte) (5 + bonus);
		}
		return equipo1;
	}
	public static byte visitante() {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		byte equipo2 = 0;
		byte dado2 = (byte) (rd.nextInt(100) + 1);
		if (dado2 < 35) {
			equipo2 += 0;
		}
		else if (dado2 < 70) {
			equipo2 += 1;
		}
			else if (dado2 < 90) {
			equipo2 += 2;
		}
		else if (dado2 < 96) {
			equipo2 += 3;
		}
		else if (dado2 < 100) {
			equipo2 += 4;
		}
		else {
			byte bonus = (byte) (rd.nextInt(4) + 1);
			equipo2 += (byte) (4 + bonus);
		}
		return equipo2;
	}

}
