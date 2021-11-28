package iume;
import java.util.Scanner;
import java.util.Random;

public class Neutral {
	public static String resultado() {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		byte equipo1 = 0;
		byte equipo2 = 0;
		byte dado1 = (byte) (rd.nextInt(100) + 1);
		if (dado1 == 1) {
			equipo2 += 1;
		}
		else if (dado1 < 27) {
			equipo1 += 0;
		}
		else if (dado1 < 58) {
			equipo1 += 1;
		}
			else if (dado1 < 81) {
			equipo1 += 2;
		}
		else if (dado1 < 92) {
			equipo1 += 3;
		}
		else if (dado1 < 98) {
			equipo1 += 4;
		}
		else if (dado1 < 100) {
			byte bonus = (byte) (rd.nextInt(4) + 1);
			equipo1 += (byte) (4 + bonus);
		}
		else {
			byte bonus = (byte) (rd.nextInt(4) + 1);
			equipo1 += (byte) (5 + bonus);
		}
		byte dado2 = (byte) (rd.nextInt(100) + 1);
		if (dado2 == 1) {
			equipo1 += 1;
		}
		else if (dado2 < 27) {
			equipo2 += 0;
		}
		else if (dado2 < 58) {
			equipo2 += 1;
		}
			else if (dado2 < 81) {
			equipo2 += 2;
		}
		else if (dado2 < 92) {
			equipo2 += 3;
		}
		else if (dado2 < 98) {
			equipo2 += 4;
		}
		else if (dado2 < 100) {
			byte bonus = (byte) (rd.nextInt(4) + 1);
			equipo2 += (byte) (4 + bonus);
		}
		else {
			byte bonus = (byte) (rd.nextInt(4) + 1);
			equipo2 += (byte) (5 + bonus);
		}
		System.out.println("El resultado es " + equipo1 + "-" + equipo2);
		System.out.println("¿Quieres simular otro partido con este sistema?");
		char respuesta = sc.nextLine().toUpperCase().charAt(0);
		if (respuesta == 'S') {
			Neutral.resultado();
			return equipo1 + "-" + equipo2;
		}
		else
		return equipo1 + "-" + equipo2;
		
		
		
	}
		
}
