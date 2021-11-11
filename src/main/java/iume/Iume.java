package iume;

import java.util.Scanner;
import java.util.Random;

public class Iume {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		Scanner lector2 = new Scanner(System.in);
		Scanner lector3 = new Scanner(System.in);
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
			//Campo neutral (aka no hay ventaja por local y visitante ni diferencia de categoría)
			byte dado = (byte) (rd.nextInt(100) + 1);
			//Resultado primer equipo
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
			//Resultado segundo equipo
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
			
			case ('N'):
				System.out.println("¿Qué nivel tiene el equipo local? (Top, Alto, Medio o Bajo)");
				char lnivel = lector3.nextLine().charAt(0);
				System.out.println("¿Qué nivel tiene el equipo visitante? (Top, Alto, Medio o Bajo)");
				char vnivel = lector3.nextLine().charAt(0);
				//Resultado equipo local
				switch (lnivel) {
				// Nivel Top
				case ('T'):
					dado = (byte) (rd.nextInt(100) + 1);
				if (dado < 16) {
					rlocal = 0;
				}
				else if (dado < 40) {
					rlocal = 1;
				}
				else if (dado < 60) {
					rlocal = 2;
				}
				else if (dado < 80) {
					rlocal = 3;
				}
				else if (dado < 91) {
					rlocal = 4;
				}
				else if (dado < 96) {
					byte bonus = (byte) (rd.nextInt(4) + 1);
					rlocal = (byte) (4 + bonus);
				}
				else {
					byte bonus = (byte) (rd.nextInt(4) + 1);
					rlocal = (byte) (5 + bonus);
				}
				break;
				default:
					System.out.println("Work in progress, pronto estará listo :)");
				}
				// Resultado equipo visitante
				switch (vnivel) {
				// Nivel Top
				case ('T'):
					dado2 = (byte) (rd.nextInt(100) + 1);
				if (dado2 < 26) {
					rvisitante = 0;
				}
				else if (dado2 < 50) {
					rvisitante = 1;
				}
				else if (dado2 < 75) {
					rvisitante = 2;
				}
				else if (dado2 < 90) {
					rvisitante = 3;
				}
				else if (dado2 < 99) {
					rvisitante = 4;
				}
				else {
					byte bonus = (byte) (rd.nextInt(4) + 1);
					rvisitante = (byte) (4 + bonus);
				}
				break;
				default:
					System.out.println("Work in progress, pronto estará listo :)");
				}
				System.out.println("El resultado es " + rlocal + "-" + rvisitante);
				break;
			
			default:
				System.out.println("Work in progress, pronto estará listo :)");
				break;
			}
		}
		
		
	}

}
