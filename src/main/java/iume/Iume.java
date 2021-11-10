package iume;

import java.util.Scanner;
import java.util.Random;

public class Iume {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		Scanner lector2 = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("¿Cuántos partidos quieres simular?");
		byte partidos = lector.nextByte();
		System.out.println("¿Son en campo neutral?");
		char neutral = lector2.nextLine().charAt(0);
		byte rlocal = 0;
		byte rvisitante = 0;
		for (byte i = 0; i < partidos; ++i) {
			switch (neutral) {
			case ('S'):
			
			byte dado = (byte) (rd.nextInt(100) + 1);
			if (dado < 27) {
				rlocal = 0;
			}
			else if (dado < 58) {
				rlocal = 1;
			}
			else if (dado < 81) {
				rlocal = 2;
			}
			else if (dado < 92) {
				rlocal = 3;
			}
			else if (dado < 98) {
				rlocal = 4;
			}
			else if (dado < 100) {
				byte bonus = (byte) (rd.nextInt(4) + 1);
				rlocal = (byte) (4 + bonus);
			}
			else {
				byte bonus = (byte) (rd.nextInt(4) + 1);
				rlocal = (byte) (5 + bonus);
			}
			byte dado2 = (byte) (rd.nextInt(100) + 1);
			if (dado2 < 27) {
				rvisitante = 0;
			}
			else if (dado2 < 58) {
				rvisitante = 1;
			}
			else if (dado2 < 81) {
				rvisitante = 2;
			}
			else if (dado2 < 92) {
				rvisitante = 3;
			}
			else if (dado2 < 98) {
				rvisitante = 4;
			}
			else if (dado2 < 100) {
				byte bonus = (byte) (rd.nextInt(4) + 1);
				rvisitante = (byte) (4 + bonus);
			}
			else {
				byte bonus = (byte) (rd.nextInt(4) + 1);
				rvisitante = (byte) (5 + bonus);
			}
			System.out.println("El resultado es " + rlocal + "-" + rvisitante);
			break;
			default:
				System.out.println("Work in progress, pronto estará listo :)");
			}
		}
		
		
	}

}
